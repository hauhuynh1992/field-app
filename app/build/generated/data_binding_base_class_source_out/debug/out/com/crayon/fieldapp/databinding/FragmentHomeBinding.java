// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.home.HomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCalendar;

  @NonNull
  public final RelativeLayout btnFilterStore;

  @NonNull
  public final Button btnJob;

  @NonNull
  public final Button btnMonitoring;

  @NonNull
  public final Button btnReport;

  @NonNull
  public final ImageView imgIcFilter;

  @NonNull
  public final LinearLayout llMenu;

  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SwipeRefreshLayout refreshLayout;

  @NonNull
  public final RelativeLayout rlTitle;

  @NonNull
  public final TextView tvFilter;

  @NonNull
  public final TextView txtEmpty;

  @NonNull
  public final TextView txtFilterStoreStatus;

  @NonNull
  public final TextView txtTitle;

  @Bindable
  protected HomeViewModel mViewModel;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnCalendar, RelativeLayout btnFilterStore, Button btnJob, Button btnMonitoring,
      Button btnReport, ImageView imgIcFilter, LinearLayout llMenu, ProgressBar pbLoading,
      RecyclerView recyclerView, SwipeRefreshLayout refreshLayout, RelativeLayout rlTitle,
      TextView tvFilter, TextView txtEmpty, TextView txtFilterStoreStatus, TextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCalendar = btnCalendar;
    this.btnFilterStore = btnFilterStore;
    this.btnJob = btnJob;
    this.btnMonitoring = btnMonitoring;
    this.btnReport = btnReport;
    this.imgIcFilter = imgIcFilter;
    this.llMenu = llMenu;
    this.pbLoading = pbLoading;
    this.recyclerView = recyclerView;
    this.refreshLayout = refreshLayout;
    this.rlTitle = rlTitle;
    this.tvFilter = tvFilter;
    this.txtEmpty = txtEmpty;
    this.txtFilterStoreStatus = txtFilterStoreStatus;
    this.txtTitle = txtTitle;
  }

  public abstract void setViewModel(@Nullable HomeViewModel viewModel);

  @Nullable
  public HomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}