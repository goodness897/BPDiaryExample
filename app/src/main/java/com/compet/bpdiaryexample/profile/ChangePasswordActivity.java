package com.compet.bpdiaryexample.profile;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.R;

public class ChangePasswordActivity extends BaseActivity {

    private Button saveButton;

    private EditText passwordEdit;

    private EditText checkPassEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_change_password);
        initToolbar("비밀번호");

        passwordEdit = (EditText)findViewById(R.id.edit_password);
        checkPassEdit = (EditText)findViewById(R.id.edit_password_check);
        checkPassEdit.addTextChangedListener(new ReusableTextWatcher(checkPassEdit));
        passwordEdit.addTextChangedListener(new ReusableTextWatcher(passwordEdit));
        saveButton = (Button)findViewById(R.id.btn_save);

    }

    // TODO: Single TextWatcher for Multiple EditText

    TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable edit) {

            if (passwordEdit.getText().hashCode() == edit.hashCode()) {
                saveButton.setEnabled(true);
            } else if (checkPassEdit.getText().hashCode() == edit.hashCode()) {
                saveButton.setEnabled(true);
            } else {
                saveButton.setEnabled(false);
            }

        }
    };

    public class ReusableTextWatcher implements TextWatcher {

        private EditText view;

        // view represents the view you want to watch. Should inherit from
        // TextView
        private ReusableTextWatcher(View view) {

            if (view instanceof EditText)
                this.view = (EditText)view;
            else
                throw new ClassCastException("view must be an instance Of TextView");
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int before, int after) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

            int id = view.getId();

            if (id == R.id.edit_password) {
                //do the stuff you need to do for this particular view
                if (passwordEdit.getText().toString().length() > 0 && editable.length() > 0) {
                    saveButton.setEnabled(true);
                }
            }

            if (id == R.id.edit_password_check) {
                //do the stuff you need to do for this other particular view
                if (checkPassEdit.getText().toString().length() > 0 && editable.length() > 0) {
                    saveButton.setEnabled(true);
                }

            }

        }
    }

}
