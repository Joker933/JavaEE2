package cz.educanet.webik;

import javax.inject.Inject;
import java.util.ArrayList;

public class UsersAuthManager {

    @Inject
    UsersManager usersManager;

    private ArrayList<String> tokenList = new ArrayList<String>();
}
