// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.forgot.ForgotPasswordViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentForgotBinding extends ViewDataBinding {
  @NonNull
  public final Button bnReset;

  @NonNull
  public final EditText edtPhone;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final TextView txtCountryCode;

  @Bindable
  protected ForgotPasswordViewModel mViewModel;

  protected FragmentForgotBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button bnReset, EditText edtPhone, ScrollView scrollView, TextView txtCountryCode) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bnReset = bnReset;
    this.edtPhone = edtPhone;
    this.scrollView = scrollView;
    this.txtCountryCode = txtCountryCode;
  }

  public abstract void setViewModel(@Nullable ForgotPasswordViewModel viewModel);

  @Nullable
  public ForgotPasswordViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forgot, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentForgotBinding>inflateInternal(inflater, R.layout.fragment_forgot, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forgot, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentForgotBinding>inflateInternal(inflater, R.layout.fragment_forgot, null, false, component);
  }

  public static FragmentForgotBinding bind(@NonNull View view) {
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
  public static FragmentForgotBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentForgotBinding)bind(component, view, R.layout.fragment_forgot);
  }
}