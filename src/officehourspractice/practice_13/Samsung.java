package officehourspractice.practice_13;

public class Samsung extends Phone implements AndoidApps{
    @Override
    public void insertmemory() {
        System.out.println("memory name = " + APP_STORE_NAME);
    }

    @Override
    public boolean download() {
        return false;
    }

    @Override
    void calling() {
        System.out.println();
    }

    @Override
    void texting() {

    }
}
