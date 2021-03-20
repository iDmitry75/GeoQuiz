package com;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue; // правильный ответ
    private boolean mAnswered; // на вопрос ответили
    private boolean mAnswer; // ответ

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public boolean isTrueAnswered() {
        return mAnswerTrue == mAnswer;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
        mAnswered = true;
    }

    public boolean isAnswered() {return mAnswered;}

    public void setAnswered(boolean answered) {mAnswered = answered; }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
