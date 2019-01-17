package cn.meko.po;

public class Items {
    private Integer itemsId;

    private String name;

    private String purPrice;

    private String pic;

    private String createdate;

    private String vote;

    private Integer typeId;

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(String purPrice) {
        this.purPrice = purPrice == null ? null : purPrice.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote == null ? null : vote.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}