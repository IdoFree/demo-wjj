package com.weijiajiao.model.request;

public class WechatXML {
	private String appid;
	private String attach;
	private String body;
	private String mch_id;
	private String detail;
	private String nonce_str;
	private String notify_url;
	private String openid;
	private String out_trade_no;
	private String spbill_create_ip;
	private String total_fee;
	private String trade_type;
	private String sign;
	
	
	
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getMch_id() {
		return mch_id;
	}
	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getNonce_str() {
		return nonce_str;
	}
	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}
	public String getNotify_url() {
		return notify_url;
	}
	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getSpbill_create_ip() {
		return spbill_create_ip;
	}
	public void setSpbill_create_ip(String spbill_create_ip) {
		this.spbill_create_ip = spbill_create_ip;
	}
	public String getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}
	public String getTrade_type() {
		return trade_type;
	}
	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "WechatXML [appid=" + appid + ", attach=" + attach + ", body=" + body + ", mch_id=" + mch_id
				+ ", detail=" + detail + ", nonce_str=" + nonce_str + ", notify_url=" + notify_url + ", openid="
				+ openid + ", out_trade_no=" + out_trade_no + ", spbill_create_ip=" + spbill_create_ip + ", total_fee="
				+ total_fee + ", trade_type=" + trade_type + ", sign=" + sign + "]";
	}
	
	
	
	
}
