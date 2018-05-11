package com.github.xc145214.adapter;

/**
 * 对象适配器
 */
public class OtherUserInfo implements IUserInfo {

    private IOuterUser outerUser = new OuterUser();

    @Override
    public String getUserName() {
        String userName = (String) this.outerUser.getUserBaseInfo().get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.outerUser.getUserHomeInfo().get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.outerUser.getUserBaseInfo().get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.outerUser.getUserOfficeInfo().get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.outerUser.getUserOfficeInfo().get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.outerUser.getUserHomeInfo().get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
