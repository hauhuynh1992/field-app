// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.data.remote.response.JobResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemTodayJobBinding extends ViewDataBinding {
  @NonNull
  public final TextView txtAgencyName;

  @NonNull
  public final TextView txtProjectName;

  @NonNull
  public final TextView txtShift;

  @NonNull
  public final TextView txtStoreName;

  @Bindable
  protected JobResponse mItem;

  protected ItemTodayJobBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView txtAgencyName, TextView txtProjectName, TextView txtShift, TextView txtStoreName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.txtAgencyName = txtAgencyName;
    this.txtProjectName = txtProjectName;
    this.txtShift = txtShift;
    this.txtStoreName = txtStoreName;
  }

  public abstract void setItem(@Nullable JobResponse item);

  @Nullable
  public JobResponse getItem() {
    return mItem;
  }

  @NonNull
  public static ItemTodayJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_today_job, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemTodayJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemTodayJobBinding>inflateInternal(inflater, R.layout.item_today_job, root, attachToRoot, component);
  }

  @NonNull
  public static ItemTodayJobBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_today_job, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemTodayJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemTodayJobBinding>inflateInternal(inflater, R.layout.item_today_job, null, false, component);
  }

  public static ItemTodayJobBinding bind(@NonNull View view) {
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
  public static ItemTodayJobBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemTodayJobBinding)bind(component, view, R.layout.item_today_job);
  }
}