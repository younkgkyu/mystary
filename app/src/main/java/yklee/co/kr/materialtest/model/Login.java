package yklee.co.kr.materialtest.model;

/**
 * Created by 김종경 on 2016-09-21.
 */

public class Login extends BaseResult{

    private boolean success = true;

    private String loginId;

    private String password;

    private MemberTypeCode memberType;

    private SnsTypeCode accountType;

    private boolean verified;

    private String status;

    private int loginFailCount;

    private String lastLoginFailDatetime;

    private boolean requiredCreateNumber;

    private boolean invalidFranchiseStatus = false;

    private long contactListVersion;

    private YnCode talkReceive;

    private String token;

    private RestrictionStatusCode restrictionStatus;

    public boolean isSuccess(){

        return success;
    }

    public void setSuccess(boolean success){

        this.success = success;
    }

    public String getLoginId(){

        return loginId;
    }

    public void setLoginId(String loginId){

        this.loginId = loginId;
    }

    public MemberTypeCode getMemberType(){

        return memberType;
    }

    public void setMemberType(MemberTypeCode memberType){

        this.memberType = memberType;
    }

    public SnsTypeCode getAccountType(){

        return accountType;
    }

    public void setAccountType(SnsTypeCode accountType){

        this.accountType = accountType;
    }

    public boolean isVerified(){

        return verified;
    }

    public void setVerified(boolean verified){

        this.verified = verified;
    }

    public String getStatus(){

        return status;
    }

    public void setStatus(String status){

        this.status = status;
    }

    public int getLoginFailCount(){

        return loginFailCount;
    }

    public void setLoginFailCount(int loginFailCount){

        this.loginFailCount = loginFailCount;
    }

    public String getLastLoginFailDatetime(){

        return lastLoginFailDatetime;
    }

    public void setLastLoginFailDatetime(String lastLoginFailDatetime){

        this.lastLoginFailDatetime = lastLoginFailDatetime;
    }

    public boolean isRequiredCreateNumber(){

        return requiredCreateNumber;
    }

    public void setRequiredCreateNumber(boolean requiredCreateNumber){

        this.requiredCreateNumber = requiredCreateNumber;
    }

    public boolean isInvalidFranchiseStatus(){

        return invalidFranchiseStatus;
    }

    public void setInvalidFranchiseStatus(boolean invalidFranchiseStatus){

        this.invalidFranchiseStatus = invalidFranchiseStatus;
    }

    public long getContactListVersion(){

        return contactListVersion;
    }

    public void setContactListVersion(long contactListVersion){

        this.contactListVersion = contactListVersion;
    }

    public YnCode getTalkReceive(){

        return talkReceive;
    }

    public void setTalkReceive(YnCode talkReceive){

        this.talkReceive = talkReceive;
    }

    public String getToken(){

        return token;
    }

    public void setToken(String token){

        this.token = token;
    }

    public RestrictionStatusCode getRestrictionStatus(){

        return restrictionStatus;
    }

    public void setRestrictionStatus(RestrictionStatusCode restrictionStatus){

        this.restrictionStatus = restrictionStatus;
    }

    public String getPassword(){

        return password;
    }

    public void setPassword(String password){

        this.password = password;
    }

    @Override
    public String toString(){

        return "Login{" +
                "success=" + success +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", memberType=" + memberType +
                ", accountType=" + accountType +
                ", verified=" + verified +
                ", status='" + status + '\'' +
                ", loginFailCount=" + loginFailCount +
                ", lastLoginFailDatetime='" + lastLoginFailDatetime + '\'' +
                ", requiredCreateNumber=" + requiredCreateNumber +
                ", invalidFranchiseStatus=" + invalidFranchiseStatus +
                ", contactListVersion=" + contactListVersion +
                ", talkReceive=" + talkReceive +
                ", token='" + token + '\'' +
                ", restrictionStatus=" + restrictionStatus +
                '}';
    }
}
