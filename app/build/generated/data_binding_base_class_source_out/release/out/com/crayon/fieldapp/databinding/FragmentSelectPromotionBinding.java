// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.SelectPromotionViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSelectPromotionBinding extends ViewDataBinding {
  @NonNull
  public final Button btnComplete;

  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RecyclerView rvPage;

  @Bindable
  protected SelectPromotionViewModel mViewModel;

  protected FragmentSelectPromotionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnComplete, ProgressBar pbLoading, RecyclerView rvPage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnComplete = btnComplete;
    this.pbLoading = pbLoading;
    this.rvPage = rvPage;
  }

  public abstract void setViewModel(@Nullable SelectPromotionViewModel viewModel);

  @Nullable
  public SelectPromotionViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSelectPromotionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_select_promotion, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSelectPromotionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSelectPromotionBinding>inflateInternal(inflater, R.layout.fragment_select_promotion, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSelectPromotionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_select_promotion, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSelectPromotionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSelectPromotionBinding>inflateInternal(inflater, R.layout.fragment_select_promotion, null, false, component);
  }

  public static FragmentSelectPromotionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSelectPromotionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentSelectPromotionBinding)bind(component, view, R.layout.fragment_select_promotion);
  }
}