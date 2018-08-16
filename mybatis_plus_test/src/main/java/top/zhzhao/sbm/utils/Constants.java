package top.zhzhao.sbm.utils;
/**
 * 全局常量
 * @author zhzhao
 * @date 2017年11月3日
 */
public interface Constants {

	/**
	 * 用户状态
	 * @author zhzhao
	 */
	public interface UserStatus {
		String DIC_CODE = "USER_STAT";

		/**
		 * 启用
		 */
		String ENABLED = "USER_ENABLED";
		/**
		 * 停用
		 */
		String DISABLED = "USER_DISABLED";
		/**
		 * 过期
		 */
		String EXPIRED = "USER_EXPIRED";
		/**
		 * 离职(删除)
		 */
		String DIMISSION = "USER_DIMISSION";

	}

	/**
	 * 日志动作类型.
	 * @author zhzhao
	 */
	public interface ActionType {
		String LOGIN = "ACT_LOGIN";// 用户登录
	}

	
}
