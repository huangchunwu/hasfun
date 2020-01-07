package cn.hasfun.framework.systemInfo;

import cn.hasfun.framework.utils.DateUtil;
import org.springframework.util.StringUtils;

import java.util.Date;

public class AppState {

    /**
     * 应用信息ID
     */
    private String appInfoId;


    /**
     * %CPU
     */
    private Double cpuPer;

    /**
     * %MEM
     */
    private Double memPer;

    /**
     * 添加时间
     * MM-dd hh:mm:ss
     */
    private String dateStr;

    /**
     * 创建时间
     */
    private Date createTime;


    public Double getCpuPer() {
        return cpuPer;
    }

    public void setCpuPer(Double cpuPer) {
        this.cpuPer = cpuPer;
    }


    public String getAppInfoId() {
        return appInfoId;
    }

    public void setAppInfoId(String appInfoId) {
        this.appInfoId = appInfoId;
    }

    public Double getMemPer() {
        return memPer;
    }

    public void setMemPer(Double memPer) {
        this.memPer = memPer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDateStr() {
        String str = DateUtil.getDateTimeString(createTime);
        if(!StringUtils.isEmpty(str)&&str.length()>16){
            return str.substring(5);
        }
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

}
