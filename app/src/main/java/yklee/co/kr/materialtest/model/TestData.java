package yklee.co.kr.materialtest.model;

/**
 * Created by Windows7-00 on 2016-11-16.
 */

public class TestData extends BaseResult {
    private String aaa;

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public String getAaa() {
        return aaa;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "aaa='" + aaa + '\'' +
                '}';
    }
}
