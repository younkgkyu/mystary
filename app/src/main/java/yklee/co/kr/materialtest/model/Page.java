package yklee.co.kr.materialtest.model;

/**
 * Created by j2n on 2016. 8. 1..
 */
public class Page extends BaseResult implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public boolean equals(Object o){

        if(o == null) return false;

        if(o instanceof Page) {
            return (((Page) o).pageSeqNo == pageSeqNo);
        } else {
            return false;
        }
    }

    private long pageSeqNo;

    private String imageUrl;

    private String bgImageUrl;

    private String nickname;

    private String storeName;

    private String phoneNumber;

    private PageOpenBoundsCode openBounds =  PageOpenBoundsCode.everybody;

    private String zipCode;

    private String roadAddress;

    private String roadDetailAddress;

    private String parcelAddress;

    private String parcelDetailAddress;

    private String address;

    private String latitude;

    private String longitude;

    private String homepageUrl;

    private YnCode homepageLink = YnCode.N;

    private String catchphrase;

    private long categorySeqNo;

    private long primaryCategorySeqNo;

    private String primaryCategoryName;

    private long secondaryCategorySeqNo;

    private String secondaryCategoryName;

    private String categoryText;

    private YnCode blind = YnCode.N;

    private long todayViewCount;

    private long postCount;

    private long plusCount;

    private MemberTypeCode memberType;

    private TalkReceiveBoundsCode talkReceiveBounds;

    private String talkDenyDay;

    private String talkDenyStartTime;

    private String talkDenyEndTime;

    private YnCode block = YnCode.N;

    private long pageMemberSeqNo;

    private int start;

    private int end;

    private String channelUrl = null; // 대화방이 개설되어 있다면 값이 존재

    private PageTypeCode pageType = PageTypeCode.person; // 일반, 매장의 TypeCode

    private String searchKeyword; // 검색 키워드 #으로 구분하되, 두번째에서는 # (#스페이스)로 구분해서 전달

    public Page(){

    }

    public long getPageSeqNo(){

        return pageSeqNo;
    }

    public void setPageSeqNo(long pageSeqNo){

        this.pageSeqNo = pageSeqNo;
    }

    public String getImageUrl(){

        return imageUrl;
    }

    public void setImageUrl(String imageUrl){

        this.imageUrl = imageUrl;
    }

    public String getBgImageUrl(){

        return bgImageUrl;
    }

    public void setBgImageUrl(String bgImageUrl){

        this.bgImageUrl = bgImageUrl;
    }

    public String getNickname(){

        return nickname;
    }

    public void setNickname(String nickname){

        this.nickname = nickname;
    }

    public String getStoreName(){

        return storeName;
    }

    public void setStoreName(String storeName){

        this.storeName = storeName;
    }

    public String getPhoneNumber(){

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){

        this.phoneNumber = phoneNumber;
    }

    public PageOpenBoundsCode getOpenBounds(){

        return openBounds;
    }

    public void setOpenBounds(PageOpenBoundsCode openBounds){

        this.openBounds = openBounds;
    }

    public String getZipCode(){

        return zipCode;
    }

    public void setZipCode(String zipCode){

        this.zipCode = zipCode;
    }

    public long getCategorySeqNo(){

        return categorySeqNo;
    }

    public void setCategorySeqNo(long categorySeqNo){

        this.categorySeqNo = categorySeqNo;
    }

    public long getPageMemberSeqNo(){

        return pageMemberSeqNo;
    }

    public void setPageMemberSeqNo(long pageMemberSeqNo){

        this.pageMemberSeqNo = pageMemberSeqNo;
    }

    public String getOpenBoundsAsString(){

        //        switch (getOpenBounds()) {
        //            case everybody:
        //                return "전체공개";
        //            case fan:
        //                return "'팬'공개";
        //            case search:
        //                return "검색";
        //            case contactList:
        //                return "주소록에만 공개";
        //            case nobody:
        //                return "비공개";
        //        }
        return getOpenBounds().getValue();

    }

    public String getAddress(){

        return address;
    }

    public void setAddress(String address){

        this.address = address;
    }

    public String getLatitude(){

        return latitude;
    }

    public void setLatitude(String latitude){

        this.latitude = latitude;
    }

    public String getLongitude(){

        return longitude;
    }

    public void setLongitude(String longitude){

        this.longitude = longitude;
    }

    public String getHomepageUrl(){

//        if(StringUtils.isNotEmpty(homepageUrl)) {
//            if(homepageUrl.startsWith("http")) {
//                return homepageUrl;
//            } else {
//                return "http://" + homepageUrl;
//            }
//        }
        return "";
    }

    public void setHomepageUrl(String homepageUrl){

        this.homepageUrl = homepageUrl;
    }

    public YnCode getHomepageLink(){

        return homepageLink;
    }

    public void setHomepageLink(YnCode homepageLink){

        this.homepageLink = homepageLink;
    }

    public String getCatchphrase(){

        return catchphrase;
    }

    public void setCatchphrase(String catchphrase){

        this.catchphrase = catchphrase;
    }

    public YnCode getBlind(){

        return blind;
    }

    public void setBlind(YnCode blind){

        this.blind = blind;
    }

    public long getTodayViewCount(){

        return todayViewCount;
    }

    public void setTodayViewCount(long todayViewCount){

        this.todayViewCount = todayViewCount;
    }

    public long getPostCount(){

        return postCount;
    }

    public void setPostCount(long postCount){

        this.postCount = postCount;
    }

    public long getPlusCount(){

        return plusCount;
    }

    public void setPlusCount(long plusCount){

        this.plusCount = plusCount;
    }

    public MemberTypeCode getMemberType(){

        return memberType;
    }

    public void setMemberType(MemberTypeCode memberType){

        this.memberType = memberType;
    }

    public TalkReceiveBoundsCode getTalkReceiveBounds(){

        return talkReceiveBounds;
    }

    public void setTalkReceiveBounds(TalkReceiveBoundsCode talkReceiveBounds){

        this.talkReceiveBounds = talkReceiveBounds;
    }

    public String getTalkDenyDay(){

        return talkDenyDay;
    }

    public void setTalkDenyDay(String talkDenyDay){

        this.talkDenyDay = talkDenyDay;
    }

    public String getTalkDenyStartTime(){

        return talkDenyStartTime;
    }

    public void setTalkDenyStartTime(String talkDenyStartTime){

        this.talkDenyStartTime = talkDenyStartTime;
    }

    public String getTalkDenyEndTime(){

        return talkDenyEndTime;
    }

    public void setTalkDenyEndTime(String talkDenyEndTime){

        this.talkDenyEndTime = talkDenyEndTime;
    }

    public YnCode getBlock(){

        return block;
    }

    public void setBlock(YnCode block){

        this.block = block;
    }

    public String getParcelAddress(){

        return parcelAddress;
    }

    public void setParcelAddress(String parcelAddress){

        this.parcelAddress = parcelAddress;
    }

    public String getParcelDetailAddress(){

        return parcelDetailAddress;
    }

    public void setParcelDetailAddress(String parcelDetailAddress){

        this.parcelDetailAddress = parcelDetailAddress;
    }

    public String getCategoryText(){

        return categoryText;
    }

    public void setCategoryText(String categoryText){

        this.categoryText = categoryText;
    }

    public String getPrimaryCategoryName(){

        return primaryCategoryName;
    }

    public void setPrimaryCategoryName(String primaryCategoryName){

        this.primaryCategoryName = primaryCategoryName;
    }

    public String getSecondaryCategoryName(){

        return secondaryCategoryName;
    }

    public void setSecondaryCategoryName(String secondaryCategoryName){

        this.secondaryCategoryName = secondaryCategoryName;
    }

    public String getRoadAddress(){

        return roadAddress;
    }

    public void setRoadAddress(String roadAddress){

        this.roadAddress = roadAddress;
    }

    public String getRoadDetailAddress(){

        return roadDetailAddress;
    }

    public void setRoadDetailAddress(String roadDetailAddress){

        this.roadDetailAddress = roadDetailAddress;
    }

    public long getPrimaryCategorySeqNo(){

        return primaryCategorySeqNo;
    }

    public void setPrimaryCategorySeqNo(long primaryCategorySeqNo){

        this.primaryCategorySeqNo = primaryCategorySeqNo;
    }

    public long getSecondaryCategorySeqNo(){

        return secondaryCategorySeqNo;
    }

    public void setSecondaryCategorySeqNo(long secondaryCategorySeqNo){

        this.secondaryCategorySeqNo = secondaryCategorySeqNo;
    }

    public String getChannelUrl(){

        return channelUrl;
    }

    public void setChannelUrl(String channelUrl){

        this.channelUrl = channelUrl;
    }

    public PageTypeCode getPageType(){

        return pageType;
    }

    public void setPageType(PageTypeCode pageType){

        this.pageType = pageType;
    }

    public String getSearchKeyword(){

        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword){

        this.searchKeyword = searchKeyword;
    }

    @Override
    public String toString(){

        return "Page{" +
                "pageSeqNo=" + pageSeqNo +
                ", imageUrl='" + imageUrl + '\'' +
                ", bgImageUrl='" + bgImageUrl + '\'' +
                ", nickname='" + nickname + '\'' +
                ", storeName='" + storeName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", openBounds=" + openBounds +
                ", zipCode='" + zipCode + '\'' +
                ", roadAddress='" + roadAddress + '\'' +
                ", roadDetailAddress='" + roadDetailAddress + '\'' +
                ", parcelAddress='" + parcelAddress + '\'' +
                ", parcelDetailAddress='" + parcelDetailAddress + '\'' +
                ", address='" + address + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", homepageUrl='" + homepageUrl + '\'' +
                ", homepageLink=" + homepageLink +
                ", catchphrase='" + catchphrase + '\'' +
                ", categorySeqNo=" + categorySeqNo +
                ", primaryCategorySeqNo=" + primaryCategorySeqNo +
                ", primaryCategoryName='" + primaryCategoryName + '\'' +
                ", secondaryCategorySeqNo=" + secondaryCategorySeqNo +
                ", secondaryCategoryName='" + secondaryCategoryName + '\'' +
                ", categoryText='" + categoryText + '\'' +
                ", blind=" + blind +
                ", todayViewCount=" + todayViewCount +
                ", postCount=" + postCount +
                ", plusCount=" + plusCount +
                ", memberType=" + memberType +
                ", talkReceiveBounds=" + talkReceiveBounds +
                ", talkDenyDay='" + talkDenyDay + '\'' +
                ", talkDenyStartTime='" + talkDenyStartTime + '\'' +
                ", talkDenyEndTime='" + talkDenyEndTime + '\'' +
                ", block=" + block +
                ", pageMemberSeqNo=" + pageMemberSeqNo +
                ", start=" + start +
                ", end=" + end +
                ", channelUrl='" + channelUrl + '\'' +
                ", pageType=" + pageType +
                ", searchKeyword='" + searchKeyword + '\'' +
                '}';
    }
}
