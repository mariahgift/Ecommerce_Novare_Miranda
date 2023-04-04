// Generated by view binder compiler. Do not edit!
package ph.stacktrek.novare.ecommercenovare.miranda.mariahgift.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ph.stacktrek.novare.ecommercenovare.miranda.mariahgift.R;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnRegister;

  @NonNull
  public final TextInputLayout confirmPassword;

  @NonNull
  public final EditText createAccount;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final EditText registerAccount;

  @NonNull
  public final TextInputEditText registerConfirmPasswordText;

  @NonNull
  public final AppCompatImageView registerLogo;

  @NonNull
  public final TextInputEditText registerPasswordText;

  @NonNull
  public final TextInputLayout registerUsernameBox;

  @NonNull
  public final TextInputEditText registerUsernameText;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnRegister, @NonNull TextInputLayout confirmPassword,
      @NonNull EditText createAccount, @NonNull TextInputLayout password,
      @NonNull EditText registerAccount, @NonNull TextInputEditText registerConfirmPasswordText,
      @NonNull AppCompatImageView registerLogo, @NonNull TextInputEditText registerPasswordText,
      @NonNull TextInputLayout registerUsernameBox,
      @NonNull TextInputEditText registerUsernameText) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.confirmPassword = confirmPassword;
    this.createAccount = createAccount;
    this.password = password;
    this.registerAccount = registerAccount;
    this.registerConfirmPasswordText = registerConfirmPasswordText;
    this.registerLogo = registerLogo;
    this.registerPasswordText = registerPasswordText;
    this.registerUsernameBox = registerUsernameBox;
    this.registerUsernameText = registerUsernameText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register;
      AppCompatButton btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.confirm_password;
      TextInputLayout confirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (confirmPassword == null) {
        break missingId;
      }

      id = R.id.create_account;
      EditText createAccount = ViewBindings.findChildViewById(rootView, id);
      if (createAccount == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.register_account;
      EditText registerAccount = ViewBindings.findChildViewById(rootView, id);
      if (registerAccount == null) {
        break missingId;
      }

      id = R.id.register_confirm_password_text;
      TextInputEditText registerConfirmPasswordText = ViewBindings.findChildViewById(rootView, id);
      if (registerConfirmPasswordText == null) {
        break missingId;
      }

      id = R.id.register_logo;
      AppCompatImageView registerLogo = ViewBindings.findChildViewById(rootView, id);
      if (registerLogo == null) {
        break missingId;
      }

      id = R.id.register_password_text;
      TextInputEditText registerPasswordText = ViewBindings.findChildViewById(rootView, id);
      if (registerPasswordText == null) {
        break missingId;
      }

      id = R.id.register_username_box;
      TextInputLayout registerUsernameBox = ViewBindings.findChildViewById(rootView, id);
      if (registerUsernameBox == null) {
        break missingId;
      }

      id = R.id.register_username_text;
      TextInputEditText registerUsernameText = ViewBindings.findChildViewById(rootView, id);
      if (registerUsernameText == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, btnRegister, confirmPassword,
          createAccount, password, registerAccount, registerConfirmPasswordText, registerLogo,
          registerPasswordText, registerUsernameBox, registerUsernameText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}