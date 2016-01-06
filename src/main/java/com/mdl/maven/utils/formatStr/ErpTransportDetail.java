package com.mdl.maven.utils.formatStr;

public class ErpTransportDetail {
    private String orderNo;

    private Integer id;

    private String store;

    private String stockPlace;

    private String contractNo;

    private String sendNo;

    private String sendType;

    private String sendSchedule;

    private Long total;

    private Long freight;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store == null ? null : store.trim();
    }

    public String getStockPlace() {
        return stockPlace;
    }

    public void setStockPlace(String stockPlace) {
        this.stockPlace = stockPlace == null ? null : stockPlace.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getSendNo() {
        return sendNo;
    }

    public void setSendNo(String sendNo) {
        this.sendNo = sendNo == null ? null : sendNo.trim();
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType == null ? null : sendType.trim();
    }

    public String getSendSchedule() {
        return sendSchedule;
    }

    public void setSendSchedule(String sendSchedule) {
        this.sendSchedule = sendSchedule == null ? null : sendSchedule.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getFreight() {
        return freight;
    }

    public void setFreight(Long freight) {
        this.freight = freight;
    }
}