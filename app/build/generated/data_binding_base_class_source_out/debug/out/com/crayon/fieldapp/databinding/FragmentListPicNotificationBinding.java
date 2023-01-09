// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.notification.NotificationViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListPicNotificationBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RecyclerView rvNotification;

  @NonNull
  public final TextView txtEmpty;

  @Bindable
  protected NotificationViewModel mViewModel;

  protected FragmentListPicNotificationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ProgressBar pbLoading, RecyclerView rvNotification, TextView txtEmpty) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pbLoading = pbLoading;
    this.rvNotification = rvNotification;
    this.txtEmpty = txtEmpty;
  }

  public abstract void setViewModel(@Nullable NotificationViewModel viewModel);

  @Nullable
  public NotificationViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentListPicNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_pic_notification, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListPicNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListPicNotificationBinding>inflateInternal(inflater, R.layout.fragment_list_pic_notification, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListPicNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_pic_notification, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListPicNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListPicNotificationBinding>inflateInternal(inflater, R.layout.fragment_list_pic_notification, null, false, component);
  }

  public static FragmentListPicNotificationBinding bind(@NonNull View view) {
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
  public static FragmentListPicNotificationBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentListPicNotificationBinding)bind(component, view, R.layout.fragment_list_pic_notification);
  }
}