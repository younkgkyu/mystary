package yklee.co.kr.materialtest.model;

import java.util.List;

/**
 * Created by j2n on 2016. 8. 1..
 */

public class ResultLogin extends BaseResult{

    private Login login;
    private Profile profile;
    private List<Page> page;
    private List<VirtualNumber> number;

    public ResultLogin(){

    }

    public Login getLogin(){

        return login;
    }

    public void setLogin(Login login){

        this.login = login;
    }

    public List<Page> getPage(){

        return page;
    }

    public void setPage(List<Page> page){

        this.page = page;
    }

    public List<VirtualNumber> getNumber(){

        return number;
    }

    public void setNumber(List<VirtualNumber> number){

        this.number = number;
    }

    public Profile getProfile(){

        return profile;
    }

    public void setProfile(Profile profile){

        this.profile = profile;
    }

    @Override
    public String toString(){

        return "ResultLogin{" +
                "login=" + login +
                ", \n\npage=" + page +
                ", \n\nnumber=" + number +
                ", \n\nprofile=" + profile +
                '}';
    }
}
