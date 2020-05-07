package model.bean;


import Base.OtherBaseEntity;

/**
 * <p>
 * 商城购买日志
 * </p>
 *
 * @author twg
 * @since 2020-03-26
 */
public class ServerBuyGoods extends OtherBaseEntity {

    public	Integer	goodsId;
    public	Integer	buyNum;
    public	Integer	itemId;
    public	Integer	itemNumPerGoods;
    public	Integer	costMoneyType;
    public	Integer	costMoneyNum;
	public	String	itemName;
	public	String	costMoneyName;
	
 
}
