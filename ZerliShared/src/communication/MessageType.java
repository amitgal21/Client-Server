package communication;

public enum MessageType {

	/* Message from Server */
	CONFIRM_IP, WAIT_RESPONSE, SUCCEED, NOT_SUCCEED,
	ERROR, EXIT, LOGIN, LOGOUT, UPDATE, GET_ORDERS,
	GET_SELECTED_ORDER,GET_USERS, GET_PREMADE_ITEMS,
	GET_ACCOUNT_DETAILS, GET_SELFASSEMBLY_ITEMS,
	GET_STORE_NAME, INSERT_NEW_ORDER,GET_STORE_ID,
	GET_ORDER_BY_ID, GET_USERID_BY_ORDERID,
	INSERT_NEW_COMPLAIN, GET_SURVEY_NUMBER,
	INSERT_NEW_SURVEY, CHECK_EXIST_QOMPLAIN,
	CHECK_ORDER_BY_USERID, CHECK_IF_USERNAME_EXIST,
	INSERT_NEW_USER, INSERT_NEW_ACCOUNT, GET_COMPLAINTS,
	GET_COMPLAINT_BY_ID, UPDATE_REFUND, UPDATE_STATUS_COMPLAINT,
	GET_SINGLE_DELIVERY, UPDATE_CATALOG, ADD_NEW_ITEM, DELETE_ITEM,
	CANCEL_ORDER, UPDATE_USED_REFUND,
	GET_SINGLE_DELIVERY_BY_ORDER_ID,
	UPDATE_DELIVERY_STATUS,
	INSERT_TO_DELIVERY_TABLE,
	UPDATE_REFUND_BY_ORDERID,
	VIEW_SELF_DELIVERY_DETAILS,
	VIEW_SELF_DELIVERY_DETAILS_BY_ORDERID,
	GET_SINGLE_DELIVERY_BY_STORE_ID, GET_SURVEY_ANSWERS,
	INCOME_REPORT, GET_STORE_ID_BY_WORKER_ID, GRAPH_STATISTICS,
	GET_STORE_NAME_BY_ID, SAVE_ANALYSIS
	, GET_USERS_BY_ID, GET_MANAGER_ORDERS, GET_ORDER_BY_ORDER_ID, 
	GET_USER_BY_USER_ID, UPDATE_STATUS_BY_MANAGER,
	UPDATE_ORDER_STATUS_BY_MANAGER, CANCEL_ORDER_STATUS_BY_MANAGER,
	UPDATE_ORDERS_AMOUNT,
	GET_STORE_ID_BY_ORDER_ID, GET_ALL_COMPLAINTS, 
	UPDATE_REMINDER_FOR_HANDLER,GET_WORKERS, UPDATE_ROLE_BY_MANAGER,
	GET_STORE_ID_BY_ORD, GET_STORE_ORDERS, GET_SURVEY_QUS_BY_SURVEYNUM,
	UPDATE_SURVEY_ANS,COMPLAINT_REPORT, COMPLAINT_GRAPH_STATISTICS,
	ORDERS_REPORT, ORDER_GRAPH_STATISTICS, INCOME_QUARTER_GRAPH, GET_SURVEY_NUMBERS_COMBO ;

}