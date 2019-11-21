class QandA {

    // instance variables
    private int operand1;
    private int operand2;
    private boolean operator;
    private int correctAnswer;

    // CODE MISSING
    public QandA(){

        operand1 = (int)(Math.random()*21);
        operand2 = (int)(Math.random()*(21-operand1));
        double a = Math.random();

        if(a > 0.5){

            operator = true;
            correctAnswer = operand1 + operand2;

        }else{

            operator = false;
            correctAnswer = operand1 - operand2;

        }


    }
    public int getOperand1() {

        return operand1;

    }

    public int getOperand2() {

        return operand2;

    }

    public boolean getOperator() {

        return operator;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }




}
