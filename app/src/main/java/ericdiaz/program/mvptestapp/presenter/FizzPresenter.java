package ericdiaz.program.mvptestapp.presenter;

import android.support.annotation.NonNull;

public class FizzPresenter implements FizzContract.PrestenterContract {

    private FizzContract.ViewContract viewContract;

    public FizzPresenter(@NonNull final FizzContract.ViewContract viewContract) {
        this.viewContract = viewContract;
    }

    @Override
    public void onInput(int numberInput) {
        if(numberInput % 5 == 0 && numberInput % 3 == 0){
            viewContract.showFizzOrBuzz("FizzBuzz");
        }else if(numberInput % 3 == 0){
            viewContract.showFizzOrBuzz("Fizz");
        }else if(numberInput % 5 == 0){
            viewContract.showFizzOrBuzz("Buzz");
        }else{
            viewContract.showFizzOrBuzz("No Fizz or Buzz");
        }
    }
}
