package model.bean;


import Base.OtherBaseEntity;

/**
 * <p>
 * 邮件提取日志
 * </p>
 *
 * @author twg
 * @since 2020-03-26
 */
public class ServerGetMailContent extends OtherBaseEntity {


    public Integer itemId;
    public Integer itemNum;
    public String mailGuid;
	public String mailTitle;

}
