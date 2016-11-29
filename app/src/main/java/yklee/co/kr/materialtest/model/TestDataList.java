package yklee.co.kr.materialtest.model;

import java.util.List;

/**
 * Created by Windows7-00 on 2016-11-16.
 */

public class TestDataList extends BaseResult {
    List<TestData> testDatas;

    public List<TestData> getTestDatas() {
        return testDatas;
    }

    public void setTestDatas(List<TestData> testDatas) {
        this.testDatas = testDatas;
    }

    @Override
    public String toString() {
        return "TestDataList{" +
                "testDatas=" + testDatas +
                '}';
    }
}
