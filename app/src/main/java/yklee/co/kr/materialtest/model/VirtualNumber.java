package yklee.co.kr.materialtest.model;

/**
 * Created by j2n on 2016. 9. 23..
 */
public class VirtualNumber extends BaseResult{

    private String virtualNumber;
    private Long pageSeqNo;
    private VirtualNumberTypeCode type;
    private PageOpenBoundsCode openBounds;
    private String startDatetime;
    private String endDatetime;

    public String getVirtualNumber(){

        return virtualNumber;
    }

    public void setVirtualNumber(String virtualNumber){

        this.virtualNumber = virtualNumber;
    }

    public Long getPageSeqNo(){

        return pageSeqNo;
    }

    public void setPageSeqNo(Long pageSeqNo){

        this.pageSeqNo = pageSeqNo;
    }

    public VirtualNumberTypeCode getType(){

        return type;
    }

    public void setType(VirtualNumberTypeCode type){

        this.type = type;
    }

    public PageOpenBoundsCode getOpenBounds(){

        return openBounds;
    }

    public void setOpenBounds(PageOpenBoundsCode openBounds){

        this.openBounds = openBounds;
    }

    public String getStartDatetime(){

        return startDatetime;
    }

    public void setStartDatetime(String startDatetime){

        this.startDatetime = startDatetime;
    }

    public String getEndDatetime(){

        return endDatetime;
    }

    public void setEndDatetime(String endDatetime){

        this.endDatetime = endDatetime;
    }

    @Override
    public String toString(){

        return "VirtualNumber{" +
                "virtualNumber='" + virtualNumber + '\'' +
                ", pageSeqNo=" + pageSeqNo +
                ", type=" + type +
                ", openBounds=" + openBounds +
                ", startDatetime='" + startDatetime + '\'' +
                ", endDatetime='" + endDatetime + '\'' +
                '}';
    }
}
