package yklee.co.kr.materialtest.model;

/**
 * <pre>
 *
 * 회원유형
 *
 * kr.co.pplus.core.code.common
 *  └ MemberTypeCode.java
 * <pre>
 * @author			: SiHoon.Lee
 * @Date			: 2016. 9. 8.
 * @Version			: 1.0.0
 */
public enum MemberTypeCode {

  /**
   *
   * 벌크회원
   *
   * @type		: MemberTypeCode
   * @variable	: bulk
   */
  bulk, 
  
  /**
   *
   * 가맹점회원
   *
   * @type		: MemberTypeCode
   * @variable	: franchise
   */
  franchise, 
  
  /**
   *
   * 일반회원
   *
   * @type		: MemberTypeCode
   * @variable	: general
   */
  general;

}
