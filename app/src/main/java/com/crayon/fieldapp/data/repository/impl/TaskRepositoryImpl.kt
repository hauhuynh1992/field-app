package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.JobDao
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.request.*
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.remote.response.TaskType
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.getCurrentDateTime
import com.crayon.fieldapp.utils.toTimeString
import okhttp3.MultipartBody

class TaskRepositoryImpl(
    private val apiService: ApiService,
    private val jobDao: JobDao
) : TaskRepository {

    override suspend fun getPicTasks(jobId: String): LiveData<Resource<List<TaskResponse>>> {
        return object : NetworkBoundNoCacheResource<List<TaskResponse>>() {
            override suspend fun createCallAsync(): List<TaskResponse> {
                return apiService.getPicTasks(jobId.toInt()).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getTodayPicAttendances(
    ): LiveData<Resource<List<TaskResponse>>> {
        return object : NetworkBoundNoCacheResource<List<TaskResponse>>() {
            override suspend fun createCallAsync(): List<TaskResponse> {
                val startTime = getCurrentDateTime().toTimeString("yyyy-MM-dd")
                val endTime = getCurrentDateTime().toTimeString("yyyy-MM-dd")
                return apiService.getPicTasks(
                    startTime = startTime,
                    endTime = endTime,
                    type = TaskType.TIME_KEEPING.value
                ).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicReportByProject(
        projectId: List<String>,
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<TaskResponse>>> {
        return object : NetworkBoundNoCacheResource<List<TaskResponse>>() {
            override suspend fun createCallAsync(): List<TaskResponse> {
                return apiService.getPicTasks(
                    startTime = startTime,
                    endTime = endTime,
                    type = TaskType.TIME_KEEPING.value
                ).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicReportByTime(
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<TaskResponse>>> {
        return object : NetworkBoundNoCacheResource<List<TaskResponse>>() {
            override suspend fun createCallAsync(): List<TaskResponse> {
                return apiService.getPicTasks(
                    startTime = startTime,
                    endTime = endTime,
                    type = TaskType.TIME_KEEPING.value
                ).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun uploadImage(
        taskId: String,
        notes: String?,
        file1: MultipartBody.Part,
        file2: MultipartBody.Part,
        file3: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.uploadAttachments(
                    taskId = taskId, file1 = file1, file2 = file2, file3 = file3
                )
            }

        }.build().asLiveData()
    }

    override suspend fun uploadImage(
        taskId: String,
        notes: String?,
        file1: MultipartBody.Part,
        file2: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.uploadAttachments(taskId = taskId, file1 = file1, file2 = file2)
            }

        }.build().asLiveData()
    }

    override suspend fun uploadImage(
        taskId: String,
        notes: String?,
        file1: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.uploadAttachments(taskId = taskId, file1 = file1, notes = notes)
            }

        }.build().asLiveData()
    }

    override suspend fun getManagementTasks(
        agencyId: String,
        jobId: String
    ): LiveData<Resource<List<TaskResponse>>> {
        return object : NetworkBoundNoCacheResource<List<TaskResponse>>() {
            override suspend fun createCallAsync(): List<TaskResponse> {
                return apiService.getManagementTasks(agencyId, jobId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getManagementTasksByFilter(
        agencyId: String,
        projectId: String?,
        storeId: String?,
        type: Int?,
        startTime: String?,
        endTime: String?,
        skip: Int,
        take: Int
    ): Resource<List<TaskResponse>> {
        val result = apiService.getManagementTasks(
            agencyId = agencyId,
            project = projectId,
            store = storeId,
            startTime = startTime,
            endTime = endTime,
            type = type,
            skip = skip,
            take = take
        ).data!!
        return Resource.success(result)
    }

    override suspend fun getPicTask(taskId: String): Resource<TaskResponse> {
        return Resource.success(apiService.getPicTask(taskId))
    }

    override suspend fun removeTask(
        agencyId: String,
        taskId: String
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.removeTask(agencyId, taskId)
            }

        }.build().asLiveData()
    }

    override suspend fun getManagementTask(taskId: String): LiveData<Resource<TaskResponse>> {
        return object : NetworkBoundNoCacheResource<TaskResponse>() {
            override suspend fun createCallAsync(): TaskResponse {
                return apiService.getManagementTask(taskId)
            }

        }.build().asLiveData()
    }

    override suspend fun checkIn(
        taskId: String,
        file: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.checkIn(
                    taskId,
                    file = file
                )
            }

        }.build().asLiveData()
    }

    override suspend fun checkOut(
        taskId: String,
        file: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.checkOut(
                    taskId,
                    file = file
                )
            }

        }.build().asLiveData()
    }

    override suspend fun deleteAttachment(
        taskId: String,
        ids: ArrayList<String>
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.deleteAttachments(taskId, ListIdRequest(ids))
            }

        }.build().asLiveData()
    }

    override suspend fun createManagementTask(
        form: CreateTaskForm
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                val bodyRequest = CreateTaskRequest(
                    project = form.project!!.toInt(),
                    job = form.job!!.toInt(),
                    pic = form.pic!!.toInt(),
                    store = form.store!!.toInt(),
                    name = "Job",
                    description = "description",
                    type = form.type!!.toInt()
                )
                return apiService.createManagementTask(
                    form.agency,
                    bodyRequest
                )
            }
        }.build().asLiveData()
    }

    override suspend fun updateProduct(
        taskId: String,
        productId: String,
        updateProduct: UpdateProductRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.updateProduct(
                    taskId,
                    productId,
                    updateProduct
                )
            }

        }.build().asLiveData()
    }

    override suspend fun updateCustomerFeedBack(
        taskId: String,
        customerFeedId: String,
        updateCustomerFeedbackRequest: UpdateCustomerFeedbackRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.updateCustomerFeedback(
                    taskId,
                    customerFeedId,
                    updateCustomerFeedbackRequest
                )
            }

        }.build().asLiveData()
    }

    override suspend fun updateProductFeedBack(
        taskId: String,
        updateProductFeedbackRequest: UpdateProductFeedbackRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.updateTaskProductFeedback(
                    taskId,
                    updateProductFeedbackRequest
                )
            }

        }.build().asLiveData()
    }

}