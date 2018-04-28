package com.trust.entity.rnt;

import java.io.Serializable;

public class RntUserQuery implements Serializable {
    private Integer userId;

    private String nickname;

    private String phone;

    private Integer realnameStatus;

    private Integer productId;

    private Integer userStatus;

    public RntUserQuery(Integer userId, String nickname, String phone, Integer realnameStatus, Integer productId, Integer userStatus) {
        this.userId = userId;
        this.nickname = nickname;
        this.phone = phone;
        this.realnameStatus = realnameStatus;
        this.productId = productId;
        this.userStatus = userStatus;
    }

    public RntUserQuery(){}
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRealnameStatus() {
        return realnameStatus;
    }

    public void setRealnameStatus(Integer realnameStatus) {
        this.realnameStatus = realnameStatus;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RntUserQuery that = (RntUserQuery) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (realnameStatus != null ? !realnameStatus.equals(that.realnameStatus) : that.realnameStatus != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        return userStatus != null ? userStatus.equals(that.userStatus) : that.userStatus == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (realnameStatus != null ? realnameStatus.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RntUserQuery{" +
                "userId=" + userId +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", realnameStatus=" + realnameStatus +
                ", productId=" + productId +
                ", userStatus=" + userStatus +
                '}';
    }
}
