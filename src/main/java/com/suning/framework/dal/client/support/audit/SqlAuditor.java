/*
 * Copyright (C), 2002-2013, 苏宁易购电子商务有限公司
 * FileName:SqlAuditor .java
 * Author:   13092011
 * Date:     2013-12-1 下午5:09:34
 * Description: sql跟踪接口 
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.suning.framework.dal.client.support.audit;

/**
 * 描述：sql跟踪接口
 * @author 13092011/jorgie
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface SqlAuditor {
    
    /** 
     * 描述：跟踪处理方法<br>
     */
    void audit(String sql, Object param, long interval);
}
