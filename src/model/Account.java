package model;

public class Account {
    private Integer id;
    private String act_currency;
    private String act_name;
    private String act_no;
    private Double balance;
    private Boolean is_deleted;
    private Boolean is_hide;
    private Integer account_type_id;
    private Integer cus_id;
    private Double over_limit;
    public Account(){}

    public Account(Integer id, String act_currency, String act_name, String act_no, Double balance, Boolean is_deleted, Boolean is_hide, Integer account_type_id, Integer cus_id, Double over_limit) {
        this.id = id;
        this.act_currency = act_currency;
        this.act_name = act_name;
        this.act_no = act_no;
        this.balance = balance;
        this.is_deleted = is_deleted;
        this.is_hide = is_hide;
        this.account_type_id = account_type_id;
        this.cus_id = cus_id;
        this.over_limit = over_limit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAct_currency() {
        return act_currency;
    }

    public void setAct_currency(String act_currency) {
        this.act_currency = act_currency;
    }

    public String getAct_name() {
        return act_name;
    }

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public String getAct_no() {
        return act_no;
    }

    public void setAct_no(String act_no) {
        this.act_no = act_no;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Boolean getIs_hide() {
        return is_hide;
    }

    public void setIs_hide(Boolean is_hide) {
        this.is_hide = is_hide;
    }

    public Integer getAccount_type_id() {
        return account_type_id;
    }

    public void setAccount_type_id(Integer account_type_id) {
        this.account_type_id = account_type_id;
    }

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }

    public Double getOver_limit() {
        return over_limit;
    }

    public void setOver_limit(Double over_limit) {
        this.over_limit = over_limit;
    }
}
