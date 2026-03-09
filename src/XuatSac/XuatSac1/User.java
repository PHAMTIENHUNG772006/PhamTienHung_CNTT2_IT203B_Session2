package XuatSac.XuatSac1;

public class User implements UserActions, AdminActions {

    @Override
    public void logActivity(String activity) {

        UserActions.super.logActivity(activity);

        AdminActions.super.logActivity(activity);
    }
}
