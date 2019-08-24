package ericdiaz.program.mvptestapp.presenter;

public interface FizzContract {

    public interface ViewContract {
        void showFizzOrBuzz(String word);
    }

    public interface PrestenterContract {
        void onInput(int input);
    }
}
