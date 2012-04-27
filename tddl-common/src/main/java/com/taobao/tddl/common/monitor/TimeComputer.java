/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.util.Date;
/**
 * 
 * @author junyu
 *
 */
public interface TimeComputer {
	/**
	 * �õ����������ĳ��ʱ��ļ��
	 * 
	 * @return �����
	 */
    public long getMostNearTimeInterval();
    
    /**
     * �õ�����������ĳ��ʱ��
     * 
     * @return Date
     */
    public Date getMostNearTime();
}