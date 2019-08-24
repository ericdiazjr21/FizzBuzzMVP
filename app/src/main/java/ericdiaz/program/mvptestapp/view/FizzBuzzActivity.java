package ericdiaz.program.mvptestapp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ericdiaz.program.mvptestapp.R;
import ericdiaz.program.mvptestapp.presenter.FizzContract;
import ericdiaz.program.mvptestapp.presenter.FizzPresenter;

public class FizzBuzzActivity extends AppCompatActivity implements FizzContract.ViewContract {

    private FizzContract.PrestenterContract fizzPresenter;
    private TextView fizzBuzzTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_fizz_buzz);

        fizzBuzzTextView = findViewById(R.id.fizz_buzz_text_view);
        final EditText enterNumberEditText = findViewById(R.id.enter_number_edit_text);
        final Button playButton = findViewById(R.id.play_button);

        fizzPresenter = new FizzPresenter(this);

        takeUserInput(enterNumberEditText, playButton);
    }

    @Override
    public void showFizzOrBuzz(String word) {
        updateFizzBuzzTextView(word);
    }

    private void takeUserInput(final EditText enterNumberEditText,
                               final Button playButton) {
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fizzPresenter.onInput(Integer.parseInt(enterNumberEditText.getText().toString()));
            }
        });
    }

    private void updateFizzBuzzTextView(String word) {
        fizzBuzzTextView.setText(word);
    }
}
