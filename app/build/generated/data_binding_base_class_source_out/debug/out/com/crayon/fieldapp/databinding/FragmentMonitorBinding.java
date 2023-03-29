// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.monitor.MonitorViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMonitorBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton imbIcBack;

  @NonNull
  public final ImageButton imbIcFilter;

  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final RecyclerView rvMenu;

  @NonNull
  public final TextView tvSubTitle;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected MonitorViewModel mViewModel;

  protected FragmentMonitorBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton imbIcBack, ImageButton imbIcFilter, ProgressBar pbLoading,
      RelativeLayout rlToolbar, RecyclerView rvMenu, TextView tvSubTitle, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imbIcBack = imbIcBack;
    this.imbIcFilter = imbIcFilter;
    this.pbLoading = pbLoading;
    this.rlToolbar = rlToolbar;
    this.rvMenu = rvMenu;
    this.tvSubTitle = tvSubTitle;
    this.tvTitle = tvTitle;
  }

  public abstract void setViewModel(@Nullable MonitorViewModel viewModel);

  @Nullable
  public MonitorViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentMonitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_monitor, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMonitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMonitorBinding>inflateInternal(inflater, R.layout.fragment_monitor, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMonitorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_monitor, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMonitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMonitorBinding>inflateInternal(inflater, R.layout.fragment_monitor, null, false, component);
  }

  public static FragmentMonitorBinding bind(@NonNull View view) {
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
  public static FragmentMonitorBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMonitorBinding)bind(component, view, R.layout.fragment_monitor);
  }
}