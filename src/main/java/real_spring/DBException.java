package real_spring;

public class DBException extends RuntimeException{
        public DBException(String errorMessage) {
            super(errorMessage);
        }
}
