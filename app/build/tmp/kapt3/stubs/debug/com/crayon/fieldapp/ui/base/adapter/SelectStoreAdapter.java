package com.crayon.fieldapp.ui.base.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/crayon/fieldapp/ui/base/adapter/SelectStoreAdapter;", "Lcom/crayon/fieldapp/ui/base/BaseRecyclerAdapter;", "Lcom/crayon/fieldapp/data/model/Store;", "Lcom/crayon/fieldapp/databinding/ItemSelectStoreBinding;", "itemClickListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "bindFirstTime", "binding", "getLayoutRes", "", "viewType", "app_debug"})
public final class SelectStoreAdapter extends com.crayon.fieldapp.ui.base.BaseRecyclerAdapter<com.crayon.fieldapp.data.model.Store, com.crayon.fieldapp.databinding.ItemSelectStoreBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.model.Store, kotlin.Unit> itemClickListener = null;
    
    @java.lang.Override()
    protected int getLayoutRes(int viewType) {
        return 0;
    }
    
    @java.lang.Override()
    protected void bindFirstTime(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.databinding.ItemSelectStoreBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.model.Store, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public SelectStoreAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.model.Store, kotlin.Unit> itemClickListener) {
        super(null);
    }
    
    public SelectStoreAdapter() {
        super(null);
    }
}