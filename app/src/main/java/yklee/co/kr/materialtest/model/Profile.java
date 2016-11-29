package yklee.co.kr.materialtest.model;

/**
 * Created by j2n on 2016. 9. 26..
 */
public class Profile extends BaseResult{

    private long userSeq;

    private String email;

    private String imageUrl;

    private String mobileNumber;

    private String nickname;

    private String restrictionStatus;

    private String channelUrl = null; // 대화방이 개설되어 있다면 값이 존재

    private YnCode talkReceive;

    public String getEmail(){

        return email;
    }

    public void setEmail(String email){

        this.email = email;
    }

    public String getImageUrl(){

        return imageUrl;
    }

    public void setImageUrl(String imageUrl){

        this.imageUrl = imageUrl;
    }

    public String getMobileNumber(){

        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber){

        this.mobileNumber = mobileNumber;
    }

    public String getNickName(){

        return nickname;
    }

    public void setNickName(String nickname){

        this.nickname = nickname;
    }

    public String getRestrictionStatus(){

        return restrictionStatus;
    }

    public void setRestrictionStatus(String restrictionStatus){

        this.restrictionStatus = restrictionStatus;
    }

    public long getUserSeq(){

        return userSeq;
    }

    public void setUserSeq(long userSeq){

        this.userSeq = userSeq;
    }

    public String getChannelUrl(){

        return channelUrl;
    }

    public void setChannelUrl(String channelUrl){

        this.channelUrl = channelUrl;
    }

    public YnCode getTalkReceive(){

        return talkReceive;
    }

    public void setTalkReceive(YnCode talkReceive){

        this.talkReceive = talkReceive;
    }

    @Override
    public String toString(){

        return "Profile{" +
                "userSeq=" + userSeq +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", nickname='" + nickname + '\'' +
                ", restrictionStatus='" + restrictionStatus + '\'' +
                ", channelUrl='" + channelUrl + '\'' +
                '}';
    }
}
