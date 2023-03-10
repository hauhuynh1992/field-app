package com.crayon.fieldapp.ui.screen.detailTask.changeGift

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.remote.response.CustomerBillResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class ChangeGiftViewModel(
    val taskRepository: TaskRepository
) : BaseViewModel() {

    val name = MutableLiveData<String>()
    val phone = MutableLiveData<String>()
    val customerId = MutableLiveData<String>()
    val otp = MutableLiveData<String>()

    fun setName(text: String) {
        name.value = text
    }

    fun setOtp(text: String) {
        otp.value = text
    }

    fun setCustomerId(text: String) {
        customerId.value = text
    }

    fun setPhone(text: String) {
        phone.value = text
    }

    private val _customers = MediatorLiveData<Event<Resource<List<CustomerBillResponse>>>>()
    val customers: LiveData<Event<Resource<List<CustomerBillResponse>>>> get() = _customers
    fun getListCustomer(taskId: String) {
        viewModelScope.launch {
            _customers.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getListCustomerBill(taskId)
                _customers.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _customers.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private val _task = MediatorLiveData<Event<Resource<TaskResponse>>>()
    val task: LiveData<Event<Resource<TaskResponse>>> get() = _task
    fun getDetailTask(taskId: String) {
        viewModelScope.launch {
            _task.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getPicTask(taskId = taskId)
                _task.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _task.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

}