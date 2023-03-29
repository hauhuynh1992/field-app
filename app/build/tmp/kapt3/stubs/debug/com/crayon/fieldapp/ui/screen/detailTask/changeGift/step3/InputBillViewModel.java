package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J6\u0010\f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0016j\b\u0012\u0004\u0012\u00020\u0012`\u0017J;\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0002R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step3/InputBillViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_createCustomerBill", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/CreateCustomerBillResponse;", "createCustomerBill", "Landroidx/lifecycle/LiveData;", "getCreateCustomerBill", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/Job;", "taskId", "", "customerId", "codeBill", "listUri", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "url", "task", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "quality", "", "isHasTage", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/response/TaskResponse;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTypeMedia", "app_debug"})
public final class InputBillViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>>> _createCustomerBill = null;
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse>>> getCreateCustomerBill() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job createCustomerBill(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String codeBill, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> listUri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse task, int quality, boolean isHasTage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.io.File> p5) {
        return null;
    }
    
    private final java.lang.String getTypeMedia(java.lang.String url) {
        return null;
    }
    
    public InputBillViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}