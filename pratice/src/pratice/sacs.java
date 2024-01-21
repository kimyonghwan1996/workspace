package pratice;

public class sacs {
    public static void main(String[] args) {
        String currentWorkingDirectory = System.getProperty("user.dir");
        System.out.println("Current Working Directory: " + currentWorkingDirectory);

        // 실행 중인 클래스 파일의 위치 확인
        String pathToThisClass = sacs.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println("Path to this class: " + pathToThisClass);
    }
}
