package yklee.co.kr.materialtest.model;

/**
 * <pre>
 *
 * 페이지공개범위
 *
 * kr.co.pplus.core.code.common
 *  └ PageOpenBoundsCode.java
 * <pre>
 * @author			: SiHoon.Lee
 * @Date			: 2016. 9. 8.
 * @Version			: 1.0.0
 */
public enum PageOpenBoundsCode {

  /**
   *
   * 전체공개
   *
   * @type		: PageOpenBoundsCode
   * @variable	: everybody
   */
  everybody("전체공개"),
  
  /**
   *
   * FAN_GROUP
   *
   * @type		: PageOpenBoundsCode
   * @variable	: fan
   */
  fan("'팬'공개"),
  
  /**
   *
   * 검색
   *
   * @type		: PageOpenBoundsCode
   * @variable	: search
   */
  search("검색"),
  
  /**
   *
   * 주소록에만 공개
   *
   * @type		: PageOpenBoundsCode
   * @variable	: contactList
   */
  contactList("주소록에만 공개"),
  
  /**
   *
   * 비공개
   *
   * @type		: PageOpenBoundsCode
   * @variable	: nobody
   */
  nobody("비공개");

  public String value;

  public String getValue(){

    return value;
  }

  public void setValue(String value){

    this.value = value;
  }

  PageOpenBoundsCode(String value){

    this.value = value;
  }

}
