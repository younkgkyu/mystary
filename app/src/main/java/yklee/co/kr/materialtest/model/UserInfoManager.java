package yklee.co.kr.materialtest.model;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * Created by Administrator on 2016-09-08.
 */
public class UserInfoManager extends ResultLogin{

    // Preference
    public static final String SHARED_USER_INFO = "user_info";

    private static UserInfoManager mUserInfoManager = null;

    private static

    int defaultRes = 0;

    int prfileDefaultRes = 0;
    private

    Integer defaultImageRes;

    public static UserInfoManager getInstance(){

        if(mUserInfoManager == null) {
            mUserInfoManager = new UserInfoManager();
            mUserInfoManager.load();
        }

        return mUserInfoManager;
    }

    public void load(){

//        String data = PreferenceUtil.getDefaultPreference(PPlusApplication.getContext()).getString(SHARED_USER_INFO);
        String data = "";
        Type typeOfSrc = new TypeToken<UserInfoManager>(){}.getType();
        UserInfoManager userInfoManager = new Gson().fromJson(data, typeOfSrc);
        if(userInfoManager != null){
            mUserInfoManager = userInfoManager;
        }
    }

    public void save(){

        Type typeOfSrc = new TypeToken<UserInfoManager>(){}.getType();
        String data = new Gson().toJson(mUserInfoManager, typeOfSrc);

//        PreferenceUtil.getDefaultPreference(PPlusApplication.getContext()).put(SHARED_USER_INFO, data);
//        ApiController.getPlusService().updateHeaders();
    }

    public void clear(){

        //        PreferenceUtil.getPreference(PPlusApplication.getContext(), SHARED_USER_INFO).clear();
        mUserInfoManager.setPage(null);
        mUserInfoManager.setNumber(null);
        mUserInfoManager.setProfile(null);
        mUserInfoManager.save();
//        ApiController.getPlusService().updateHeaders();
//        SendbirdManager.getInstance().sendbirdDisconnect();
    }


    /**
     * PPlus 회원 여부
     *
     * @return
     */
    public boolean isMember(){

        if(mUserInfoManager.getLogin() != null && mUserInfoManager.getProfile() != null && mUserInfoManager.getProfile().getUserSeq() > -1 && !TextUtils.isEmpty(mUserInfoManager.getLogin().getLoginId())) {
            return true;
        }
        return false;
    }

    private

    int selectedDefaultBG(int number){

        return defaultRes;
    }
}
