package project.Exceptions;

public class RunnerException extends RuntimeException {
    public RunnerException(String message){
        super(message);
    }

    public RunnerException(){
    }
        @Override
        public void printStackTrace() {
        }
}
