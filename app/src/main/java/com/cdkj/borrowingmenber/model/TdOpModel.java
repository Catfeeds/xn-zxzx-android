package com.cdkj.borrowingmenber.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 李先俊 on 2017/12/14.
 */

public class TdOpModel {


    /**
     * travel_track_analysis_per_city : []
     * contact_manyheads_analysis : {"manyheads_top10_contact_recent6month_partnercode_count_avg":"0.60","manyheads_top10_contact_recent6month_partnercode_count_over2":"2","manyheads_top10_contact_recent1month_partnercode_count_avg":"0.10","manyheads_top10_contact_recent3month_partnercode_count_over2":"1","manyheads_top10_contact_recent6month_partnercode_count_max":"2","manyheads_top10_contact_recent3month_partnercode_count_max":"2","manyheads_top10_contact_recent1month_partnercode_count_max":"1","manyheads_top10_contact_recent1month_have_partnercode_count":"1","manyheads_top10_contact_recent3month_partnercode_count_avg":"0.40","manyheads_top10_contact_recent3month_have_partnercode_count":"3","manyheads_top10_contact_recent6month_have_partnercode_count":"4","manyheads_top10_contact_recent1month_partnercode_count_over2":"0"}
     * contact_area_stats_per_city : [{"call_count_holiday_3month":"33","call_count_call_time_over10min_6month":"2","contact_count_active_3month":"19","call_count_active_6month":"66","call_time_1month":"1791","call_time_6month":"10513","contact_area_city":"浙江省.杭州市","call_count_late_night_6month":"0","call_count_passive_6month":"112","call_time_active_6month":"5526","msg_count_6month":"1","contact_count_passive_6month":"59","call_count_call_time_5min10min_6month":"1","call_time_late_night_6month":"0","call_count_3month":"128","contact_count_1month":"22","call_count_work_time_3month":"77","call_count_workday_3month":"95","call_count_6month":"178","call_count_offwork_time_3month":"51","call_time_offwork_time_6month":"3796","call_count_offwork_time_6month":"73","call_time_offwork_time_3month":"2984","contact_count_mutual_3month":"11","call_count_1month":"40","call_time_passive_3month":"3676","call_count_call_time_less1min_6month":"133","contact_count_call_count_over10_3month":"2","call_count_workday_6month":"132","contact_count_call_count_over10_6month":"4","msg_count_1month":"0","contact_count_mutual_6month":"13","call_count_call_time_1min5min_6month":"42","call_count_holiday_6month":"46","contact_count_active_6month":"24","call_time_3month":"8455","msg_count_3month":"0","call_time_passive_6month":"4987","call_count_active_3month":"51","call_count_late_night_3month":"0","call_time_work_time_6month":"6717","call_count_work_time_6month":"105","call_time_late_night_3month":"0","call_time_active_3month":"4779","contact_count_passive_3month":"36","call_count_passive_3month":"77","call_time_work_time_3month":"5471","contact_count_3month":"44","contact_area_seq_no":"1","contact_count_6month":"70"},{"call_count_holiday_3month":"39","call_count_call_time_over10min_6month":"21","contact_count_active_3month":"9","call_count_active_6month":"52","call_time_1month":"9190","call_time_6month":"31770","contact_area_city":"福建省.泉州市","call_count_late_night_6month":"0","call_count_passive_6month":"48","call_time_active_6month":"20257","msg_count_6month":"1","contact_count_passive_6month":"14","call_count_call_time_5min10min_6month":"7","call_time_late_night_6month":"0","call_count_3month":"48","contact_count_1month":"6","call_count_work_time_3month":"31","call_count_workday_3month":"9","call_count_6month":"100","call_count_offwork_time_3month":"17","call_time_offwork_time_6month":"17216","call_count_offwork_time_6month":"43","call_time_offwork_time_3month":"6837","contact_count_mutual_3month":"3","call_count_1month":"10","call_time_passive_3month":"4189","call_count_call_time_less1min_6month":"51","contact_count_call_count_over10_3month":"2","call_count_workday_6month":"24","contact_count_call_count_over10_6month":"3","msg_count_1month":"0","contact_count_mutual_6month":"6","call_count_call_time_1min5min_6month":"21","call_count_holiday_6month":"76","contact_count_active_6month":"12","call_time_3month":"18258","msg_count_3month":"1","call_time_passive_6month":"11513","call_count_active_3month":"28","call_count_late_night_3month":"0","call_time_work_time_6month":"14554","call_count_work_time_6month":"57","call_time_late_night_3month":"0","call_time_active_3month":"14069","contact_count_passive_3month":"6","call_count_passive_3month":"20","call_time_work_time_3month":"11421","contact_count_3month":"12","contact_area_seq_no":"2","contact_count_6month":"20"},{"call_count_holiday_3month":"30","call_count_call_time_over10min_6month":"7","contact_count_active_3month":"5","call_count_active_6month":"33","call_time_1month":"2722","call_time_6month":"12366","contact_area_city":"福建省.福州市","call_count_late_night_6month":"0","call_count_passive_6month":"20","call_time_active_6month":"7052","msg_count_6month":"4","contact_count_passive_6month":"3","call_count_call_time_5min10min_6month":"3","call_time_late_night_6month":"0","call_count_3month":"42","contact_count_1month":"1","call_count_work_time_3month":"25","call_count_workday_3month":"12","call_count_6month":"53","call_count_offwork_time_3month":"17","call_time_offwork_time_6month":"5240","call_count_offwork_time_6month":"22","call_time_offwork_time_3month":"3824","contact_count_mutual_3month":"3","call_count_1month":"5","call_time_passive_3month":"5214","call_count_call_time_less1min_6month":"20","contact_count_call_count_over10_3month":"1","call_count_workday_6month":"17","contact_count_call_count_over10_6month":"1","msg_count_1month":"0","contact_count_mutual_6month":"3","call_count_call_time_1min5min_6month":"23","call_count_holiday_6month":"36","contact_count_active_6month":"9","call_time_3month":"10664","msg_count_3month":"0","call_time_passive_6month":"5314","call_count_active_3month":"24","call_count_late_night_3month":"0","call_time_work_time_6month":"7126","call_count_work_time_6month":"31","call_time_late_night_3month":"0","call_time_active_3month":"5450","contact_count_passive_3month":"3","call_count_passive_3month":"18","call_time_work_time_3month":"6840","contact_count_3month":"5","contact_area_seq_no":"3","contact_count_6month":"9"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"5","contact_count_active_3month":"3","call_count_active_6month":"12","call_time_1month":"0","call_time_6month":"9066","contact_area_city":"上海市.上海市","call_count_late_night_6month":"1","call_count_passive_6month":"11","call_time_active_6month":"7380","msg_count_6month":"0","contact_count_passive_6month":"7","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"8","call_count_3month":"20","contact_count_1month":"0","call_count_work_time_3month":"10","call_count_workday_3month":"20","call_count_6month":"23","call_count_offwork_time_3month":"9","call_time_offwork_time_6month":"8461","call_count_offwork_time_6month":"9","call_time_offwork_time_3month":"8461","contact_count_mutual_3month":"3","call_count_1month":"0","call_time_passive_3month":"1588","call_count_call_time_less1min_6month":"11","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"23","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"3","call_count_call_time_1min5min_6month":"7","call_count_holiday_6month":"0","contact_count_active_6month":"3","call_time_3month":"8968","msg_count_3month":"0","call_time_passive_6month":"1686","call_count_active_3month":"12","call_count_late_night_3month":"1","call_time_work_time_6month":"597","call_count_work_time_6month":"13","call_time_late_night_3month":"8","call_time_active_3month":"7380","contact_count_passive_3month":"5","call_count_passive_3month":"8","call_time_work_time_3month":"499","contact_count_3month":"5","contact_area_seq_no":"4","contact_count_6month":"7"},{"call_count_holiday_3month":"5","call_count_call_time_over10min_6month":"1","contact_count_active_3month":"3","call_count_active_6month":"8","call_time_1month":"778","call_time_6month":"2384","contact_area_city":"福建省.厦门市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"2330","msg_count_6month":"6","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"2","call_time_late_night_6month":"0","call_count_3month":"5","contact_count_1month":"1","call_count_work_time_3month":"2","call_count_workday_3month":"0","call_count_6month":"9","call_count_offwork_time_3month":"3","call_time_offwork_time_6month":"2081","call_count_offwork_time_6month":"5","call_time_offwork_time_3month":"1438","contact_count_mutual_3month":"1","call_count_1month":"1","call_time_passive_3month":"54","call_count_call_time_less1min_6month":"2","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"3","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"4","call_count_holiday_6month":"6","contact_count_active_6month":"6","call_time_3month":"1550","msg_count_3month":"6","call_time_passive_6month":"54","call_count_active_3month":"4","call_count_late_night_3month":"0","call_time_work_time_6month":"303","call_count_work_time_6month":"4","call_time_late_night_3month":"0","call_time_active_3month":"1496","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"112","contact_count_3month":"3","contact_area_seq_no":"5","contact_count_6month":"6"},{"call_count_holiday_3month":"24","call_count_call_time_over10min_6month":"16","contact_count_active_3month":"5","call_count_active_6month":"40","call_time_1month":"3538","call_time_6month":"24737","contact_area_city":"福建省.莆田市","call_count_late_night_6month":"0","call_count_passive_6month":"16","call_time_active_6month":"20649","msg_count_6month":"1","contact_count_passive_6month":"3","call_count_call_time_5min10min_6month":"9","call_time_late_night_6month":"0","call_count_3month":"35","contact_count_1month":"2","call_count_work_time_3month":"17","call_count_workday_3month":"11","call_count_6month":"56","call_count_offwork_time_3month":"18","call_time_offwork_time_6month":"14783","call_count_offwork_time_6month":"29","call_time_offwork_time_3month":"9378","contact_count_mutual_3month":"3","call_count_1month":"6","call_time_passive_3month":"2706","call_count_call_time_less1min_6month":"15","contact_count_call_count_over10_3month":"1","call_count_workday_6month":"18","contact_count_call_count_over10_6month":"1","msg_count_1month":"0","contact_count_mutual_6month":"3","call_count_call_time_1min5min_6month":"16","call_count_holiday_6month":"38","contact_count_active_6month":"5","call_time_3month":"15417","msg_count_3month":"1","call_time_passive_6month":"4088","call_count_active_3month":"23","call_count_late_night_3month":"0","call_time_work_time_6month":"9954","call_count_work_time_6month":"27","call_time_late_night_3month":"0","call_time_active_3month":"12711","contact_count_passive_3month":"3","call_count_passive_3month":"12","call_time_work_time_3month":"6039","contact_count_3month":"5","contact_area_seq_no":"6","contact_count_6month":"5"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"1","contact_count_active_3month":"3","call_count_active_6month":"3","call_time_1month":"0","call_time_6month":"1644","contact_area_city":"浙江省.金华市","call_count_late_night_6month":"0","call_count_passive_6month":"6","call_time_active_6month":"1029","msg_count_6month":"0","contact_count_passive_6month":"5","call_count_call_time_5min10min_6month":"1","call_time_late_night_6month":"0","call_count_3month":"8","contact_count_1month":"0","call_count_work_time_3month":"3","call_count_workday_3month":"8","call_count_6month":"9","call_count_offwork_time_3month":"5","call_time_offwork_time_6month":"1050","call_count_offwork_time_6month":"5","call_time_offwork_time_3month":"1050","contact_count_mutual_3month":"3","call_count_1month":"0","call_time_passive_3month":"598","call_count_call_time_less1min_6month":"4","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"9","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"3","call_count_call_time_1min5min_6month":"3","call_count_holiday_6month":"0","contact_count_active_6month":"3","call_time_3month":"1627","msg_count_3month":"0","call_time_passive_6month":"615","call_count_active_3month":"3","call_count_late_night_3month":"0","call_time_work_time_6month":"594","call_count_work_time_6month":"4","call_time_late_night_3month":"0","call_time_active_3month":"1029","contact_count_passive_3month":"4","call_count_passive_3month":"5","call_time_work_time_3month":"577","contact_count_3month":"4","contact_area_seq_no":"7","contact_count_6month":"5"},{"call_count_holiday_3month":"1","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"1","call_count_active_6month":"12","call_time_1month":"93","call_time_6month":"587","contact_area_city":"河南省.安阳市","call_count_late_night_6month":"0","call_count_passive_6month":"6","call_time_active_6month":"465","msg_count_6month":"0","contact_count_passive_6month":"5","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"6","contact_count_1month":"2","call_count_work_time_3month":"0","call_count_workday_3month":"5","call_count_6month":"18","call_count_offwork_time_3month":"6","call_time_offwork_time_6month":"493","call_count_offwork_time_6month":"12","call_time_offwork_time_3month":"270","contact_count_mutual_3month":"0","call_count_1month":"3","call_time_passive_3month":"19","call_count_call_time_less1min_6month":"15","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"16","contact_count_call_count_over10_6month":"1","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"3","call_count_holiday_6month":"2","contact_count_active_6month":"1","call_time_3month":"270","msg_count_3month":"0","call_time_passive_6month":"122","call_count_active_3month":"5","call_count_late_night_3month":"0","call_time_work_time_6month":"94","call_count_work_time_6month":"6","call_time_late_night_3month":"0","call_time_active_3month":"251","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"2","contact_area_seq_no":"8","contact_count_6month":"5"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"123","contact_area_city":"浙江省.宁波市","call_count_late_night_6month":"0","call_count_passive_6month":"3","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"3","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"3","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"8","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"3","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"2","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"1","contact_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"123","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"115","call_count_work_time_6month":"2","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"9","contact_count_6month":"3"},{"call_count_holiday_3month":"6","call_count_call_time_over10min_6month":"5","contact_count_active_3month":"2","call_count_active_6month":"8","call_time_1month":"7696","call_time_6month":"7934","contact_area_city":"吉林省.通化市","call_count_late_night_6month":"2","call_count_passive_6month":"4","call_time_active_6month":"4888","msg_count_6month":"0","contact_count_passive_6month":"2","call_count_call_time_5min10min_6month":"1","call_time_late_night_6month":"2394","call_count_3month":"12","contact_count_1month":"1","call_count_work_time_3month":"0","call_count_workday_3month":"6","call_count_6month":"12","call_count_offwork_time_3month":"10","call_time_offwork_time_6month":"5540","call_count_offwork_time_6month":"10","call_time_offwork_time_3month":"5540","contact_count_mutual_3month":"2","call_count_1month":"8","call_time_passive_3month":"3046","call_count_call_time_less1min_6month":"5","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"6","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"2","call_count_call_time_1min5min_6month":"1","call_count_holiday_6month":"6","contact_count_active_6month":"2","call_time_3month":"7934","msg_count_3month":"0","call_time_passive_6month":"3046","call_count_active_3month":"8","call_count_late_night_3month":"2","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"2394","call_time_active_3month":"4888","contact_count_passive_3month":"2","call_count_passive_3month":"4","call_time_work_time_3month":"0","contact_count_3month":"2","contact_area_seq_no":"10","contact_count_6month":"2"},{"call_count_holiday_3month":"2","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"2","call_count_active_6month":"5","call_time_1month":"0","call_time_6month":"43","contact_area_city":"广东省.深圳市","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"43","msg_count_6month":"0","contact_count_passive_6month":"0","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"5","contact_count_1month":"0","call_count_work_time_3month":"3","call_count_workday_3month":"3","call_count_6month":"5","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"40","call_count_offwork_time_6month":"2","call_time_offwork_time_3month":"40","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"5","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"3","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"2","contact_count_active_6month":"2","call_time_3month":"43","msg_count_3month":"0","call_time_passive_6month":"0","call_count_active_3month":"5","call_count_late_night_3month":"0","call_time_work_time_6month":"3","call_count_work_time_6month":"3","call_time_late_night_3month":"0","call_time_active_3month":"43","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"3","contact_count_3month":"2","contact_area_seq_no":"11","contact_count_6month":"2"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"316","contact_area_city":"湖北省.武汉市","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"2","call_count_call_time_5min10min_6month":"1","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"2","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"11","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"2","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"11","msg_count_3month":"0","call_time_passive_6month":"316","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"316","call_count_work_time_6month":"2","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"11","contact_count_3month":"1","contact_area_seq_no":"12","contact_count_6month":"2"},{"call_count_holiday_3month":"1","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"1","call_count_active_6month":"3","call_time_1month":"304","call_time_6month":"304","contact_area_city":"江苏省.苏州市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"295","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"4","contact_count_1month":"1","call_count_work_time_3month":"0","call_count_workday_3month":"3","call_count_6month":"4","call_count_offwork_time_3month":"4","call_time_offwork_time_6month":"304","call_count_offwork_time_6month":"4","call_time_offwork_time_3month":"304","contact_count_mutual_3month":"1","call_count_1month":"4","call_time_passive_3month":"9","call_count_call_time_less1min_6month":"3","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"3","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"1","call_count_holiday_6month":"1","contact_count_active_6month":"1","call_time_3month":"304","msg_count_3month":"0","call_time_passive_6month":"9","call_count_active_3month":"3","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"295","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"13","contact_count_6month":"1"},{"call_count_holiday_3month":"4","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"1","call_count_active_6month":"1","call_time_1month":"0","call_time_6month":"411","contact_area_city":"福建省.漳州市","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"20","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"4","contact_count_1month":"0","call_count_work_time_3month":"2","call_count_workday_3month":"0","call_count_6month":"5","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"41","call_count_offwork_time_6month":"2","call_time_offwork_time_3month":"41","contact_count_mutual_3month":"1","call_count_1month":"0","call_time_passive_3month":"206","call_count_call_time_less1min_6month":"2","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"0","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"3","call_count_holiday_6month":"5","contact_count_active_6month":"1","call_time_3month":"226","msg_count_3month":"0","call_time_passive_6month":"391","call_count_active_3month":"1","call_count_late_night_3month":"0","call_time_work_time_6month":"370","call_count_work_time_6month":"3","call_time_late_night_3month":"0","call_time_active_3month":"20","contact_count_passive_3month":"1","call_count_passive_3month":"3","call_time_work_time_3month":"185","contact_count_3month":"1","contact_area_seq_no":"14","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"1","call_count_active_6month":"1","call_time_1month":"0","call_time_6month":"76","contact_area_city":"安徽省.合肥市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"64","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"2","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"2","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"76","call_count_offwork_time_6month":"2","call_time_offwork_time_3month":"76","contact_count_mutual_3month":"1","call_count_1month":"0","call_time_passive_3month":"12","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"2","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"1","call_count_holiday_6month":"0","contact_count_active_6month":"1","call_time_3month":"76","msg_count_3month":"0","call_time_passive_6month":"12","call_count_active_3month":"1","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"64","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"15","contact_count_6month":"1"},{"call_count_holiday_3month":"4","call_count_call_time_over10min_6month":"1","contact_count_active_3month":"1","call_count_active_6month":"5","call_time_1month":"0","call_time_6month":"2523","contact_area_city":"江西省.赣州市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"2485","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"1","call_time_late_night_6month":"0","call_count_3month":"4","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"6","call_count_offwork_time_3month":"4","call_time_offwork_time_6month":"2523","call_count_offwork_time_6month":"6","call_time_offwork_time_3month":"171","contact_count_mutual_3month":"1","call_count_1month":"0","call_time_passive_3month":"38","call_count_call_time_less1min_6month":"3","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"0","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"1","call_count_holiday_6month":"6","contact_count_active_6month":"1","call_time_3month":"171","msg_count_3month":"0","call_time_passive_6month":"38","call_count_active_3month":"3","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"133","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"16","contact_count_6month":"1"},{"call_count_holiday_3month":"1","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"1","call_time_1month":"0","call_time_6month":"360","contact_area_city":"江苏省.南京市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"104","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"360","call_count_offwork_time_6month":"2","call_time_offwork_time_3month":"256","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"256","call_count_call_time_less1min_6month":"0","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"2","call_count_holiday_6month":"1","contact_count_active_6month":"1","call_time_3month":"256","msg_count_3month":"0","call_time_passive_6month":"256","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"17","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"1","call_time_1month":"0","call_time_6month":"11","contact_area_city":"陕西省.延安市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"1","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"2","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"2","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"1","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"10","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"11","call_count_work_time_6month":"2","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"18","contact_count_6month":"1"},{"call_count_holiday_3month":"1","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"28","call_time_6month":"77","contact_area_city":"江苏省.盐城市","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"2","contact_count_1month":"1","call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"2","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"77","call_count_offwork_time_6month":"2","call_time_offwork_time_3month":"77","contact_count_mutual_3month":"0","call_count_1month":"1","call_time_passive_3month":"77","call_count_call_time_less1min_6month":"2","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"1","contact_count_active_6month":"0","call_time_3month":"77","msg_count_3month":"0","call_time_passive_6month":"77","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"2","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"19","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"6","contact_area_city":"浙江省.温州市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"6","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"6","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"6","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"6","msg_count_3month":"0","call_time_passive_6month":"6","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"20","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"11","contact_area_city":"河南省.漯河市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"11","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"11","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"11","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"11","msg_count_3month":"0","call_time_passive_6month":"11","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"21","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"34","contact_area_city":"贵州省.贵阳市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"34","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"34","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"34","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"34","msg_count_3month":"0","call_time_passive_6month":"34","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"22","contact_count_6month":"1"},{"call_count_holiday_3month":"1","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"15","contact_area_city":"四川省.成都市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"15","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"15","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"15","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"0","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"1","contact_count_active_6month":"0","call_time_3month":"15","msg_count_3month":"0","call_time_passive_6month":"15","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"23","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"1","call_count_active_6month":"2","call_time_1month":"0","call_time_6month":"129","contact_area_city":"安徽省.淮南市","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"129","msg_count_6month":"0","contact_count_passive_6month":"0","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"2","contact_count_1month":"0","call_count_work_time_3month":"1","call_count_workday_3month":"2","call_count_6month":"2","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"71","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"71","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"2","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"1","call_count_holiday_6month":"0","contact_count_active_6month":"1","call_time_3month":"129","msg_count_3month":"0","call_time_passive_6month":"0","call_count_active_3month":"2","call_count_late_night_3month":"0","call_time_work_time_6month":"58","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"129","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"58","contact_count_3month":"1","contact_area_seq_no":"24","contact_count_6month":"1"},{"call_count_holiday_3month":"2","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"1","call_count_active_6month":"3","call_time_1month":"0","call_time_6month":"146","contact_area_city":"广东省.广州市","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"146","msg_count_6month":"0","contact_count_passive_6month":"0","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"3","contact_count_1month":"0","call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"3","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"78","call_count_offwork_time_6month":"2","call_time_offwork_time_3month":"78","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"2","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"1","call_count_holiday_6month":"2","contact_count_active_6month":"1","call_time_3month":"146","msg_count_3month":"0","call_time_passive_6month":"0","call_count_active_3month":"3","call_count_late_night_3month":"0","call_time_work_time_6month":"68","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"146","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"68","contact_count_3month":"1","contact_area_seq_no":"25","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"35","contact_area_city":"江西省.新余市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"35","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"35","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"35","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"35","msg_count_3month":"0","call_time_passive_6month":"35","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"26","contact_count_6month":"1"},{"call_count_holiday_3month":"1","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"23","contact_area_city":"江苏省.淮安市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"23","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"0","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"1","contact_count_active_6month":"0","call_time_3month":"23","msg_count_3month":"0","call_time_passive_6month":"23","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"23","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"23","contact_count_3month":"1","contact_area_seq_no":"27","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"14","contact_area_city":"浙江省.绍兴市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"14","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"14","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"14","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"14","msg_count_3month":"0","call_time_passive_6month":"14","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"28","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"8","contact_area_city":"江西省.上饶市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"8","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"8","msg_count_3month":"0","call_time_passive_6month":"8","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"8","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"8","contact_count_3month":"1","contact_area_seq_no":"29","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"115","contact_area_city":"湖南省.长沙市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"1","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"115","call_count_offwork_time_6month":"1","call_time_offwork_time_3month":"115","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"115","call_count_call_time_less1min_6month":"0","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"1","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"115","msg_count_3month":"0","call_time_passive_6month":"115","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"1","call_count_passive_3month":"1","call_time_work_time_3month":"0","contact_count_3month":"1","contact_area_seq_no":"30","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"20","contact_area_city":"新疆维吾尔自治区.昌吉回族自治州","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"20","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"20","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"31","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"44","contact_area_city":"河南省.南阳市","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"2","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"2","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"44","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"44","call_count_work_time_6month":"2","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"32","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"11","contact_area_city":"湖南省.张家界市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"11","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"11","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"33","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"14","contact_area_city":"山西省.运城市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"14","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"14","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"34","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"12","contact_area_city":"广东省.东莞市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"12","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"12","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"35","contact_count_6month":"1"},{"call_count_holiday_3month":"0","call_count_call_time_over10min_6month":"0","contact_count_active_3month":"0","call_count_active_6month":"0","call_time_1month":"0","call_time_6month":"13","contact_area_city":"贵州省.毕节市","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","msg_count_6month":"0","contact_count_passive_6month":"1","call_count_call_time_5min10min_6month":"0","call_time_late_night_6month":"0","call_count_3month":"0","contact_count_1month":"0","call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_offwork_time_3month":"0","contact_count_mutual_3month":"0","call_count_1month":"0","call_time_passive_3month":"0","call_count_call_time_less1min_6month":"1","contact_count_call_count_over10_3month":"0","call_count_workday_6month":"1","contact_count_call_count_over10_6month":"0","msg_count_1month":"0","contact_count_mutual_6month":"0","call_count_call_time_1min5min_6month":"0","call_count_holiday_6month":"0","contact_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"13","call_count_active_3month":"0","call_count_late_night_3month":"0","call_time_work_time_6month":"13","call_count_work_time_6month":"1","call_time_late_night_3month":"0","call_time_active_3month":"0","contact_count_passive_3month":"0","call_count_passive_3month":"0","call_time_work_time_3month":"0","contact_count_3month":"0","contact_area_seq_no":"36","contact_count_6month":"1"}]
     * mobile_info : {"identity_code":"2103**********2729","contact_addr":"未知","account_balance":"13631","user_mobile":"13110992819","mobile_net_addr":"福建省.泉州市","mobile_carrier":"中国联通","real_name":"孙雪","account_status":"正常","mobile_net_time":"2013-09-15","package_type":"沃4G","mobile_net_age":"50","email":"未知"}
     * carrier_consumption_stats : {"recharge_amount_3month":"42836","consume_amount_1month":"0","recharge_count_1month":"2","recharge_amount_6month":"42836","consume_amount_6month":"49155","recharge_count_3month":"8","recharge_amount_1month":"15000","consume_amount_3month":"23305","recharge_count_6month":"8"}
     * emergency_contact1_detail : null
     * carrier_consumption_stats_per_month : [{"consume_amount":"7420","recharge_amount":"5000","month":"2017-11","recharge_count":"1"},{"consume_amount":"15885","recharge_amount":"27836","month":"2017-10","recharge_count":"6"},{"consume_amount":"8620","recharge_amount":"0","month":"2017-09","recharge_count":"0"},{"consume_amount":"8225","recharge_amount":"0","month":"2017-08","recharge_count":"0"},{"consume_amount":"9005","recharge_amount":"0","month":"2017-07","recharge_count":"0"}]
     * emergency_contact2_detail : null
     * report_info : {"report_id":"MH201712141510153676576815592448","report_update_time":"2017-12-14 15:10:15","task_id":"TASKYYS100000201712141509520681100311","report_version":"v3.0","task_time":"2017-12-14 15:10:04"}
     * emergency_contact4_detail : null
     * emergency_contact3_detail : null
     * finance_contact_stats : [{"call_count_3month":"4","contact_count_1month":"0","call_count_6month":"4","call_count_active_6month":"4","call_time_3month":"316","msg_count_3month":"0","call_time_1month":"0","call_time_passive_6month":"0","call_count_active_3month":"4","call_time_6month":"316","contact_type":"投资理财","call_count_1month":"0","call_count_passive_6month":"0","call_time_active_6month":"316","call_time_passive_3month":"0","msg_count_6month":"0","contact_count_3month":"1","contact_count_6month":"1","msg_count_1month":"0","call_time_active_3month":"316","call_count_passive_3month":"0"},{"call_count_3month":"0","contact_count_1month":"0","call_count_6month":"4","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_1month":"0","call_time_passive_6month":"172","call_count_active_3month":"0","call_time_6month":"172","contact_type":"保险","call_count_1month":"0","call_count_passive_6month":"4","call_time_active_6month":"0","call_time_passive_3month":"0","msg_count_6month":"0","contact_count_3month":"0","contact_count_6month":"2","msg_count_1month":"0","call_time_active_3month":"0","call_count_passive_3month":"0"},{"call_count_3month":"1","contact_count_1month":"0","call_count_6month":"3","call_count_active_6month":"3","call_time_3month":"321","msg_count_3month":"0","call_time_1month":"0","call_time_passive_6month":"0","call_count_active_3month":"1","call_time_6month":"473","contact_type":"银行","call_count_1month":"0","call_count_passive_6month":"0","call_time_active_6month":"473","call_time_passive_3month":"0","msg_count_6month":"0","contact_count_3month":"1","contact_count_6month":"1","msg_count_1month":"0","call_time_active_3month":"321","call_count_passive_3month":"0"}]
     * data_completeness : {"is_call_data_complete_3month":"是","is_msg_data_complete_6month":"是","data_completeness_per_month":[{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-07","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-08","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-09","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-10","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-11","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-12","is_call_data_complete":"是"}],"is_msg_data_complete_1month":"是","is_consume_data_complete_1month":"是","is_consume_data_complete_6month":"是","is_call_data_complete_1month":"是","is_consume_data_complete_3month":"是","is_call_data_complete_6month":"是","is_msg_data_complete_3month":"是"}
     * user_info : {"identity_code":"350322199402131552","home_tel":null,"hometown":"福建省.莆田市","gender":"男","constellation":"水瓶座","work_tel":null,"company_name":null,"work_addr":null,"home_addr":null,"real_name":"陈山","email":null,"age":"23"}
     * contact_creditscore_analysis : {"creditscore_top10_contact_count":"5","creditscore_top10_contact_median":"704.00","creditscore_top10_contact_avg":"738.00","creditscore_top10_contact_min":"679.00","creditscore_top10_contact_max":"853.00"}
     * behavior_analysis : {"emergency_contact3_analysis_6month":"无数据","late_night_analysis_6month":"正常活动","call_120_analysis_6month":"从未通话","emergency_contact4_analysis_6month":"无数据","call_lawyer_analysis_6month":"从未通话","emergency_contact2_analysis_6month":"无数据","mutual_number_analysis_6month":"数量正常","loan_contact_analysis_6month":"从未通话","emergency_contact5_analysis_6month":"无数据","emergency_contact1_analysis_6month":"无数据","collection_contact_analysis_6month":"从未通话","call_110_analysis_6month":"从未通话","call_court_analysis_6month":"从未通话","mobile_net_age_analysis":"使用时间2年到5年","mobile_silence_analysis_6month":"正常静默","call_macau_analysis_6month":"从未通话"}
     * risk_contact_detail : []
     * all_contact_stats : {"call_count_holiday_3month":"172","call_count_call_time_over10min_6month":"60","contact_count_active_3month":"65","call_count_active_6month":"286","call_time_1month":"26140","call_time_active_mobile_6month":"72379","call_time_6month":"112356","call_count_late_night_6month":"3","call_count_passive_6month":"270","call_time_active_6month":"78317","msg_count_6month":"14","contact_count_passive_6month":"134","call_count_call_time_5min10min_6month":"32","call_time_passive_mobile_6month":"32007","call_time_late_night_6month":"2402","call_count_3month":"373","contact_count_1month":"37","call_count_work_time_3month":"200","call_count_workday_3month":"201","call_count_6month":"557","call_count_offwork_time_3month":"170","call_time_offwork_time_6month":"63594","call_count_offwork_time_6month":"249","call_time_offwork_time_3month":"41796","contact_count_mutual_3month":"35","call_count_1month":"78","contact_count_telephone_6month":"24","call_time_passive_3month":"22651","call_count_call_time_less1min_6month":"314","contact_count_call_count_over10_3month":"6","call_count_workday_6month":"308","contact_count_call_count_over10_6month":"12","msg_count_1month":"0","contact_count_mutual_6month":"43","call_count_call_time_1min5min_6month":"151","call_count_holiday_6month":"249","contact_count_active_6month":"83","call_time_3month":"79781","msg_count_3month":"9","call_time_passive_6month":"33969","call_count_active_3month":"198","call_count_late_night_3month":"3","call_time_work_time_6month":"46360","call_count_work_time_6month":"305","call_time_late_night_3month":"2402","call_time_active_3month":"57060","contact_count_not_mobile_telephone_6month":"14","contact_count_passive_3month":"83","call_count_passive_3month":"174","call_count_active_late_night_6month":"1","call_time_work_time_3month":"35583","contact_count_mobile_6month":"137","call_count_passive_late_night_6month":"2","contact_count_3month":"114","contact_count_6month":"175"}
     * work_tel_detail : null
     * info_check : {"is_contact4_called_6month":"无数据","is_net_addr_call_addr_3month":"无数据","is_identity_code_reliable":"是","is_contact2_called_6month":"无数据","is_work_tel_called_6month":"无数据","is_contact3_called_6month":"无数据","is_net_age_over_3month":"是","is_mobile_status_active":"是","is_contact1_called_6month":"无数据","is_home_tel_called_6month":"无数据","is_contact5_called_6month":"无数据","is_net_addr_call_addr_1month":"无数据","is_identity_code_valid":"是","is_net_addr_call_addr_6month":"无数据"}
     * info_match : {"real_name_check_yys":"不匹配","email_check_yys":"无数据","identity_code_check_yys":"不匹配","home_addr_check_yys":"无数据"}
     * contact_blacklist_analysis : {"black_top10_contact_carloan_blacklist_count_ratio":"0.00","black_top10_contact_fakemobile_count_ratio":"0.00","black_top10_contact_over2_count_ratio":"0.00","black_top10_contact_paymentfraud_count_ratio":"0.00","black_top10_contact_discreditrepay_count_ratio":"0.00","black_top10_contact_total_count_ratio":"0.00","black_top10_contact_creditcrack_count_ratio":"0.00","black_top10_contact_studentloans_overdue_count_ratio":"0.00","black_top10_contact_scalping_count_ratio":"0.00"}
     * emergency_contact5_detail : null
     * all_contact_detail : [{"call_count_holiday_3month":"14","call_count_holiday_6month":"27","contact_attribute":"手机号码","call_count_active_6month":"28","call_time_3month":"11402","msg_count_3month":"0","call_time_passive_6month":"2517","call_time_1month":"2899","call_count_active_3month":"15","call_time_6month":"18866","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"11","call_time_active_6month":"16349","call_time_work_time_6month":"8098","msg_count_6month":"0","call_count_work_time_6month":"19","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-03 19:50:36","call_time_active_3month":"10011","call_time_late_night_6month":"0","call_count_passive_3month":"8","call_count_3month":"23","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"11","call_count_workday_3month":"9","call_count_6month":"39","is_virtual_number":"否","call_count_offwork_time_3month":"12","call_time_offwork_time_6month":"10768","call_count_offwork_time_6month":"20","call_time_work_time_3month":"4492","call_time_offwork_time_3month":"6910","average_gap_day_call_6month":"5.68","contact_number":"15959433160","contact_area":"福建省.莆田市","call_count_1week":"1","contact_seq_no":"1","is_whole_day_call_3month":"否","max_gap_day_call_6month":"14","call_count_1month":"5","call_time_passive_3month":"1391","is_whole_day_call_6month":"否","call_count_workday_6month":"12","last_time_call_6month":"2017-12-09 10:03:56","msg_count_1month":"0"},{"call_count_holiday_3month":"11","call_count_holiday_6month":"31","contact_attribute":"手机号码","call_count_active_6month":"12","call_time_3month":"3470","msg_count_3month":"0","call_time_passive_6month":"4145","call_time_1month":"2249","call_count_active_3month":"4","call_time_6month":"6893","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"22","call_time_active_6month":"2748","call_time_work_time_6month":"3557","msg_count_6month":"0","call_count_work_time_6month":"24","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-03 19:06:59","call_time_active_3month":"2422","call_time_late_night_6month":"0","call_count_passive_3month":"7","call_count_3month":"11","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"9","call_count_workday_3month":"0","call_count_6month":"34","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"3336","call_count_offwork_time_6month":"10","call_time_work_time_3month":"2607","call_time_offwork_time_3month":"863","average_gap_day_call_6month":"12.23","contact_number":"15359600858","contact_area":"福建省.泉州市","call_count_1week":"2","contact_seq_no":"2","is_whole_day_call_3month":"否","max_gap_day_call_6month":"42","call_count_1month":"2","call_time_passive_3month":"1048","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-12-09 14:28:06","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"9","call_time_3month":"1931","msg_count_3month":"0","call_time_passive_6month":"1593","call_time_1month":"0","call_count_active_3month":"9","call_time_6month":"1931","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"21","call_time_active_6month":"338","call_time_work_time_6month":"1689","msg_count_6month":"0","call_count_work_time_6month":"26","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-23 14:17:35","call_time_active_3month":"338","call_time_late_night_6month":"0","call_count_passive_3month":"21","call_count_3month":"30","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"26","call_count_workday_3month":"30","call_count_6month":"30","is_virtual_number":"否","call_count_offwork_time_3month":"4","call_time_offwork_time_6month":"242","call_count_offwork_time_6month":"4","call_time_work_time_3month":"1689","call_time_offwork_time_3month":"242","average_gap_day_call_6month":"1.67","contact_number":"18698571507","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"3","is_whole_day_call_3month":"否","max_gap_day_call_6month":"3","call_count_1month":"0","call_time_passive_3month":"1593","is_whole_day_call_6month":"否","call_count_workday_6month":"30","last_time_call_6month":"2017-11-02 16:17:25","msg_count_1month":"0"},{"call_count_holiday_3month":"15","call_count_holiday_6month":"15","contact_attribute":"手机号码","call_count_active_6month":"13","call_time_3month":"7129","msg_count_3month":"0","call_time_passive_6month":"4551","call_time_1month":"2722","call_count_active_3month":"13","call_time_6month":"7129","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"12","call_time_active_6month":"2578","call_time_work_time_6month":"3623","msg_count_6month":"0","call_count_work_time_6month":"12","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-06 13:49:40","call_time_active_3month":"2578","call_time_late_night_6month":"0","call_count_passive_3month":"12","call_count_3month":"25","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"12","call_count_workday_3month":"10","call_count_6month":"25","is_virtual_number":"否","call_count_offwork_time_3month":"13","call_time_offwork_time_6month":"3506","call_count_offwork_time_6month":"13","call_time_work_time_3month":"3623","call_time_offwork_time_3month":"3506","average_gap_day_call_6month":"8.00","contact_number":"17859502784","contact_area":"福建省.福州市","call_count_1week":"3","contact_seq_no":"4","is_whole_day_call_3month":"否","max_gap_day_call_6month":"18","call_count_1month":"5","call_time_passive_3month":"4551","is_whole_day_call_6month":"否","call_count_workday_6month":"10","last_time_call_6month":"2017-12-09 20:53:06","msg_count_1month":"0"},{"call_count_holiday_3month":"4","call_count_holiday_6month":"10","contact_attribute":"手机号码","call_count_active_6month":"13","call_time_3month":"3514","msg_count_3month":"0","call_time_passive_6month":"1303","call_time_1month":"86","call_count_active_3month":"6","call_time_6month":"9703","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"3","call_time_active_6month":"8400","call_time_work_time_6month":"2283","msg_count_6month":"0","call_count_work_time_6month":"4","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-01 20:18:17","call_time_active_3month":"2901","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"7","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"3","call_count_6month":"16","is_virtual_number":"否","call_count_offwork_time_3month":"5","call_time_offwork_time_6month":"7420","call_count_offwork_time_6month":"12","call_time_work_time_3month":"428","call_time_offwork_time_3month":"3086","average_gap_day_call_6month":"10.43","contact_number":"15359600287","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"5","is_whole_day_call_3month":"否","max_gap_day_call_6month":"28","call_count_1month":"1","call_time_passive_3month":"613","is_whole_day_call_6month":"否","call_count_workday_6month":"6","last_time_call_6month":"2017-11-24 18:54:54","msg_count_1month":"0"},{"call_count_holiday_3month":"3","call_count_holiday_6month":"5","contact_attribute":"手机号码","call_count_active_6month":"8","call_time_3month":"1948","msg_count_3month":"0","call_time_passive_6month":"331","call_time_1month":"222","call_count_active_3month":"6","call_time_6month":"2308","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"6","call_time_active_6month":"1977","call_time_work_time_6month":"1043","msg_count_6month":"0","call_count_work_time_6month":"4","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-13 19:52:59","call_time_active_3month":"1739","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"8","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"5","call_count_6month":"14","is_virtual_number":"否","call_count_offwork_time_3month":"5","call_time_offwork_time_6month":"1265","call_count_offwork_time_6month":"10","call_time_work_time_3month":"1021","call_time_offwork_time_3month":"927","average_gap_day_call_6month":"15.22","contact_number":"18767101909","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"6","is_whole_day_call_3month":"否","max_gap_day_call_6month":"26","call_count_1month":"2","call_time_passive_3month":"209","is_whole_day_call_6month":"否","call_count_workday_6month":"9","last_time_call_6month":"2017-11-27 19:02:02","msg_count_1month":"0"},{"call_count_holiday_3month":"5","call_count_holiday_6month":"7","contact_attribute":"手机号码","call_count_active_6month":"10","call_time_3month":"1065","msg_count_3month":"0","call_time_passive_6month":"271","call_time_1month":"135","call_count_active_3month":"6","call_time_6month":"1258","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"987","call_time_work_time_6month":"565","msg_count_6month":"0","call_count_work_time_6month":"9","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-22 09:42:38","call_time_active_3month":"794","call_time_late_night_6month":"0","call_count_passive_3month":"4","call_count_3month":"10","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"7","call_count_workday_3month":"5","call_count_6month":"14","is_virtual_number":"否","call_count_offwork_time_3month":"3","call_time_offwork_time_6month":"693","call_count_offwork_time_6month":"5","call_time_work_time_3month":"442","call_time_offwork_time_3month":"623","average_gap_day_call_6month":"11.82","contact_number":"13958092437","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"7","is_whole_day_call_3month":"否","max_gap_day_call_6month":"38","call_count_1month":"3","call_time_passive_3month":"271","is_whole_day_call_6month":"否","call_count_workday_6month":"7","last_time_call_6month":"2017-11-29 12:36:05","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"12","call_time_3month":"251","msg_count_3month":"0","call_time_passive_6month":"26","call_time_1month":"74","call_count_active_3month":"5","call_time_6month":"491","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"465","call_time_work_time_6month":"17","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-04 09:04:57","call_time_active_3month":"251","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"5","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"4","call_count_6month":"13","is_virtual_number":"否","call_count_offwork_time_3month":"5","call_time_offwork_time_6month":"474","call_count_offwork_time_6month":"11","call_time_work_time_3month":"0","call_time_offwork_time_3month":"251","average_gap_day_call_6month":"14.90","contact_number":"15738777150","contact_area":"河南省.安阳市","call_count_1week":"0","contact_seq_no":"8","is_whole_day_call_3month":"否","max_gap_day_call_6month":"44","call_count_1month":"2","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"11","last_time_call_6month":"2017-11-30 18:55:45","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"4","contact_attribute":"手机号码","call_count_active_6month":"9","call_time_3month":"365","msg_count_3month":"0","call_time_passive_6month":"85","call_time_1month":"365","call_count_active_3month":"5","call_time_6month":"556","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"3","call_time_active_6month":"471","call_time_work_time_6month":"319","msg_count_6month":"0","call_count_work_time_6month":"7","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-22 09:31:27","call_time_active_3month":"288","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"7","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"5","call_count_workday_3month":"7","call_count_6month":"12","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"237","call_count_offwork_time_6month":"5","call_time_work_time_3month":"256","call_time_offwork_time_3month":"109","average_gap_day_call_6month":"22.83","contact_number":"15658019468","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"9","is_whole_day_call_3month":"否","max_gap_day_call_6month":"86","call_count_1month":"7","call_time_passive_3month":"77","is_whole_day_call_6month":"否","call_count_workday_6month":"8","last_time_call_6month":"2017-12-06 16:10:41","msg_count_1month":"0"},{"call_count_holiday_3month":"12","call_count_holiday_6month":"12","contact_attribute":"手机号码","call_count_active_6month":"5","call_time_3month":"459","msg_count_3month":"0","call_time_passive_6month":"248","call_time_1month":"0","call_count_active_3month":"5","call_time_6month":"459","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"7","call_time_active_6month":"211","call_time_work_time_6month":"258","msg_count_6month":"0","call_count_work_time_6month":"6","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-02 20:02:44","call_time_active_3month":"211","call_time_late_night_6month":"0","call_count_passive_3month":"7","call_count_3month":"12","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"6","call_count_workday_3month":"0","call_count_6month":"12","is_virtual_number":"否","call_count_offwork_time_3month":"6","call_time_offwork_time_6month":"201","call_count_offwork_time_6month":"6","call_time_work_time_3month":"258","call_time_offwork_time_3month":"201","average_gap_day_call_6month":"1.00","contact_number":"13285039818","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"10","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"0","call_time_passive_3month":"248","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-06 14:07:42","msg_count_1month":"0"},{"call_count_holiday_3month":"4","call_count_holiday_6month":"4","contact_attribute":"其他号码","call_count_active_6month":"9","call_time_3month":"1461","msg_count_3month":"0","call_time_passive_6month":"19","call_time_1month":"0","call_count_active_3month":"4","call_time_6month":"2281","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"2262","call_time_work_time_6month":"2281","msg_count_6month":"0","call_count_work_time_6month":"10","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-02 16:48:37","call_time_active_3month":"1442","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"5","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"5","call_count_workday_3month":"1","call_count_6month":"10","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"1461","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"20.00","contact_number":"95187","contact_area":null,"call_count_1week":"0","contact_seq_no":"11","is_whole_day_call_3month":"否","max_gap_day_call_6month":"53","call_count_1month":"0","call_time_passive_3month":"19","is_whole_day_call_6month":"否","call_count_workday_6month":"6","last_time_call_6month":"2017-10-21 11:40:22","msg_count_1month":"0"},{"call_count_holiday_3month":"5","call_count_holiday_6month":"6","contact_attribute":"其他号码","call_count_active_6month":"5","call_time_3month":"1165","msg_count_3month":"0","call_time_passive_6month":"591","call_time_1month":"0","call_count_active_3month":"5","call_time_6month":"1239","contact_type":"运营商","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"5","call_time_active_6month":"648","call_time_work_time_6month":"1221","msg_count_6month":"0","call_count_work_time_6month":"9","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-03 10:00:42","call_time_active_3month":"648","call_time_late_night_6month":"0","call_count_passive_3month":"4","call_count_3month":"9","contact_name":"中国联通客服热线","contact_relation":null,"call_count_work_time_3month":"8","call_count_workday_3month":"4","call_count_6month":"10","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"18","call_count_offwork_time_6month":"1","call_time_work_time_3month":"1147","call_time_offwork_time_3month":"18","average_gap_day_call_6month":"9.33","contact_number":"10010","contact_area":null,"call_count_1week":"0","contact_seq_no":"12","is_whole_day_call_3month":"否","max_gap_day_call_6month":"25","call_count_1month":"0","call_time_passive_3month":"517","is_whole_day_call_6month":"否","call_count_workday_6month":"4","last_time_call_6month":"2017-10-29 14:20:03","msg_count_1month":"0"},{"call_count_holiday_3month":"3","call_count_holiday_6month":"3","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"440","msg_count_3month":"0","call_time_passive_6month":"177","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"492","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"6","call_time_active_6month":"315","call_time_work_time_6month":"266","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-08 23:34:13","call_time_active_3month":"315","call_time_late_night_6month":"0","call_count_passive_3month":"5","call_count_3month":"8","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"5","call_count_6month":"9","is_virtual_number":"否","call_count_offwork_time_3month":"6","call_time_offwork_time_6month":"226","call_count_offwork_time_6month":"7","call_time_work_time_3month":"266","call_time_offwork_time_3month":"174","average_gap_day_call_6month":"6.75","contact_number":"15268501481","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"13","is_whole_day_call_3month":"否","max_gap_day_call_6month":"21","call_count_1month":"0","call_time_passive_3month":"125","is_whole_day_call_6month":"否","call_count_workday_6month":"6","last_time_call_6month":"2017-11-01 23:01:16","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"6","call_time_3month":"8342","msg_count_3month":"0","call_time_passive_6month":"1284","call_time_1month":"0","call_count_active_3month":"6","call_time_6month":"8342","contact_type":null,"call_count_late_night_3month":"1","call_count_late_night_6month":"1","call_count_passive_6month":"2","call_time_active_6month":"7058","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"8","first_time_call_6month":"2017-11-01 22:43:19","call_time_active_3month":"7058","call_time_late_night_6month":"8","call_count_passive_3month":"2","call_count_3month":"8","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"8","call_count_6month":"8","is_virtual_number":"否","call_count_offwork_time_3month":"7","call_time_offwork_time_6month":"8334","call_count_offwork_time_6month":"7","call_time_work_time_3month":"0","call_time_offwork_time_3month":"8334","average_gap_day_call_6month":"2.67","contact_number":"15201827570","contact_area":"上海市.上海市","call_count_1week":"0","contact_seq_no":"14","is_whole_day_call_3month":"否","max_gap_day_call_6month":"5","call_count_1month":"0","call_time_passive_3month":"1284","is_whole_day_call_6month":"否","call_count_workday_6month":"8","last_time_call_6month":"2017-11-09 20:40:10","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"5","call_time_3month":"7696","msg_count_3month":"0","call_time_passive_6month":"3027","call_time_1month":"7696","call_count_active_3month":"5","call_time_6month":"7696","contact_type":null,"call_count_late_night_3month":"2","call_count_late_night_6month":"2","call_count_passive_6month":"3","call_time_active_6month":"4669","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"2394","first_time_call_6month":"2017-11-23 21:09:16","call_time_active_3month":"4669","call_time_late_night_6month":"2394","call_count_passive_3month":"3","call_count_3month":"8","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"6","call_count_6month":"8","is_virtual_number":"否","call_count_offwork_time_3month":"6","call_time_offwork_time_6month":"5302","call_count_offwork_time_6month":"6","call_time_work_time_3month":"0","call_time_offwork_time_3month":"5302","average_gap_day_call_6month":"1.33","contact_number":"18643596191","contact_area":"吉林省.通化市","call_count_1week":"0","contact_seq_no":"15","is_whole_day_call_3month":"否","max_gap_day_call_6month":"2","call_count_1month":"8","call_time_passive_3month":"3027","is_whole_day_call_6month":"否","call_count_workday_6month":"6","last_time_call_6month":"2017-11-27 00:39:42","msg_count_1month":"0"},{"call_count_holiday_3month":"8","call_count_holiday_6month":"8","contact_attribute":"手机号码","call_count_active_6month":"4","call_time_3month":"552","msg_count_3month":"0","call_time_passive_6month":"382","call_time_1month":"0","call_count_active_3month":"4","call_time_6month":"552","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"170","call_time_work_time_6month":"453","msg_count_6month":"0","call_count_work_time_6month":"7","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-04 16:58:08","call_time_active_3month":"170","call_time_late_night_6month":"0","call_count_passive_3month":"4","call_count_3month":"8","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"7","call_count_workday_3month":"0","call_count_6month":"8","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"99","call_count_offwork_time_6month":"1","call_time_work_time_3month":"453","call_time_offwork_time_3month":"99","average_gap_day_call_6month":"1.00","contact_number":"18046005023","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"16","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"0","call_time_passive_3month":"382","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-05 16:36:59","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"4","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"2518","msg_count_3month":"0","call_time_passive_6month":"381","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"2654","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"2273","call_time_work_time_6month":"2554","msg_count_6month":"0","call_count_work_time_6month":"5","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-21 19:04:26","call_time_active_3month":"2237","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"4","call_count_workday_3month":"2","call_count_6month":"7","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"100","call_count_offwork_time_6month":"2","call_time_work_time_3month":"2518","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"26.75","contact_number":"15880175829","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"17","is_whole_day_call_3month":"否","max_gap_day_call_6month":"60","call_count_1month":"0","call_time_passive_3month":"281","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-11-05 16:47:09","msg_count_1month":"0"},{"call_count_holiday_3month":"5","call_count_holiday_6month":"5","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"487","msg_count_3month":"0","call_time_passive_6month":"354","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"487","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"5","call_time_active_6month":"133","call_time_work_time_6month":"487","msg_count_6month":"0","call_count_work_time_6month":"7","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-06 16:02:13","call_time_active_3month":"133","call_time_late_night_6month":"0","call_count_passive_3month":"5","call_count_3month":"7","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"7","call_count_workday_3month":"2","call_count_6month":"7","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"487","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"2.00","contact_number":"13750837935","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"18","is_whole_day_call_3month":"否","max_gap_day_call_6month":"4","call_count_1month":"0","call_time_passive_3month":"354","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-11-12 14:39:47","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"5","call_time_3month":"391","msg_count_3month":"0","call_time_passive_6month":"87","call_time_1month":"0","call_count_active_3month":"5","call_time_6month":"391","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"304","call_time_work_time_6month":"391","msg_count_6month":"0","call_count_work_time_6month":"7","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-27 11:08:09","call_time_active_3month":"304","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"7","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"7","call_count_workday_3month":"7","call_count_6month":"7","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"391","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"2.33","contact_number":"02126107579","contact_area":"上海市.上海市","call_count_1week":"0","contact_seq_no":"19","is_whole_day_call_3month":"否","max_gap_day_call_6month":"3","call_count_1month":"0","call_time_passive_3month":"87","is_whole_day_call_6month":"否","call_count_workday_6month":"7","last_time_call_6month":"2017-11-03 10:28:52","msg_count_1month":"0"},{"call_count_holiday_3month":"4","call_count_holiday_6month":"6","contact_attribute":"手机号码","call_count_active_6month":"5","call_time_3month":"171","msg_count_3month":"0","call_time_passive_6month":"38","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"2523","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"2485","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-10 21:53:12","call_time_active_3month":"133","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"6","is_virtual_number":"否","call_count_offwork_time_3month":"4","call_time_offwork_time_6month":"2523","call_count_offwork_time_6month":"6","call_time_work_time_3month":"0","call_time_offwork_time_3month":"171","average_gap_day_call_6month":"8.33","contact_number":"15707977622","contact_area":"江西省.赣州市","call_count_1week":"0","contact_seq_no":"20","is_whole_day_call_3month":"否","max_gap_day_call_6month":"22","call_count_1month":"0","call_time_passive_3month":"38","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-05 20:37:15","msg_count_1month":"0"},{"call_count_holiday_3month":"5","call_count_holiday_6month":"5","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"918","msg_count_3month":"1","call_time_passive_6month":"932","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"1174","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"242","call_time_work_time_6month":"1117","msg_count_6month":"1","call_count_work_time_6month":"5","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-15 12:06:01","call_time_active_3month":"242","call_time_late_night_6month":"0","call_count_passive_3month":"3","call_count_3month":"5","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"4","call_count_workday_3month":"0","call_count_6month":"6","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"57","call_count_offwork_time_6month":"1","call_time_work_time_3month":"861","call_time_offwork_time_3month":"57","average_gap_day_call_6month":"16.75","contact_number":"13615934997","contact_area":"福建省.莆田市","call_count_1week":"0","contact_seq_no":"21","is_whole_day_call_3month":"否","max_gap_day_call_6month":"47","call_count_1month":"0","call_time_passive_3month":"676","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-21 14:24:15","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"5","contact_attribute":"手机号码","call_count_active_6month":"5","call_time_3month":"431","msg_count_3month":"0","call_time_passive_6month":"82","call_time_1month":"431","call_count_active_3month":"1","call_time_6month":"708","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"626","call_time_work_time_6month":"259","msg_count_6month":"0","call_count_work_time_6month":"4","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-19 14:25:37","call_time_active_3month":"431","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"6","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"449","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"431","average_gap_day_call_6month":"45.00","contact_number":"18159366772","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"22","is_whole_day_call_3month":"否","max_gap_day_call_6month":"89","call_count_1month":"1","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-17 23:55:22","msg_count_1month":"0"},{"call_count_holiday_3month":"4","call_count_holiday_6month":"5","contact_attribute":"手机号码","call_count_active_6month":"5","call_time_3month":"447","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"4","call_time_6month":"504","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"504","call_time_work_time_6month":"303","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-08 09:56:23","call_time_active_3month":"447","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"0","call_count_6month":"5","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"201","call_count_offwork_time_6month":"2","call_time_work_time_3month":"246","call_time_offwork_time_3month":"201","average_gap_day_call_6month":"44.00","contact_number":"13067455995","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"23","is_whole_day_call_3month":"否","max_gap_day_call_6month":"87","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-04 17:02:51","msg_count_1month":"0"},{"call_count_holiday_3month":"4","call_count_holiday_6month":"5","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"226","msg_count_3month":"0","call_time_passive_6month":"391","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"411","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"20","call_time_work_time_6month":"370","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-23 12:24:46","call_time_active_3month":"20","call_time_late_night_6month":"0","call_count_passive_3month":"3","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"0","call_count_6month":"5","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"41","call_count_offwork_time_6month":"2","call_time_work_time_3month":"185","call_time_offwork_time_3month":"41","average_gap_day_call_6month":"36.00","contact_number":"18876309970","contact_area":"福建省.漳州市","call_count_1week":"0","contact_seq_no":"24","is_whole_day_call_3month":"否","max_gap_day_call_6month":"71","call_count_1month":"0","call_time_passive_3month":"206","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-03 17:21:56","msg_count_1month":"0"},{"call_count_holiday_3month":"4","call_count_holiday_6month":"4","contact_attribute":"固定电话","call_count_active_6month":"5","call_time_3month":"119","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"5","call_time_6month":"119","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"119","call_time_work_time_6month":"105","msg_count_6month":"0","call_count_work_time_6month":"4","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-17 10:16:18","call_time_active_3month":"119","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"5","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"4","call_count_workday_3month":"1","call_count_6month":"5","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"14","call_count_offwork_time_6month":"1","call_time_work_time_3month":"105","call_time_offwork_time_3month":"14","average_gap_day_call_6month":"5.33","contact_number":"05951001011","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"25","is_whole_day_call_3month":"否","max_gap_day_call_6month":"12","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-03 10:39:44","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"2242","msg_count_3month":"0","call_time_passive_6month":"4155","call_time_1month":"2242","call_count_active_3month":"0","call_time_6month":"4155","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-14 22:54:59","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"4155","call_count_offwork_time_6month":"4","call_time_work_time_3month":"0","call_time_offwork_time_3month":"2242","average_gap_day_call_6month":"116.00","contact_number":"18120621893","contact_area":"福建省.泉州市","call_count_1week":"2","contact_seq_no":"26","is_whole_day_call_3month":"否","max_gap_day_call_6month":"116","call_count_1month":"2","call_time_passive_3month":"2242","is_whole_day_call_6month":"否","call_count_workday_6month":"4","last_time_call_6month":"2017-12-08 19:49:29","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"4","call_time_3month":"2385","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"4","call_time_6month":"2385","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"2385","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-30 21:14:34","call_time_active_3month":"2385","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"4","call_time_offwork_time_6month":"2385","call_count_offwork_time_6month":"4","call_time_work_time_3month":"0","call_time_offwork_time_3month":"2385","average_gap_day_call_6month":"2.00","contact_number":"18605018623","contact_area":"福建省.莆田市","call_count_1week":"0","contact_seq_no":"27","is_whole_day_call_3month":"否","max_gap_day_call_6month":"2","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-10-02 21:50:45","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"4","call_time_3month":"47","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"1495","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"1495","call_time_work_time_6month":"100","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-08 12:45:36","call_time_active_3month":"47","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"1395","call_count_offwork_time_6month":"2","call_time_work_time_3month":"47","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"44.00","contact_number":"18850991135","contact_area":"福建省.莆田市","call_count_1week":"0","contact_seq_no":"28","is_whole_day_call_3month":"否","max_gap_day_call_6month":"71","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-10-04 17:00:28","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"510","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"510","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"4","call_time_active_6month":"0","call_time_work_time_6month":"510","msg_count_6month":"0","call_count_work_time_6month":"4","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-18 11:50:15","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"18367145090","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"29","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"4","last_time_call_6month":"2017-07-18 12:05:22","msg_count_1month":"0"},{"call_count_holiday_3month":"3","call_count_holiday_6month":"3","contact_attribute":"其他号码","call_count_active_6month":"4","call_time_3month":"316","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"4","call_time_6month":"316","contact_type":"投资理财","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"316","call_time_work_time_6month":"154","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-14 17:50:35","call_time_active_3month":"316","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"4","contact_name":"腾讯微信支付、理财通服务电话","contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"1","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"162","call_count_offwork_time_6month":"1","call_time_work_time_3month":"154","call_time_offwork_time_3month":"162","average_gap_day_call_6month":"10.00","contact_number":"95017","contact_area":null,"call_count_1week":"0","contact_seq_no":"30","is_whole_day_call_3month":"否","max_gap_day_call_6month":"10","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-24 14:34:07","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"304","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"304","call_count_active_3month":"3","call_time_6month":"304","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"295","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-16 19:48:41","call_time_active_3month":"295","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"3","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"4","call_time_offwork_time_6month":"304","call_count_offwork_time_6month":"4","call_time_work_time_3month":"0","call_time_offwork_time_3month":"304","average_gap_day_call_6month":"9.00","contact_number":"15062304651","contact_area":"江苏省.苏州市","call_count_1week":"0","contact_seq_no":"31","is_whole_day_call_3month":"否","max_gap_day_call_6month":"9","call_count_1month":"4","call_time_passive_3month":"9","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-11-25 19:32:08","msg_count_1month":"0"},{"call_count_holiday_3month":"4","call_count_holiday_6month":"4","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"238","msg_count_3month":"0","call_time_passive_6month":"19","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"238","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"219","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-05 20:33:43","call_time_active_3month":"219","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"4","call_time_offwork_time_6month":"238","call_count_offwork_time_6month":"4","call_time_work_time_3month":"0","call_time_offwork_time_3month":"238","average_gap_day_call_6month":"0.00","contact_number":"18843586368","contact_area":"吉林省.通化市","call_count_1week":"0","contact_seq_no":"32","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"19","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-05 23:27:26","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"65","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"79","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"3","call_time_active_6month":"14","call_time_work_time_6month":"54","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-17 18:30:13","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"25","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"7.00","contact_number":"15757749773","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"33","is_whole_day_call_3month":"否","max_gap_day_call_6month":"7","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"4","last_time_call_6month":"2017-07-24 13:05:46","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"固定电话","call_count_active_6month":"4","call_time_3month":"4","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"4","call_time_6month":"4","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"4","call_time_work_time_6month":"3","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-14 17:53:24","call_time_active_3month":"4","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"4","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"2","call_count_6month":"4","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"1","call_count_offwork_time_6month":"1","call_time_work_time_3month":"3","call_time_offwork_time_3month":"1","average_gap_day_call_6month":"5.00","contact_number":"075583765566","contact_area":"广东省.深圳市","call_count_1week":"0","contact_seq_no":"34","is_whole_day_call_3month":"否","max_gap_day_call_6month":"6","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-10-24 18:42:11","msg_count_1month":"0"},{"call_count_holiday_3month":"3","call_count_holiday_6month":"3","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"4166","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"4166","call_count_active_3month":"3","call_time_6month":"4166","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"4166","call_time_work_time_6month":"4166","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-09 14:44:09","call_time_active_3month":"4166","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"0","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"4166","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"18150595079","contact_area":"福建省.泉州市","call_count_1week":"3","contact_seq_no":"35","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"3","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-12-09 15:44:09","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"16","msg_count_3month":"0","call_time_passive_6month":"1418","call_time_1month":"16","call_count_active_3month":"1","call_time_6month":"1444","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"26","call_time_work_time_6month":"16","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-29 18:24:19","call_time_active_3month":"16","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"1428","call_count_offwork_time_6month":"2","call_time_work_time_3month":"16","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"102.00","contact_number":"15559055029","contact_area":"福建省.泉州市","call_count_1week":"1","contact_seq_no":"36","is_whole_day_call_3month":"否","max_gap_day_call_6month":"102","call_count_1month":"1","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-12-09 14:36:05","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"服务号码","call_count_active_6month":"3","call_time_3month":"896","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"896","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"896","call_time_work_time_6month":"896","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-01 13:41:45","call_time_active_3month":"896","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"3","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"896","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"1.00","contact_number":"4006701855","contact_area":null,"call_count_1week":"0","contact_seq_no":"37","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-11-02 16:15:59","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"665","msg_count_3month":"0","call_time_passive_6month":"639","call_time_1month":"639","call_count_active_3month":"1","call_time_6month":"817","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"178","call_time_work_time_6month":"639","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-05 18:11:46","call_time_active_3month":"26","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"178","call_count_offwork_time_6month":"2","call_time_work_time_3month":"639","call_time_offwork_time_3month":"26","average_gap_day_call_6month":"47.50","contact_number":"18965582907","contact_area":"福建省.莆田市","call_count_1week":"1","contact_seq_no":"38","is_whole_day_call_3month":"否","max_gap_day_call_6month":"66","call_count_1month":"1","call_time_passive_3month":"639","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-09 09:52:40","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"577","msg_count_3month":"0","call_time_passive_6month":"427","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"577","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"150","call_time_work_time_6month":"577","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-24 14:08:26","call_time_active_3month":"150","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"3","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"577","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"18057957265","contact_area":"浙江省.金华市","call_count_1week":"0","contact_seq_no":"39","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"427","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-10-24 14:20:13","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"其他号码","call_count_active_6month":"3","call_time_3month":"486","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"486","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"486","call_time_work_time_6month":"134","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-14 17:56:50","call_time_active_3month":"486","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"2","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"352","call_count_offwork_time_6month":"2","call_time_work_time_3month":"134","call_time_offwork_time_3month":"352","average_gap_day_call_6month":"10.00","contact_number":"10105188","contact_area":null,"call_count_1week":"0","contact_seq_no":"40","is_whole_day_call_3month":"否","max_gap_day_call_6month":"10","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-10-24 20:04:54","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"其他号码","call_count_active_6month":"3","call_time_3month":"321","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"473","contact_type":"银行","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"473","call_time_work_time_6month":"473","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-14 08:28:23","call_time_active_3month":"321","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":"农业银行","contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"321","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"34.00","contact_number":"95599","contact_area":null,"call_count_1week":"0","contact_seq_no":"41","is_whole_day_call_3month":"否","max_gap_day_call_6month":"34","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-09-17 10:10:24","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"247","msg_count_3month":"0","call_time_passive_6month":"18","call_time_1month":"247","call_count_active_3month":"2","call_time_6month":"247","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"229","call_time_work_time_6month":"18","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-24 18:57:45","call_time_active_3month":"229","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"3","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"229","call_count_offwork_time_6month":"2","call_time_work_time_3month":"18","call_time_offwork_time_3month":"229","average_gap_day_call_6month":"6.00","contact_number":"18858161185","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"42","is_whole_day_call_3month":"否","max_gap_day_call_6month":"7","call_count_1month":"3","call_time_passive_3month":"18","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-12-06 16:22:12","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"241","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"241","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"241","call_time_work_time_6month":"87","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-30 18:29:08","call_time_active_3month":"241","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"154","call_count_offwork_time_6month":"2","call_time_work_time_3month":"87","call_time_offwork_time_3month":"154","average_gap_day_call_6month":"3.50","contact_number":"13858152805","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"43","is_whole_day_call_3month":"否","max_gap_day_call_6month":"6","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-07 09:51:16","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"161","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"161","contact_type":"保险","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"3","call_time_active_6month":"0","call_time_work_time_6month":"10","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-07 18:24:45","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":"平安保险　","contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"151","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"8.00","contact_number":"95511","contact_area":null,"call_count_1week":"0","contact_seq_no":"44","is_whole_day_call_3month":"否","max_gap_day_call_6month":"8","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-08-15 09:33:31","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"1","call_time_3month":"149","msg_count_3month":"0","call_time_passive_6month":"131","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"149","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"18","call_time_work_time_6month":"84","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-24 21:00:56","call_time_active_3month":"18","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"3","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"65","call_count_offwork_time_6month":"1","call_time_work_time_3month":"84","call_time_offwork_time_3month":"65","average_gap_day_call_6month":"1.00","contact_number":"02180203090","contact_area":"上海市.上海市","call_count_1week":"0","contact_seq_no":"45","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"0","call_time_passive_3month":"131","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-10-25 12:56:40","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"146","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"146","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"146","call_time_work_time_6month":"68","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-28 10:11:12","call_time_active_3month":"146","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"78","call_count_offwork_time_6month":"2","call_time_work_time_3month":"68","call_time_offwork_time_3month":"78","average_gap_day_call_6month":"3.50","contact_number":"13533912264","contact_area":"广东省.广州市","call_count_1week":"0","contact_seq_no":"46","is_whole_day_call_3month":"否","max_gap_day_call_6month":"4","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-05 23:29:26","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"132","msg_count_3month":"0","call_time_passive_6month":"84","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"132","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"48","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-08 18:27:20","call_time_active_3month":"48","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"3","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"3","call_time_offwork_time_6month":"132","call_count_offwork_time_6month":"3","call_time_work_time_3month":"0","call_time_offwork_time_3month":"132","average_gap_day_call_6month":"0.00","contact_number":"18258436082","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"47","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"84","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-11-08 20:16:38","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"121","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"121","call_time_work_time_6month":"121","msg_count_6month":"2","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-03 15:11:04","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"3.50","contact_number":"13509380771","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"48","is_whole_day_call_3month":"否","max_gap_day_call_6month":"4","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-07-10 15:54:34","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"3","call_time_3month":"85","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"3","call_time_6month":"85","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"85","call_time_work_time_6month":"85","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-19 16:04:04","call_time_active_3month":"85","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"3","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"85","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"1.00","contact_number":"13989822853","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"49","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-09-20 13:45:53","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"3","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"53","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"80","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"27","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-19 18:08:57","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"80","call_count_offwork_time_6month":"3","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"15559086193","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"50","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-08-19 22:06:21","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"51","msg_count_3month":"0","call_time_passive_6month":"27","call_time_1month":"51","call_count_active_3month":"2","call_time_6month":"51","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"24","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-26 18:28:18","call_time_active_3month":"24","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"3","call_time_offwork_time_6month":"51","call_count_offwork_time_6month":"3","call_time_work_time_3month":"0","call_time_offwork_time_3month":"51","average_gap_day_call_6month":"1.00","contact_number":"13735450569","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"51","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"3","call_time_passive_3month":"27","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-27 19:31:42","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"33","msg_count_3month":"0","call_time_passive_6month":"33","call_time_1month":"33","call_count_active_3month":"0","call_time_6month":"33","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"3","call_time_active_6month":"0","call_time_work_time_6month":"33","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-15 13:03:42","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"3","call_count_3month":"3","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"3","call_count_6month":"3","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"33","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"13.00","contact_number":"15394253983","contact_area":"浙江省.杭州市","call_count_1week":"1","contact_seq_no":"52","is_whole_day_call_3month":"否","max_gap_day_call_6month":"18","call_count_1month":"3","call_time_passive_3month":"33","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-12-11 09:44:33","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"2980","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"2980","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"2980","call_time_work_time_6month":"2980","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-12 14:56:38","call_time_active_3month":"2980","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"2980","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"13110800959","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"53","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-11-12 15:26:38","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"1228","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"1228","call_time_work_time_6month":"0","msg_count_6month":"2","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-05 19:13:00","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"1228","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"18120825723","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"54","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-08-05 19:25:16","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"965","msg_count_3month":"0","call_time_passive_6month":"135","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"965","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"830","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-24 19:30:06","call_time_active_3month":"830","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"965","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"965","average_gap_day_call_6month":"0.00","contact_number":"18069973839","contact_area":"浙江省.金华市","call_count_1week":"0","contact_seq_no":"55","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"135","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-10-24 19:53:59","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"823","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"862","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"862","call_time_work_time_6month":"823","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-05 19:24:11","call_time_active_3month":"823","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"39","call_count_offwork_time_6month":"1","call_time_work_time_3month":"823","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"99.00","contact_number":"18396210636","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"56","is_whole_day_call_3month":"否","max_gap_day_call_6month":"99","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-11-12 14:42:35","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"660","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"660","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"660","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-02 21:59:03","call_time_active_3month":"660","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"660","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"660","average_gap_day_call_6month":"1.00","contact_number":"13074858950","contact_area":"福建省.厦门市","call_count_1week":"0","contact_seq_no":"57","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-03 18:17:42","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"256","msg_count_3month":"0","call_time_passive_6month":"256","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"360","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"104","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-25 21:21:16","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"360","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"256","average_gap_day_call_6month":"54.00","contact_number":"17625908992","contact_area":"江苏省.南京市","call_count_1week":"0","contact_seq_no":"58","is_whole_day_call_3month":"否","max_gap_day_call_6month":"54","call_count_1month":"0","call_time_passive_3month":"256","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-17 18:21:48","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"246","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"246","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"246","call_time_work_time_6month":"246","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-13 13:03:38","call_time_active_3month":"246","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"246","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"13958127936","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"59","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-11-13 13:04:18","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"229","msg_count_3month":"0","call_time_passive_6month":"229","call_time_1month":"229","call_count_active_3month":"0","call_time_6month":"229","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"229","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-17 17:29:12","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"1","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"229","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"1.00","contact_number":"18267175580","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"60","is_whole_day_call_3month":"否","max_gap_day_call_6month":"1","call_count_1month":"2","call_time_passive_3month":"229","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-18 11:09:54","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"191","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"191","call_time_work_time_6month":"191","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-28 12:06:46","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"15959252104","contact_area":"福建省.厦门市","call_count_1week":"0","contact_seq_no":"61","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-08-28 16:10:07","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"2","call_time_3month":"129","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"129","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"129","call_time_work_time_6month":"58","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-30 12:18:53","call_time_active_3month":"129","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"71","call_count_offwork_time_6month":"1","call_time_work_time_3month":"58","call_time_offwork_time_3month":"71","average_gap_day_call_6month":"0.00","contact_number":"13855498390","contact_area":"安徽省.淮南市","call_count_1week":"0","contact_seq_no":"62","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-09-30 18:21:29","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"112","msg_count_3month":"0","call_time_passive_6month":"54","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"112","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"58","call_time_work_time_6month":"112","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-12 11:39:33","call_time_active_3month":"58","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"112","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"18965426772","contact_area":"福建省.厦门市","call_count_1week":"0","contact_seq_no":"63","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"54","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-11-12 11:47:38","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"108","msg_count_3month":"0","call_time_passive_6month":"108","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"108","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"108","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-12 14:35:53","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"108","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"15905816834","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"64","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"108","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-11-12 14:38:27","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"100","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"100","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"100","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-14 11:42:34","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"14.00","contact_number":"18658805732","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"65","is_whole_day_call_3month":"否","max_gap_day_call_6month":"14","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-08-28 12:38:45","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"77","msg_count_3month":"0","call_time_passive_6month":"77","call_time_1month":"28","call_count_active_3month":"0","call_time_6month":"77","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-14 18:34:02","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"77","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"77","average_gap_day_call_6month":"55.00","contact_number":"15195528770","contact_area":"江苏省.盐城市","call_count_1week":"1","contact_seq_no":"66","is_whole_day_call_3month":"否","max_gap_day_call_6month":"55","call_count_1month":"1","call_time_passive_3month":"77","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-08 18:45:53","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"76","msg_count_3month":"0","call_time_passive_6month":"12","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"76","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"64","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-08 20:37:11","call_time_active_3month":"64","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"76","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"76","average_gap_day_call_6month":"0.00","contact_number":"13285698702","contact_area":"安徽省.合肥市","call_count_1week":"0","contact_seq_no":"67","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"12","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-11-08 20:39:52","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"72","msg_count_3month":"0","call_time_passive_6month":"72","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"72","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-09 18:25:53","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"72","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"72","average_gap_day_call_6month":"0.00","contact_number":"15669953602","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"68","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"72","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-11-09 18:37:02","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"70","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"70","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"70","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-26 13:51:39","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"2.00","contact_number":"02151348268","contact_area":"上海市.上海市","call_count_1week":"0","contact_seq_no":"69","is_whole_day_call_3month":"否","max_gap_day_call_6month":"2","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-07-28 15:43:11","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"其他号码","call_count_active_6month":"2","call_time_3month":"68","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"2","call_time_6month":"68","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"68","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-04 20:15:07","call_time_active_3month":"68","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"68","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"68","average_gap_day_call_6month":"0.00","contact_number":"8256400","contact_area":null,"call_count_1week":"0","contact_seq_no":"70","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-04 20:22:29","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"64","msg_count_3month":"0","call_time_passive_6month":"15","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"64","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"49","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-24 19:48:35","call_time_active_3month":"49","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"64","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"64","average_gap_day_call_6month":"0.00","contact_number":"15957998555","contact_area":"浙江省.金华市","call_count_1week":"0","contact_seq_no":"71","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"15","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-10-24 19:49:50","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"57","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"57","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"57","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-17 11:51:00","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"21.00","contact_number":"13193543175","contact_area":"河南省.安阳市","call_count_1week":"0","contact_seq_no":"72","is_whole_day_call_3month":"否","max_gap_day_call_6month":"21","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-09-07 11:40:10","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"18","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"46","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"28","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-18 18:31:06","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"46","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"18758229370","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"73","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-07-18 18:32:22","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"44","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"44","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"44","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-22 12:27:32","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"13569288778","contact_area":"河南省.南阳市","call_count_1week":"0","contact_seq_no":"74","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-08-22 12:31:42","msg_count_1month":"0"},{"call_count_holiday_3month":"2","call_count_holiday_6month":"2","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"34","msg_count_3month":"0","call_time_passive_6month":"22","call_time_1month":"34","call_count_active_3month":"1","call_time_6month":"34","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"12","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-03 22:20:13","call_time_active_3month":"12","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"34","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"34","average_gap_day_call_6month":"0.00","contact_number":"15057156623","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"75","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"2","call_time_passive_3month":"22","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-12-03 22:22:22","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"30","msg_count_3month":"0","call_time_passive_6month":"7","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"30","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"23","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-16 18:47:38","call_time_active_3month":"23","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"30","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"30","average_gap_day_call_6month":"0.00","contact_number":"18557511841","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"76","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"7","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-10-16 18:48:42","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"24","msg_count_3month":"0","call_time_passive_6month":"24","call_time_1month":"24","call_count_active_3month":"0","call_time_6month":"24","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-30 22:11:39","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"24","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"24","average_gap_day_call_6month":"10.00","contact_number":"15057160724","contact_area":"浙江省.杭州市","call_count_1week":"1","contact_seq_no":"77","is_whole_day_call_3month":"否","max_gap_day_call_6month":"10","call_count_1month":"2","call_time_passive_3month":"24","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-10 18:42:33","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"13","msg_count_3month":"0","call_time_passive_6month":"13","call_time_1month":"7","call_count_active_3month":"0","call_time_6month":"13","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-26 19:16:28","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"2","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"2","call_time_offwork_time_6month":"13","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"13","average_gap_day_call_6month":"63.00","contact_number":"15158897439","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"78","is_whole_day_call_3month":"否","max_gap_day_call_6month":"63","call_count_1month":"1","call_time_passive_3month":"13","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-11-28 19:16:01","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"10","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"1","call_time_work_time_6month":"11","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-25 12:12:03","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"0.00","contact_number":"18992141967","contact_area":"陕西省.延安市","call_count_1week":"0","contact_seq_no":"79","is_whole_day_call_3month":"否","max_gap_day_call_6month":"0","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-07-25 12:13:04","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"9","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"9","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"2","call_time_active_6month":"0","call_time_work_time_6month":"9","msg_count_6month":"0","call_count_work_time_6month":"2","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-19 10:16:09","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"2","call_count_3month":"2","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"2","call_count_workday_3month":"1","call_count_6month":"2","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"9","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"18.00","contact_number":"059586734457","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"80","is_whole_day_call_3month":"否","max_gap_day_call_6month":"18","call_count_1month":"0","call_time_passive_3month":"9","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-07 11:48:35","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"778","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"778","call_count_active_3month":"1","call_time_6month":"778","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"778","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-09 20:55:51","call_time_active_3month":"778","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"778","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"778","average_gap_day_call_6month":null,"contact_number":"15659458092","contact_area":"福建省.厦门市","call_count_1week":"1","contact_seq_no":"81","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-12-09 20:55:51","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"558","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"558","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-02 21:32:41","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"558","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18030112209","contact_area":"福建省.厦门市","call_count_1week":"0","contact_seq_no":"82","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-09-02 21:32:41","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"服务号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"305","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"305","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-02 18:27:22","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"305","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"4000044400","contact_area":null,"call_count_1week":"0","contact_seq_no":"83","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-02 18:27:22","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"305","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"305","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"305","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-06 11:36:11","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"02759551309","contact_area":"湖北省.武汉市","call_count_1week":"0","contact_seq_no":"84","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-06 11:36:11","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"124","msg_count_3month":"0","call_time_passive_6month":"124","call_time_1month":"124","call_count_active_3month":"0","call_time_6month":"124","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"124","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-13 12:02:00","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"124","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15068870311","contact_area":"浙江省.杭州市","call_count_1week":"1","contact_seq_no":"85","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"124","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-13 12:02:00","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"117","msg_count_3month":"0","call_time_passive_6month":"117","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"117","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"117","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-13 09:53:14","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"117","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"0015126742000","contact_area":null,"call_count_1week":"0","contact_seq_no":"86","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"117","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-13 09:53:14","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"115","msg_count_3month":"0","call_time_passive_6month":"115","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"115","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-06 20:30:05","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"115","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"115","average_gap_day_call_6month":null,"contact_number":"18570614117","contact_area":"湖南省.长沙市","call_count_1week":"0","contact_seq_no":"87","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"115","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-06 20:30:05","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"106","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"106","call_count_active_3month":"1","call_time_6month":"106","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"106","call_time_work_time_6month":"106","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-26 17:47:38","call_time_active_3month":"106","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"106","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18268807459","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"88","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-11-26 17:47:38","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"88","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"88","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-10 19:14:56","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"88","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18850107246","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"89","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-09-10 19:14:56","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"85","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"85","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-07 20:07:24","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"85","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13023938801","contact_area":"福建省.厦门市","call_count_1week":"0","contact_seq_no":"90","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-07 20:07:24","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"85","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"85","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"85","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-17 14:25:04","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"057185317079","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"91","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-17 14:25:04","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"72","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"72","call_time_work_time_6month":"72","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-05 12:43:19","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13489959327","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"92","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-05 12:43:19","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"70","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"70","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-01 06:17:30","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"70","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"70","average_gap_day_call_6month":null,"contact_number":"101575456","contact_area":null,"call_count_1week":"0","contact_seq_no":"93","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-01 06:17:30","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"69","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"69","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-14 22:16:24","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"69","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13636911631","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"94","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-14 22:16:24","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"62","msg_count_3month":"0","call_time_passive_6month":"62","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"62","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-27 18:56:56","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"62","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"62","average_gap_day_call_6month":null,"contact_number":"13817275791","contact_area":"上海市.上海市","call_count_1week":"0","contact_seq_no":"95","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"62","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-27 18:56:56","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"62","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"62","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"62","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-06 11:38:56","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18268809474","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"96","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-06 11:38:56","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"59","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"59","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"59","call_time_work_time_6month":"59","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-22 09:59:22","call_time_active_3month":"59","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"59","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"17858605876","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"97","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-22 09:59:22","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"59","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"59","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"59","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-02 14:51:57","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"057423684112","contact_area":"浙江省.宁波市","call_count_1week":"0","contact_seq_no":"98","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-07-02 14:51:57","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"56","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"56","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"56","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-21 12:34:23","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"057423684113","contact_area":"浙江省.宁波市","call_count_1week":"0","contact_seq_no":"99","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-21 12:34:23","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"55","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"55","call_count_active_3month":"1","call_time_6month":"55","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"55","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-24 19:46:32","call_time_active_3month":"55","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"55","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"55","average_gap_day_call_6month":null,"contact_number":"18668108341","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"100","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-24 19:46:32","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"52","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"52","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-03 20:21:33","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"52","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13208041496","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"101","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-09-03 20:21:33","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"46","msg_count_3month":"0","call_time_passive_6month":"46","call_time_1month":"46","call_count_active_3month":"0","call_time_6month":"46","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"46","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-02 09:02:01","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"46","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15869010140","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"102","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"46","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-12-02 09:02:01","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"40","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"40","call_time_work_time_6month":"40","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-08 12:24:29","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15258802811","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"103","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-08 12:24:29","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"1","call_time_3month":"39","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"39","contact_type":"其他生活服务","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"39","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-24 18:42:38","call_time_active_3month":"39","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":"腾讯客服","contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"39","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"39","average_gap_day_call_6month":null,"contact_number":"075586013860","contact_area":"广东省.深圳市","call_count_1week":"0","contact_seq_no":"104","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-24 18:42:38","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"35","msg_count_3month":"0","call_time_passive_6month":"35","call_time_1month":"35","call_count_active_3month":"0","call_time_6month":"35","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"35","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-04 15:36:38","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"35","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"057188581025","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"105","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"35","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-04 15:36:38","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"35","msg_count_3month":"0","call_time_passive_6month":"35","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"35","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-24 19:01:32","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"35","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"35","average_gap_day_call_6month":null,"contact_number":"15180023695","contact_area":"江西省.新余市","call_count_1week":"0","contact_seq_no":"106","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"35","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-24 19:01:32","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"34","msg_count_3month":"0","call_time_passive_6month":"34","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"34","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-03 18:14:54","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"34","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"34","average_gap_day_call_6month":null,"contact_number":"13765051712","contact_area":"贵州省.贵阳市","call_count_1week":"0","contact_seq_no":"107","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"34","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-03 18:14:54","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"32","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"32","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-25 19:03:10","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"32","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15105818376","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"108","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-25 19:03:10","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"30","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"30","call_time_work_time_6month":"30","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-09 10:31:27","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15397182724","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"109","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-07-09 10:31:27","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"29","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"29","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"29","call_time_work_time_6month":"29","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-11 15:03:09","call_time_active_3month":"29","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"29","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18069853557","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"110","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-11-11 15:03:09","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"29","msg_count_3month":"0","call_time_passive_6month":"29","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"29","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"29","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-25 15:30:19","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"29","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"059586734302","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"111","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"29","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-25 15:30:19","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"29","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"29","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"29","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-17 11:39:16","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"059524674120","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"112","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-17 11:39:16","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"28","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"28","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"28","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-11 16:20:20","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"02151348273","contact_area":"上海市.上海市","call_count_1week":"0","contact_seq_no":"113","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-11 16:20:20","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"26","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"26","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"26","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-07 11:26:37","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13857134883","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"114","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-07 11:26:37","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"26","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"26","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"26","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-17 11:29:10","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15868876054","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"115","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-17 11:29:10","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"25","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"25","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-29 18:14:13","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"25","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"059536280060","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"116","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-29 18:14:13","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"24","msg_count_3month":"0","call_time_passive_6month":"24","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"24","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"24","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-07 10:19:55","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"24","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"02126107493","contact_area":"上海市.上海市","call_count_1week":"0","contact_seq_no":"117","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"24","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-07 10:19:55","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"23","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"23","call_time_work_time_6month":"23","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-16 11:44:42","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15160362690","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"118","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-07-16 11:44:42","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"23","msg_count_3month":"0","call_time_passive_6month":"23","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"23","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"23","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-21 09:05:47","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"23","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18550711731","contact_area":"江苏省.淮安市","call_count_1week":"0","contact_seq_no":"119","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"23","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-21 09:05:47","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"23","msg_count_3month":"0","call_time_passive_6month":"23","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"23","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-28 19:35:47","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"23","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"23","average_gap_day_call_6month":null,"contact_number":"13184248595","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"120","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"23","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-28 19:35:47","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"23","msg_count_3month":"0","call_time_passive_6month":"23","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"23","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"23","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-16 12:02:49","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"23","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18805811143","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"121","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"23","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-09-16 12:02:49","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"21","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"21","call_time_work_time_6month":"21","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-01 14:55:17","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18605818022","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"122","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-07-01 14:55:17","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"21","msg_count_3month":"0","call_time_passive_6month":"21","call_time_1month":"21","call_count_active_3month":"0","call_time_6month":"21","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"21","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-05 10:12:17","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"21","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15857128593","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"123","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"21","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-05 10:12:17","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"21","msg_count_3month":"0","call_time_passive_6month":"21","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"21","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-20 19:30:25","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"21","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"21","average_gap_day_call_6month":null,"contact_number":"18395985059","contact_area":"浙江省.金华市","call_count_1week":"0","contact_seq_no":"124","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"21","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-20 19:30:25","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"20","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"20","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"20","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-16 12:17:42","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18699402798","contact_area":"新疆维吾尔自治区.昌吉回族自治州","call_count_1week":"0","contact_seq_no":"125","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-16 12:17:42","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"19","msg_count_3month":"0","call_time_passive_6month":"19","call_time_1month":"19","call_count_active_3month":"0","call_time_6month":"19","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-13 19:09:53","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"19","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"19","average_gap_day_call_6month":null,"contact_number":"18567761088","contact_area":"河南省.安阳市","call_count_1week":"1","contact_seq_no":"126","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"19","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-13 19:09:53","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"19","msg_count_3month":"0","call_time_passive_6month":"19","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"19","contact_type":"运营商","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"19","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-20 10:02:44","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":"中国联通","contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"19","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"10011","contact_area":null,"call_count_1week":"0","contact_seq_no":"127","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"19","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-20 10:02:44","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"18","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"18","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"18","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-02 20:59:32","call_time_active_3month":"18","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"18","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"18","average_gap_day_call_6month":null,"contact_number":"18559873692","contact_area":"福建省.福州市","call_count_1week":"0","contact_seq_no":"128","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-02 20:59:32","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"18","msg_count_3month":"0","call_time_passive_6month":"18","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"18","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"18","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-24 12:45:19","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"18","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"17538350162","contact_area":null,"call_count_1week":"0","contact_seq_no":"129","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"18","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-24 12:45:19","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"18","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"18","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"18","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-09 11:39:37","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18069851295","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"130","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-09 11:39:37","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"17","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"17","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"17","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-14 11:55:33","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15158975525","contact_area":"浙江省.金华市","call_count_1week":"0","contact_seq_no":"131","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-14 11:55:33","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"16","msg_count_3month":"0","call_time_passive_6month":"16","call_time_1month":"16","call_count_active_3month":"0","call_time_6month":"16","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"16","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-06 16:47:43","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"16","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"057126206500","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"132","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"16","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-06 16:47:43","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"16","msg_count_3month":"0","call_time_passive_6month":"16","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"16","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-01 18:41:42","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"16","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"16","average_gap_day_call_6month":null,"contact_number":"17767268007","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"133","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"16","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-01 18:41:42","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"1","call_time_3month":"15","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"15","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"15","call_time_work_time_6month":"15","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-22 11:50:25","call_time_active_3month":"15","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"15","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13567118147","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"134","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-22 11:50:25","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"15","msg_count_3month":"0","call_time_passive_6month":"15","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"15","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-06 21:45:29","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"15","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"15","average_gap_day_call_6month":null,"contact_number":"02835084050","contact_area":"四川省.成都市","call_count_1week":"0","contact_seq_no":"135","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"15","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-06 21:45:29","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"15","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"15","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-18 19:11:38","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"15","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"17764598313","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"136","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-18 19:11:38","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"15","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"15","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-10 19:23:00","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"15","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18305817651","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"137","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-10 19:23:00","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"15","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"15","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-20 18:19:06","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"15","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15158848475","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"138","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-20 18:19:06","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"15","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"15","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"15","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-19 12:15:09","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13018918144","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"139","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-19 12:15:09","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"14","msg_count_3month":"0","call_time_passive_6month":"14","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"14","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-18 19:07:33","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"14","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"14","average_gap_day_call_6month":null,"contact_number":"18888750530","contact_area":"浙江省.绍兴市","call_count_1week":"0","contact_seq_no":"140","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"14","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-18 19:07:33","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"14","msg_count_3month":"0","call_time_passive_6month":"14","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"14","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-15 20:08:35","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"14","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"14","average_gap_day_call_6month":null,"contact_number":"13082805458","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"141","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"14","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-15 20:08:35","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"14","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"14","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"14","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-31 15:53:54","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13327484068","contact_area":"山西省.运城市","call_count_1week":"0","contact_seq_no":"142","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-31 15:53:54","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"13","msg_count_3month":"0","call_time_passive_6month":"13","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"13","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-29 19:33:55","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"13","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"13","average_gap_day_call_6month":null,"contact_number":"18258243556","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"143","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"13","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-29 19:33:55","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"13","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"13","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"13","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-26 12:56:58","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18968027571","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"144","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-08-26 12:56:58","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"13","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"13","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"13","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-08 11:59:43","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15085320129","contact_area":"贵州省.毕节市","call_count_1week":"0","contact_seq_no":"145","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-08 11:59:43","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"12","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"12","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"12","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-30 10:43:52","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"076926987954","contact_area":"广东省.东莞市","call_count_1week":"0","contact_seq_no":"146","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-30 10:43:52","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"12","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"12","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"12","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-19 10:31:34","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18058769337","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"147","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-19 10:31:34","msg_count_1month":"0"},{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"11","msg_count_3month":"0","call_time_passive_6month":"11","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"11","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-28 10:47:19","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"11","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18069446580","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"148","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"11","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-10-28 10:47:19","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"11","msg_count_3month":"0","call_time_passive_6month":"11","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"11","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-13 15:48:52","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"11","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"02759724291","contact_area":"湖北省.武汉市","call_count_1week":"0","contact_seq_no":"149","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"11","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-13 15:48:52","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"11","msg_count_3month":"0","call_time_passive_6month":"11","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-30 20:03:53","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"11","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"11","average_gap_day_call_6month":null,"contact_number":"15839581197","contact_area":"河南省.漯河市","call_count_1week":"0","contact_seq_no":"150","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"11","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-30 20:03:53","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"11","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"11","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-18 11:51:47","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18625494577","contact_area":"河南省.安阳市","call_count_1week":"0","contact_seq_no":"151","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-18 11:51:47","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"11","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"11","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-20 12:23:32","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"17774462152","contact_area":"湖南省.张家界市","call_count_1week":"0","contact_seq_no":"152","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-20 12:23:32","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"11","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":"保险","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"11","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-05 12:30:12","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":"泰康人寿保险　","contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"95522","contact_area":null,"call_count_1week":"0","contact_seq_no":"153","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-05 12:30:12","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"10","msg_count_3month":"0","call_time_passive_6month":"10","call_time_1month":"10","call_count_active_3month":"0","call_time_6month":"10","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"10","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-15 09:41:16","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"10","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15314616023","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"154","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"10","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-15 09:41:16","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"10","msg_count_3month":"0","call_time_passive_6month":"10","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"10","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-02 19:09:19","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"10","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"10","average_gap_day_call_6month":null,"contact_number":"15345821695","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"155","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"10","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-02 19:09:19","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"10","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"10","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"10","msg_count_6month":"1","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-05 15:36:57","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13732239862","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"156","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-05 15:36:57","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"9","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"9","call_count_active_3month":"0","call_time_6month":"9","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-01 20:58:39","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"9","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"9","average_gap_day_call_6month":null,"contact_number":"18667169671","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"157","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"9","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-01 20:58:39","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"9","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"9","call_count_active_3month":"0","call_time_6month":"9","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"9","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-17 12:41:10","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"9","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15355088560","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"158","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"9","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-17 12:41:10","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"9","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"9","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-19 19:22:58","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"9","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"9","average_gap_day_call_6month":null,"contact_number":"15669901989","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"159","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"9","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-19 19:22:58","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"9","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-08 20:40:54","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"9","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13777575226","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"160","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-08 20:40:54","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"9","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"9","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-03 12:50:30","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15157180400","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"161","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-09-03 12:50:30","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"9","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"9","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"9","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-28 11:28:55","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15093955130","contact_area":"河南省.安阳市","call_count_1week":"0","contact_seq_no":"162","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-28 11:28:55","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"8","msg_count_3month":"0","call_time_passive_6month":"8","call_time_1month":"8","call_count_active_3month":"0","call_time_6month":"8","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-12-06 23:18:51","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"8","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"8","average_gap_day_call_6month":null,"contact_number":"15314638859","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"163","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"8","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-12-06 23:18:51","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"8","msg_count_3month":"0","call_time_passive_6month":"8","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"8","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"8","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-25 11:41:07","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"8","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15297933763","contact_area":"江西省.上饶市","call_count_1week":"0","contact_seq_no":"164","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"8","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-25 11:41:07","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"8","msg_count_3month":"0","call_time_passive_6month":"8","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"8","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-18 18:59:04","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"8","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"8","average_gap_day_call_6month":null,"contact_number":"15267019967","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"165","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"8","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-18 18:59:04","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"8","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"8","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-14 23:26:40","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"8","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"13429253977","contact_area":"浙江省.宁波市","call_count_1week":"0","contact_seq_no":"166","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-14 23:26:40","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"8","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"8","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-05 19:56:47","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"8","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"18143490923","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"167","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-05 19:56:47","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"7","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"7","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-31 19:04:29","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"7","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"17681878232","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"168","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-31 19:04:29","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"7","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"7","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"7","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-01 16:39:04","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"059586734454","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"169","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-08-01 16:39:04","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"7","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"7","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"7","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-21 12:01:50","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"15825506605","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"170","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-21 12:01:50","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"6","msg_count_3month":"0","call_time_passive_6month":"6","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"6","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-26 19:04:44","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"6","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"6","average_gap_day_call_6month":null,"contact_number":"13587646713","contact_area":"浙江省.温州市","call_count_1week":"0","contact_seq_no":"171","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"6","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-26 19:04:44","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"1","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"6","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"6","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"6","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-22 15:35:22","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"059586734316","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"172","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"0","last_time_call_6month":"2017-07-22 15:35:22","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"手机号码","call_count_active_6month":"0","call_time_3month":"5","msg_count_3month":"0","call_time_passive_6month":"5","call_time_1month":"5","call_count_active_3month":"0","call_time_6month":"5","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"0","msg_count_6month":"0","call_count_work_time_6month":"0","call_time_late_night_3month":"0","first_time_call_6month":"2017-11-27 19:17:01","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"1","call_time_offwork_time_6month":"5","call_count_offwork_time_6month":"1","call_time_work_time_3month":"0","call_time_offwork_time_3month":"5","average_gap_day_call_6month":null,"contact_number":"18258203042","contact_area":"浙江省.杭州市","call_count_1week":"0","contact_seq_no":"173","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"1","call_time_passive_3month":"5","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-11-27 19:17:01","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"固定电话","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"4","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"4","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"4","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-24 12:08:39","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"059586734132","contact_area":"福建省.泉州市","call_count_1week":"0","contact_seq_no":"174","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-24 12:08:39","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"1","msg_count_3month":"0","call_time_passive_6month":"1","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"1","contact_type":null,"call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"1","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-09-19 16:51:32","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"1","call_count_3month":"1","contact_name":null,"contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"1","call_count_6month":"1","is_virtual_number":"否","call_count_offwork_time_3month":"0","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"1","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"3552142126555","contact_area":null,"call_count_1week":"0","contact_seq_no":"175","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"1","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-09-19 16:51:32","msg_count_1month":"0"}]
     * call_duration_stats_2hour : {"call_duration_workday_6month":{"t_0":"21","t_2":"0","t_1":"0","t_4":"7","t_3":"0","t_6":"42","t_5":"26","t_8":"26","t_10":"114","t_7":"18","t_11":"97","t_9":"112"},"call_duration_holiday_6month":{"t_0":"0","t_2":"0","t_1":"0","t_4":"67","t_3":"3","t_6":"128","t_5":"141","t_8":"85","t_10":"176","t_7":"209","t_11":"132","t_9":"199"},"call_duration_holiday_3month":{"t_0":"0","t_2":"0","t_1":"0","t_4":"107","t_3":"5","t_6":"130","t_5":"155","t_8":"135","t_10":"162","t_7":"324","t_11":"167","t_9":"187"},"call_duration_workday_3month":{"t_0":"39","t_2":"0","t_1":"0","t_4":"10","t_3":"0","t_6":"62","t_5":"28","t_8":"41","t_10":"178","t_7":"24","t_11":"102","t_9":"149"}}
     * active_silence_stats : {"continue_silence_day_over15_0call_3month_detail":[],"active_day_1call_6month":"142","continue_silence_day_over15_0call_active_3month":"0","continue_silence_day_over15_0call_0msg_send_3month":"0","active_day_1call_3month":"80","gap_day_last_silence_day_0call_active_6month":"0","continue_silence_day_over3_0call_6month_detail":[{"end_date":"2017-09-14","start_date":"2017-09-11"},{"end_date":"2017-10-12","start_date":"2017-10-10"}],"max_continue_silence_day_0call_active_3month":"5","max_continue_silence_day_0call_active_6month":"5","continue_silence_day_over15_0call_0msg_send_6month":"0","continue_silence_day_over15_0call_0msg_send_6month_detail":[],"continue_silence_day_over15_0call_3month":"0","silence_day_0call_active_6month":"68","continue_silence_day_over3_0call_3month_detail":[{"end_date":"2017-10-12","start_date":"2017-10-10"}],"continue_silence_day_over15_0call_6month":"0","silence_day_0call_active_3month":"30","continue_silence_day_over3_0call_0msg_send_3month":"1","continue_silence_day_over3_0call_active_3month_detail":[{"end_date":"2017-10-12","start_date":"2017-10-09"},{"end_date":"2017-11-20","start_date":"2017-11-18"},{"end_date":"2017-12-14","start_date":"2017-12-10"}],"continue_silence_day_over15_0call_6month_detail":[],"continue_silence_day_over3_0call_active_6month":"10","continue_silence_day_over15_0call_0msg_send_3month_detail":[],"continue_silence_day_over3_0call_active_6month_detail":[{"end_date":"2017-07-13","start_date":"2017-07-11"},{"end_date":"2017-07-28","start_date":"2017-07-26"},{"end_date":"2017-08-01","start_date":"2017-07-30"},{"end_date":"2017-08-18","start_date":"2017-08-15"},{"end_date":"2017-08-23","start_date":"2017-08-21"},{"end_date":"2017-09-01","start_date":"2017-08-30"},{"end_date":"2017-09-15","start_date":"2017-09-11"},{"end_date":"2017-10-12","start_date":"2017-10-09"},{"end_date":"2017-11-20","start_date":"2017-11-18"},{"end_date":"2017-12-14","start_date":"2017-12-10"}],"silence_day_0call_3month":"11","silence_day_0call_6month":"25","continue_silence_day_over3_0call_active_3month":"3","continue_silence_day_over3_0call_0msg_send_3month_detail":[{"end_date":"2017-10-12","start_date":"2017-10-10"}],"continue_silence_day_over15_0call_active_6month_detail":[],"max_continue_silence_day_0call_6month":"4","gap_day_last_silence_day_0call_6month":"0","gap_day_last_silence_day_0call_0msg_send_6month":"0","max_continue_silence_day_0call_3month":"3","continue_silence_day_over3_0call_3month":"1","max_continue_active_day_1call_3month":"25","continue_silence_day_over3_0call_0msg_send_6month":"2","continue_silence_day_over3_0call_0msg_send_6month_detail":[{"end_date":"2017-09-14","start_date":"2017-09-11"},{"end_date":"2017-10-12","start_date":"2017-10-10"}],"max_continue_active_day_1call_6month":"25","continue_silence_day_over3_0call_6month":"2","max_continue_silence_day_0call_0msg_send_6month":"4","continue_silence_day_over15_0call_active_3month_detail":[],"max_continue_silence_day_0call_0msg_send_3month":"3","silence_day_0call_0msg_send_3month":"11","silence_day_0call_0msg_send_6month":"25","continue_silence_day_over15_0call_active_6month":"0"}
     * all_contact_stats_per_month : [{"call_count_active":"14","call_count_passive":"19","call_time_offwork_time":"5638","contact_count":"22","call_time":"13467","call_count_call_time_1min5min":"4","contact_count_call_count_over10":"0","call_time_work_time":"7829","contact_count_active":"9","call_count_call_time_less1min":"17","call_count_call_time_over10min":"7","call_count_offwork_time":"16","call_time_late_night":"0","call_count_work_time":"17","contact_count_mutual":"4","month":"2017-12","call_time_passive":"5204","call_count_late_night":"0","call_count":"33","call_count_call_time_5min10min":"5","call_time_active":"8263","contact_count_passive":"17","msg_count":"0"},{"call_count_active":"56","call_count_passive":"50","call_time_offwork_time":"20145","contact_count":"43","call_time":"34077","call_count_call_time_1min5min":"27","contact_count_call_count_over10":"0","call_time_work_time":"11530","contact_count_active":"27","call_count_call_time_less1min":"54","call_count_call_time_over10min":"20","call_count_offwork_time":"56","call_time_late_night":"2402","call_count_work_time":"47","contact_count_mutual":"14","month":"2017-11","call_time_passive":"8531","call_count_late_night":"3","call_count":"106","call_count_call_time_5min10min":"5","call_time_active":"25546","contact_count_passive":"30","msg_count":"1"},{"call_count_active":"102","call_count_passive":"81","call_time_offwork_time":"9861","contact_count":"51","call_time":"22059","call_count_call_time_1min5min":"61","contact_count_call_count_over10":"4","call_time_work_time":"12198","contact_count_active":"39","call_count_call_time_less1min":"107","call_count_call_time_over10min":"8","call_count_offwork_time":"72","call_time_late_night":"0","call_count_work_time":"112","contact_count_mutual":"20","month":"2017-10","call_time_passive":"6887","call_count_late_night":"0","call_count":"184","call_count_call_time_5min10min":"8","call_time_active":"15102","contact_count_passive":"31","msg_count":"2"},{"call_count_active":"38","call_count_passive":"37","call_time_offwork_time":"12558","contact_count":"42","call_time":"17590","call_count_call_time_1min5min":"20","contact_count_call_count_over10":"0","call_time_work_time":"5032","contact_count_active":"19","call_count_call_time_less1min":"38","call_count_call_time_over10min":"11","call_count_offwork_time":"45","call_time_late_night":"0","call_count_work_time":"30","contact_count_mutual":"7","month":"2017-09","call_time_passive":"3237","call_count_late_night":"0","call_count":"75","call_count_call_time_5min10min":"6","call_time_active":"14353","contact_count_passive":"30","msg_count":"6"},{"call_count_active":"41","call_count_passive":"48","call_time_offwork_time":"9336","contact_count":"42","call_time":"13367","call_count_call_time_1min5min":"23","contact_count_call_count_over10":"1","call_time_work_time":"4031","contact_count_active":"17","call_count_call_time_less1min":"54","call_count_call_time_over10min":"8","call_count_offwork_time":"39","call_time_late_night":"0","call_count_work_time":"50","contact_count_mutual":"7","month":"2017-08","call_time_passive":"6907","call_count_late_night":"0","call_count":"89","call_count_call_time_5min10min":"4","call_time_active":"6460","contact_count_passive":"32","msg_count":"2"},{"call_count_active":"35","call_count_passive":"35","call_time_offwork_time":"6056","contact_count":"39","call_time":"11796","call_count_call_time_1min5min":"16","contact_count_call_count_over10":"0","call_time_work_time":"5740","contact_count_active":"19","call_count_call_time_less1min":"44","call_count_call_time_over10min":"6","call_count_offwork_time":"21","call_time_late_night":"0","call_count_work_time":"49","contact_count_mutual":"7","month":"2017-07","call_time_passive":"3203","call_count_late_night":"0","call_count":"70","call_count_call_time_5min10min":"4","call_time_active":"8593","contact_count_passive":"27","msg_count":"3"}]
     * risk_contact_stats : []
     * home_tel_detail : null
     * behavior_score : {"risk_contact_info_score":null,"base_info_score":null,"bill_info_score":null,"total_score":null,"call_info_score":"44"}
     * finance_contact_detail : [{"call_count_holiday_3month":"1","call_count_holiday_6month":"1","contact_attribute":"其他号码","call_count_active_6month":"3","call_time_3month":"321","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"1","call_time_6month":"473","contact_type":"银行","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"473","call_time_work_time_6month":"473","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-14 08:28:23","call_time_active_3month":"321","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"1","contact_name":"农业银行","contact_relation":null,"call_count_work_time_3month":"1","call_count_workday_3month":"0","call_count_6month":"3","call_count_offwork_time_3month":"0","is_virtual_number":"否","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"321","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"34.00","contact_number":"95599","contact_area":null,"call_count_1week":"0","contact_seq_no":"41","is_whole_day_call_3month":"否","max_gap_day_call_6month":"34","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"2","last_time_call_6month":"2017-09-17 10:10:24","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"161","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"161","contact_type":"保险","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"3","call_time_active_6month":"0","call_time_work_time_6month":"10","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-08-07 18:24:45","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":"平安保险　","contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"3","call_count_offwork_time_3month":"0","is_virtual_number":"否","call_time_offwork_time_6month":"151","call_count_offwork_time_6month":"2","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":"8.00","contact_number":"95511","contact_area":null,"call_count_1week":"0","contact_seq_no":"44","is_whole_day_call_3month":"否","max_gap_day_call_6month":"8","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"3","last_time_call_6month":"2017-08-15 09:33:31","msg_count_1month":"0"},{"call_count_holiday_3month":"0","call_count_holiday_6month":"0","contact_attribute":"其他号码","call_count_active_6month":"0","call_time_3month":"0","msg_count_3month":"0","call_time_passive_6month":"11","call_time_1month":"0","call_count_active_3month":"0","call_time_6month":"11","contact_type":"保险","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"1","call_time_active_6month":"0","call_time_work_time_6month":"11","msg_count_6month":"0","call_count_work_time_6month":"1","call_time_late_night_3month":"0","first_time_call_6month":"2017-07-05 12:30:12","call_time_active_3month":"0","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"0","contact_name":"泰康人寿保险　","contact_relation":null,"call_count_work_time_3month":"0","call_count_workday_3month":"0","call_count_6month":"1","call_count_offwork_time_3month":"0","is_virtual_number":"否","call_time_offwork_time_6month":"0","call_count_offwork_time_6month":"0","call_time_work_time_3month":"0","call_time_offwork_time_3month":"0","average_gap_day_call_6month":null,"contact_number":"95522","contact_area":null,"call_count_1week":"0","contact_seq_no":"153","is_whole_day_call_3month":"否","max_gap_day_call_6month":null,"call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-07-05 12:30:12","msg_count_1month":"0"},{"call_count_holiday_3month":"3","call_count_holiday_6month":"3","contact_attribute":"其他号码","call_count_active_6month":"4","call_time_3month":"316","msg_count_3month":"0","call_time_passive_6month":"0","call_time_1month":"0","call_count_active_3month":"4","call_time_6month":"316","contact_type":"投资理财","call_count_late_night_3month":"0","call_count_late_night_6month":"0","call_count_passive_6month":"0","call_time_active_6month":"316","call_time_work_time_6month":"154","msg_count_6month":"0","call_count_work_time_6month":"3","call_time_late_night_3month":"0","first_time_call_6month":"2017-10-14 17:50:35","call_time_active_3month":"316","call_time_late_night_6month":"0","call_count_passive_3month":"0","call_count_3month":"4","contact_name":"腾讯微信支付、理财通服务电话","contact_relation":null,"call_count_work_time_3month":"3","call_count_workday_3month":"1","call_count_6month":"4","call_count_offwork_time_3month":"1","is_virtual_number":"否","call_time_offwork_time_6month":"162","call_count_offwork_time_6month":"1","call_time_work_time_3month":"154","call_time_offwork_time_3month":"162","average_gap_day_call_6month":"10.00","contact_number":"95017","contact_area":null,"call_count_1week":"0","contact_seq_no":"30","is_whole_day_call_3month":"否","max_gap_day_call_6month":"10","call_count_1month":"0","call_time_passive_3month":"0","is_whole_day_call_6month":"否","call_count_workday_6month":"1","last_time_call_6month":"2017-10-24 14:34:07","msg_count_1month":"0"}]
     * call_area_stats_per_city : []
     */

    private ContactManyheadsAnalysisBean contact_manyheads_analysis;
    private MobileInfoBean mobile_info; //手机信息
    private CarrierConsumptionStatsBean carrier_consumption_stats;
    private Object emergency_contact1_detail;
    private Object emergency_contact2_detail;

    private Object emergency_contact4_detail;
    private Object emergency_contact3_detail;
    private ReportInfoBean report_info;
    private DataCompletenessBean data_completeness;
    private UserInfoBean user_info;//
    private ContactCreditscoreAnalysisBean contact_creditscore_analysis;
    private BehaviorAnalysisBean behavior_analysis;
    private AllContactStatsBean all_contact_stats;
    private Object work_tel_detail;
    private InfoCheckBean info_check;//
    private InfoMatchBean info_match;
    private ContactBlacklistAnalysisBean contact_blacklist_analysis;
    private Object emergency_contact5_detail;
    private CallDurationStats2hourBean call_duration_stats_2hour;
    private ActiveSilenceStatsBean active_silence_stats;
    private Object home_tel_detail;
    private BehaviorScoreBean behavior_score;
    private List<?> travel_track_analysis_per_city;
    private List<ContactAreaStatsPerCityBean> contact_area_stats_per_city;
    private List<CarrierConsumptionStatsPerMonthBean> carrier_consumption_stats_per_month;
    private List<FinanceContactStatsBean> finance_contact_stats;
    private List<?> risk_contact_detail;
    private List<AllContactDetailBean> all_contact_detail;//
    private List<AllContactStatsPerMonthBean> all_contact_stats_per_month;
    private List<?> risk_contact_stats;
    private List<FinanceContactDetailBean> finance_contact_detail;
    private List<?> call_area_stats_per_city;

    public ContactManyheadsAnalysisBean getContact_manyheads_analysis() {
        return contact_manyheads_analysis;
    }

    public void setContact_manyheads_analysis(ContactManyheadsAnalysisBean contact_manyheads_analysis) {
        this.contact_manyheads_analysis = contact_manyheads_analysis;
    }

    public MobileInfoBean getMobile_info() {
        return mobile_info;
    }

    public void setMobile_info(MobileInfoBean mobile_info) {
        this.mobile_info = mobile_info;
    }

    public CarrierConsumptionStatsBean getCarrier_consumption_stats() {
        return carrier_consumption_stats;
    }

    public void setCarrier_consumption_stats(CarrierConsumptionStatsBean carrier_consumption_stats) {
        this.carrier_consumption_stats = carrier_consumption_stats;
    }

    public Object getEmergency_contact1_detail() {
        return emergency_contact1_detail;
    }

    public void setEmergency_contact1_detail(Object emergency_contact1_detail) {
        this.emergency_contact1_detail = emergency_contact1_detail;
    }

    public Object getEmergency_contact2_detail() {
        return emergency_contact2_detail;
    }

    public void setEmergency_contact2_detail(Object emergency_contact2_detail) {
        this.emergency_contact2_detail = emergency_contact2_detail;
    }

    public ReportInfoBean getReport_info() {
        return report_info;
    }

    public void setReport_info(ReportInfoBean report_info) {
        this.report_info = report_info;
    }

    public Object getEmergency_contact4_detail() {
        return emergency_contact4_detail;
    }

    public void setEmergency_contact4_detail(Object emergency_contact4_detail) {
        this.emergency_contact4_detail = emergency_contact4_detail;
    }

    public Object getEmergency_contact3_detail() {
        return emergency_contact3_detail;
    }

    public void setEmergency_contact3_detail(Object emergency_contact3_detail) {
        this.emergency_contact3_detail = emergency_contact3_detail;
    }

    public DataCompletenessBean getData_completeness() {
        return data_completeness;
    }

    public void setData_completeness(DataCompletenessBean data_completeness) {
        this.data_completeness = data_completeness;
    }

    public UserInfoBean getUser_info() {
        return user_info;
    }

    public void setUser_info(UserInfoBean user_info) {
        this.user_info = user_info;
    }

    public ContactCreditscoreAnalysisBean getContact_creditscore_analysis() {
        return contact_creditscore_analysis;
    }

    public void setContact_creditscore_analysis(ContactCreditscoreAnalysisBean contact_creditscore_analysis) {
        this.contact_creditscore_analysis = contact_creditscore_analysis;
    }

    public BehaviorAnalysisBean getBehavior_analysis() {
        return behavior_analysis;
    }

    public void setBehavior_analysis(BehaviorAnalysisBean behavior_analysis) {
        this.behavior_analysis = behavior_analysis;
    }

    public AllContactStatsBean getAll_contact_stats() {
        return all_contact_stats;
    }

    public void setAll_contact_stats(AllContactStatsBean all_contact_stats) {
        this.all_contact_stats = all_contact_stats;
    }

    public Object getWork_tel_detail() {
        return work_tel_detail;
    }

    public void setWork_tel_detail(Object work_tel_detail) {
        this.work_tel_detail = work_tel_detail;
    }

    public InfoCheckBean getInfo_check() {
        return info_check;
    }

    public void setInfo_check(InfoCheckBean info_check) {
        this.info_check = info_check;
    }

    public InfoMatchBean getInfo_match() {
        return info_match;
    }

    public void setInfo_match(InfoMatchBean info_match) {
        this.info_match = info_match;
    }

    public ContactBlacklistAnalysisBean getContact_blacklist_analysis() {
        return contact_blacklist_analysis;
    }

    public void setContact_blacklist_analysis(ContactBlacklistAnalysisBean contact_blacklist_analysis) {
        this.contact_blacklist_analysis = contact_blacklist_analysis;
    }

    public Object getEmergency_contact5_detail() {
        return emergency_contact5_detail;
    }

    public void setEmergency_contact5_detail(Object emergency_contact5_detail) {
        this.emergency_contact5_detail = emergency_contact5_detail;
    }

    public CallDurationStats2hourBean getCall_duration_stats_2hour() {
        return call_duration_stats_2hour;
    }

    public void setCall_duration_stats_2hour(CallDurationStats2hourBean call_duration_stats_2hour) {
        this.call_duration_stats_2hour = call_duration_stats_2hour;
    }

    public ActiveSilenceStatsBean getActive_silence_stats() {
        return active_silence_stats;
    }

    public void setActive_silence_stats(ActiveSilenceStatsBean active_silence_stats) {
        this.active_silence_stats = active_silence_stats;
    }

    public Object getHome_tel_detail() {
        return home_tel_detail;
    }

    public void setHome_tel_detail(Object home_tel_detail) {
        this.home_tel_detail = home_tel_detail;
    }

    public BehaviorScoreBean getBehavior_score() {
        return behavior_score;
    }

    public void setBehavior_score(BehaviorScoreBean behavior_score) {
        this.behavior_score = behavior_score;
    }

    public List<?> getTravel_track_analysis_per_city() {
        return travel_track_analysis_per_city;
    }

    public void setTravel_track_analysis_per_city(List<?> travel_track_analysis_per_city) {
        this.travel_track_analysis_per_city = travel_track_analysis_per_city;
    }

    public List<ContactAreaStatsPerCityBean> getContact_area_stats_per_city() {
        return contact_area_stats_per_city;
    }

    public void setContact_area_stats_per_city(List<ContactAreaStatsPerCityBean> contact_area_stats_per_city) {
        this.contact_area_stats_per_city = contact_area_stats_per_city;
    }

    public List<CarrierConsumptionStatsPerMonthBean> getCarrier_consumption_stats_per_month() {
        return carrier_consumption_stats_per_month;
    }

    public void setCarrier_consumption_stats_per_month(List<CarrierConsumptionStatsPerMonthBean> carrier_consumption_stats_per_month) {
        this.carrier_consumption_stats_per_month = carrier_consumption_stats_per_month;
    }

    public List<FinanceContactStatsBean> getFinance_contact_stats() {
        return finance_contact_stats;
    }

    public void setFinance_contact_stats(List<FinanceContactStatsBean> finance_contact_stats) {
        this.finance_contact_stats = finance_contact_stats;
    }

    public List<?> getRisk_contact_detail() {
        return risk_contact_detail;
    }

    public void setRisk_contact_detail(List<?> risk_contact_detail) {
        this.risk_contact_detail = risk_contact_detail;
    }

    public List<AllContactDetailBean> getAll_contact_detail() {
        return all_contact_detail;
    }

    public void setAll_contact_detail(List<AllContactDetailBean> all_contact_detail) {
        this.all_contact_detail = all_contact_detail;
    }

    public List<AllContactStatsPerMonthBean> getAll_contact_stats_per_month() {
        return all_contact_stats_per_month;
    }

    public void setAll_contact_stats_per_month(List<AllContactStatsPerMonthBean> all_contact_stats_per_month) {
        this.all_contact_stats_per_month = all_contact_stats_per_month;
    }

    public List<?> getRisk_contact_stats() {
        return risk_contact_stats;
    }

    public void setRisk_contact_stats(List<?> risk_contact_stats) {
        this.risk_contact_stats = risk_contact_stats;
    }

    public List<FinanceContactDetailBean> getFinance_contact_detail() {
        return finance_contact_detail;
    }

    public void setFinance_contact_detail(List<FinanceContactDetailBean> finance_contact_detail) {
        this.finance_contact_detail = finance_contact_detail;
    }

    public List<?> getCall_area_stats_per_city() {
        return call_area_stats_per_city;
    }

    public void setCall_area_stats_per_city(List<?> call_area_stats_per_city) {
        this.call_area_stats_per_city = call_area_stats_per_city;
    }

    public static class ContactManyheadsAnalysisBean {
        /**
         * manyheads_top10_contact_recent6month_partnercode_count_avg : 0.60
         * manyheads_top10_contact_recent6month_partnercode_count_over2 : 2
         * manyheads_top10_contact_recent1month_partnercode_count_avg : 0.10
         * manyheads_top10_contact_recent3month_partnercode_count_over2 : 1
         * manyheads_top10_contact_recent6month_partnercode_count_max : 2
         * manyheads_top10_contact_recent3month_partnercode_count_max : 2
         * manyheads_top10_contact_recent1month_partnercode_count_max : 1
         * manyheads_top10_contact_recent1month_have_partnercode_count : 1
         * manyheads_top10_contact_recent3month_partnercode_count_avg : 0.40
         * manyheads_top10_contact_recent3month_have_partnercode_count : 3
         * manyheads_top10_contact_recent6month_have_partnercode_count : 4
         * manyheads_top10_contact_recent1month_partnercode_count_over2 : 0
         */

        private String manyheads_top10_contact_recent6month_partnercode_count_avg;
        private String manyheads_top10_contact_recent6month_partnercode_count_over2;
        private String manyheads_top10_contact_recent1month_partnercode_count_avg;
        private String manyheads_top10_contact_recent3month_partnercode_count_over2;
        private String manyheads_top10_contact_recent6month_partnercode_count_max;
        private String manyheads_top10_contact_recent3month_partnercode_count_max;
        private String manyheads_top10_contact_recent1month_partnercode_count_max;
        private String manyheads_top10_contact_recent1month_have_partnercode_count;
        private String manyheads_top10_contact_recent3month_partnercode_count_avg;
        private String manyheads_top10_contact_recent3month_have_partnercode_count;
        private String manyheads_top10_contact_recent6month_have_partnercode_count;
        private String manyheads_top10_contact_recent1month_partnercode_count_over2;

        public String getManyheads_top10_contact_recent6month_partnercode_count_avg() {
            return manyheads_top10_contact_recent6month_partnercode_count_avg;
        }

        public void setManyheads_top10_contact_recent6month_partnercode_count_avg(String manyheads_top10_contact_recent6month_partnercode_count_avg) {
            this.manyheads_top10_contact_recent6month_partnercode_count_avg = manyheads_top10_contact_recent6month_partnercode_count_avg;
        }

        public String getManyheads_top10_contact_recent6month_partnercode_count_over2() {
            return manyheads_top10_contact_recent6month_partnercode_count_over2;
        }

        public void setManyheads_top10_contact_recent6month_partnercode_count_over2(String manyheads_top10_contact_recent6month_partnercode_count_over2) {
            this.manyheads_top10_contact_recent6month_partnercode_count_over2 = manyheads_top10_contact_recent6month_partnercode_count_over2;
        }

        public String getManyheads_top10_contact_recent1month_partnercode_count_avg() {
            return manyheads_top10_contact_recent1month_partnercode_count_avg;
        }

        public void setManyheads_top10_contact_recent1month_partnercode_count_avg(String manyheads_top10_contact_recent1month_partnercode_count_avg) {
            this.manyheads_top10_contact_recent1month_partnercode_count_avg = manyheads_top10_contact_recent1month_partnercode_count_avg;
        }

        public String getManyheads_top10_contact_recent3month_partnercode_count_over2() {
            return manyheads_top10_contact_recent3month_partnercode_count_over2;
        }

        public void setManyheads_top10_contact_recent3month_partnercode_count_over2(String manyheads_top10_contact_recent3month_partnercode_count_over2) {
            this.manyheads_top10_contact_recent3month_partnercode_count_over2 = manyheads_top10_contact_recent3month_partnercode_count_over2;
        }

        public String getManyheads_top10_contact_recent6month_partnercode_count_max() {
            return manyheads_top10_contact_recent6month_partnercode_count_max;
        }

        public void setManyheads_top10_contact_recent6month_partnercode_count_max(String manyheads_top10_contact_recent6month_partnercode_count_max) {
            this.manyheads_top10_contact_recent6month_partnercode_count_max = manyheads_top10_contact_recent6month_partnercode_count_max;
        }

        public String getManyheads_top10_contact_recent3month_partnercode_count_max() {
            return manyheads_top10_contact_recent3month_partnercode_count_max;
        }

        public void setManyheads_top10_contact_recent3month_partnercode_count_max(String manyheads_top10_contact_recent3month_partnercode_count_max) {
            this.manyheads_top10_contact_recent3month_partnercode_count_max = manyheads_top10_contact_recent3month_partnercode_count_max;
        }

        public String getManyheads_top10_contact_recent1month_partnercode_count_max() {
            return manyheads_top10_contact_recent1month_partnercode_count_max;
        }

        public void setManyheads_top10_contact_recent1month_partnercode_count_max(String manyheads_top10_contact_recent1month_partnercode_count_max) {
            this.manyheads_top10_contact_recent1month_partnercode_count_max = manyheads_top10_contact_recent1month_partnercode_count_max;
        }

        public String getManyheads_top10_contact_recent1month_have_partnercode_count() {
            return manyheads_top10_contact_recent1month_have_partnercode_count;
        }

        public void setManyheads_top10_contact_recent1month_have_partnercode_count(String manyheads_top10_contact_recent1month_have_partnercode_count) {
            this.manyheads_top10_contact_recent1month_have_partnercode_count = manyheads_top10_contact_recent1month_have_partnercode_count;
        }

        public String getManyheads_top10_contact_recent3month_partnercode_count_avg() {
            return manyheads_top10_contact_recent3month_partnercode_count_avg;
        }

        public void setManyheads_top10_contact_recent3month_partnercode_count_avg(String manyheads_top10_contact_recent3month_partnercode_count_avg) {
            this.manyheads_top10_contact_recent3month_partnercode_count_avg = manyheads_top10_contact_recent3month_partnercode_count_avg;
        }

        public String getManyheads_top10_contact_recent3month_have_partnercode_count() {
            return manyheads_top10_contact_recent3month_have_partnercode_count;
        }

        public void setManyheads_top10_contact_recent3month_have_partnercode_count(String manyheads_top10_contact_recent3month_have_partnercode_count) {
            this.manyheads_top10_contact_recent3month_have_partnercode_count = manyheads_top10_contact_recent3month_have_partnercode_count;
        }

        public String getManyheads_top10_contact_recent6month_have_partnercode_count() {
            return manyheads_top10_contact_recent6month_have_partnercode_count;
        }

        public void setManyheads_top10_contact_recent6month_have_partnercode_count(String manyheads_top10_contact_recent6month_have_partnercode_count) {
            this.manyheads_top10_contact_recent6month_have_partnercode_count = manyheads_top10_contact_recent6month_have_partnercode_count;
        }

        public String getManyheads_top10_contact_recent1month_partnercode_count_over2() {
            return manyheads_top10_contact_recent1month_partnercode_count_over2;
        }

        public void setManyheads_top10_contact_recent1month_partnercode_count_over2(String manyheads_top10_contact_recent1month_partnercode_count_over2) {
            this.manyheads_top10_contact_recent1month_partnercode_count_over2 = manyheads_top10_contact_recent1month_partnercode_count_over2;
        }
    }

    public static class MobileInfoBean {
        /**
         * identity_code : 2103**********2729
         * contact_addr : 未知
         * account_balance : 13631
         * user_mobile : 13110992819
         * mobile_net_addr : 福建省.泉州市
         * mobile_carrier : 中国联通
         * real_name : 孙雪
         * account_status : 正常
         * mobile_net_time : 2013-09-15
         * package_type : 沃4G
         * mobile_net_age : 50
         * email : 未知
         */

        private String identity_code;
        private String contact_addr;
        private BigDecimal account_balance;
        private String user_mobile;
        private String mobile_net_addr;
        private String mobile_carrier;
        private String real_name;
        private String account_status;
        private String mobile_net_time;
        private String package_type;
        private String mobile_net_age;
        private String email;

        public String getIdentity_code() {
            return identity_code;
        }

        public void setIdentity_code(String identity_code) {
            this.identity_code = identity_code;
        }

        public String getContact_addr() {
            return contact_addr;
        }

        public void setContact_addr(String contact_addr) {
            this.contact_addr = contact_addr;
        }

        public BigDecimal getAccount_balance() {
            return account_balance;
        }

        public void setAccount_balance(BigDecimal account_balance) {
            this.account_balance = account_balance;
        }

        public String getUser_mobile() {
            return user_mobile;
        }

        public void setUser_mobile(String user_mobile) {
            this.user_mobile = user_mobile;
        }

        public String getMobile_net_addr() {
            return mobile_net_addr;
        }

        public void setMobile_net_addr(String mobile_net_addr) {
            this.mobile_net_addr = mobile_net_addr;
        }

        public String getMobile_carrier() {
            return mobile_carrier;
        }

        public void setMobile_carrier(String mobile_carrier) {
            this.mobile_carrier = mobile_carrier;
        }

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public String getAccount_status() {
            return account_status;
        }

        public void setAccount_status(String account_status) {
            this.account_status = account_status;
        }

        public String getMobile_net_time() {
            return mobile_net_time;
        }

        public void setMobile_net_time(String mobile_net_time) {
            this.mobile_net_time = mobile_net_time;
        }

        public String getPackage_type() {
            return package_type;
        }

        public void setPackage_type(String package_type) {
            this.package_type = package_type;
        }

        public String getMobile_net_age() {
            return mobile_net_age;
        }

        public void setMobile_net_age(String mobile_net_age) {
            this.mobile_net_age = mobile_net_age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public static class CarrierConsumptionStatsBean {
        /**
         * recharge_amount_3month : 42836
         * consume_amount_1month : 0
         * recharge_count_1month : 2
         * recharge_amount_6month : 42836
         * consume_amount_6month : 49155
         * recharge_count_3month : 8
         * recharge_amount_1month : 15000
         * consume_amount_3month : 23305
         * recharge_count_6month : 8
         */

        private String recharge_amount_3month;
        private String consume_amount_1month;
        private String recharge_count_1month;
        private String recharge_amount_6month;
        private String consume_amount_6month;
        private String recharge_count_3month;
        private String recharge_amount_1month;
        private String consume_amount_3month;
        private String recharge_count_6month;

        public String getRecharge_amount_3month() {
            return recharge_amount_3month;
        }

        public void setRecharge_amount_3month(String recharge_amount_3month) {
            this.recharge_amount_3month = recharge_amount_3month;
        }

        public String getConsume_amount_1month() {
            return consume_amount_1month;
        }

        public void setConsume_amount_1month(String consume_amount_1month) {
            this.consume_amount_1month = consume_amount_1month;
        }

        public String getRecharge_count_1month() {
            return recharge_count_1month;
        }

        public void setRecharge_count_1month(String recharge_count_1month) {
            this.recharge_count_1month = recharge_count_1month;
        }

        public String getRecharge_amount_6month() {
            return recharge_amount_6month;
        }

        public void setRecharge_amount_6month(String recharge_amount_6month) {
            this.recharge_amount_6month = recharge_amount_6month;
        }

        public String getConsume_amount_6month() {
            return consume_amount_6month;
        }

        public void setConsume_amount_6month(String consume_amount_6month) {
            this.consume_amount_6month = consume_amount_6month;
        }

        public String getRecharge_count_3month() {
            return recharge_count_3month;
        }

        public void setRecharge_count_3month(String recharge_count_3month) {
            this.recharge_count_3month = recharge_count_3month;
        }

        public String getRecharge_amount_1month() {
            return recharge_amount_1month;
        }

        public void setRecharge_amount_1month(String recharge_amount_1month) {
            this.recharge_amount_1month = recharge_amount_1month;
        }

        public String getConsume_amount_3month() {
            return consume_amount_3month;
        }

        public void setConsume_amount_3month(String consume_amount_3month) {
            this.consume_amount_3month = consume_amount_3month;
        }

        public String getRecharge_count_6month() {
            return recharge_count_6month;
        }

        public void setRecharge_count_6month(String recharge_count_6month) {
            this.recharge_count_6month = recharge_count_6month;
        }
    }

    public static class ReportInfoBean {
        /**
         * report_id : MH201712141510153676576815592448
         * report_update_time : 2017-12-14 15:10:15
         * task_id : TASKYYS100000201712141509520681100311
         * report_version : v3.0
         * task_time : 2017-12-14 15:10:04
         */

        private String report_id;
        private String report_update_time;
        private String task_id;
        private String report_version;
        private String task_time;

        public String getReport_id() {
            return report_id;
        }

        public void setReport_id(String report_id) {
            this.report_id = report_id;
        }

        public String getReport_update_time() {
            return report_update_time;
        }

        public void setReport_update_time(String report_update_time) {
            this.report_update_time = report_update_time;
        }

        public String getTask_id() {
            return task_id;
        }

        public void setTask_id(String task_id) {
            this.task_id = task_id;
        }

        public String getReport_version() {
            return report_version;
        }

        public void setReport_version(String report_version) {
            this.report_version = report_version;
        }

        public String getTask_time() {
            return task_time;
        }

        public void setTask_time(String task_time) {
            this.task_time = task_time;
        }
    }

    public static class DataCompletenessBean {
        /**
         * is_call_data_complete_3month : 是
         * is_msg_data_complete_6month : 是
         * data_completeness_per_month : [{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-07","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-08","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-09","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-10","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-11","is_call_data_complete":"是"},{"is_msg_data_complete":"是","is_consume_data_complete":"是","month":"2017-12","is_call_data_complete":"是"}]
         * is_msg_data_complete_1month : 是
         * is_consume_data_complete_1month : 是
         * is_consume_data_complete_6month : 是
         * is_call_data_complete_1month : 是
         * is_consume_data_complete_3month : 是
         * is_call_data_complete_6month : 是
         * is_msg_data_complete_3month : 是
         */

        private String is_call_data_complete_3month;
        private String is_msg_data_complete_6month;
        private String is_msg_data_complete_1month;
        private String is_consume_data_complete_1month;
        private String is_consume_data_complete_6month;
        private String is_call_data_complete_1month;
        private String is_consume_data_complete_3month;
        private String is_call_data_complete_6month;
        private String is_msg_data_complete_3month;
        private List<DataCompletenessPerMonthBean> data_completeness_per_month;

        public String getIs_call_data_complete_3month() {
            return is_call_data_complete_3month;
        }

        public void setIs_call_data_complete_3month(String is_call_data_complete_3month) {
            this.is_call_data_complete_3month = is_call_data_complete_3month;
        }

        public String getIs_msg_data_complete_6month() {
            return is_msg_data_complete_6month;
        }

        public void setIs_msg_data_complete_6month(String is_msg_data_complete_6month) {
            this.is_msg_data_complete_6month = is_msg_data_complete_6month;
        }

        public String getIs_msg_data_complete_1month() {
            return is_msg_data_complete_1month;
        }

        public void setIs_msg_data_complete_1month(String is_msg_data_complete_1month) {
            this.is_msg_data_complete_1month = is_msg_data_complete_1month;
        }

        public String getIs_consume_data_complete_1month() {
            return is_consume_data_complete_1month;
        }

        public void setIs_consume_data_complete_1month(String is_consume_data_complete_1month) {
            this.is_consume_data_complete_1month = is_consume_data_complete_1month;
        }

        public String getIs_consume_data_complete_6month() {
            return is_consume_data_complete_6month;
        }

        public void setIs_consume_data_complete_6month(String is_consume_data_complete_6month) {
            this.is_consume_data_complete_6month = is_consume_data_complete_6month;
        }

        public String getIs_call_data_complete_1month() {
            return is_call_data_complete_1month;
        }

        public void setIs_call_data_complete_1month(String is_call_data_complete_1month) {
            this.is_call_data_complete_1month = is_call_data_complete_1month;
        }

        public String getIs_consume_data_complete_3month() {
            return is_consume_data_complete_3month;
        }

        public void setIs_consume_data_complete_3month(String is_consume_data_complete_3month) {
            this.is_consume_data_complete_3month = is_consume_data_complete_3month;
        }

        public String getIs_call_data_complete_6month() {
            return is_call_data_complete_6month;
        }

        public void setIs_call_data_complete_6month(String is_call_data_complete_6month) {
            this.is_call_data_complete_6month = is_call_data_complete_6month;
        }

        public String getIs_msg_data_complete_3month() {
            return is_msg_data_complete_3month;
        }

        public void setIs_msg_data_complete_3month(String is_msg_data_complete_3month) {
            this.is_msg_data_complete_3month = is_msg_data_complete_3month;
        }

        public List<DataCompletenessPerMonthBean> getData_completeness_per_month() {
            return data_completeness_per_month;
        }

        public void setData_completeness_per_month(List<DataCompletenessPerMonthBean> data_completeness_per_month) {
            this.data_completeness_per_month = data_completeness_per_month;
        }

        public static class DataCompletenessPerMonthBean {
            /**
             * is_msg_data_complete : 是
             * is_consume_data_complete : 是
             * month : 2017-07
             * is_call_data_complete : 是
             */

            private String is_msg_data_complete;
            private String is_consume_data_complete;
            private String month;
            private String is_call_data_complete;

            public String getIs_msg_data_complete() {
                return is_msg_data_complete;
            }

            public void setIs_msg_data_complete(String is_msg_data_complete) {
                this.is_msg_data_complete = is_msg_data_complete;
            }

            public String getIs_consume_data_complete() {
                return is_consume_data_complete;
            }

            public void setIs_consume_data_complete(String is_consume_data_complete) {
                this.is_consume_data_complete = is_consume_data_complete;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
            }

            public String getIs_call_data_complete() {
                return is_call_data_complete;
            }

            public void setIs_call_data_complete(String is_call_data_complete) {
                this.is_call_data_complete = is_call_data_complete;
            }
        }
    }

    public static class UserInfoBean {
        /**
         * identity_code : 350322199402131552
         * home_tel : null
         * hometown : 福建省.莆田市
         * gender : 男
         * constellation : 水瓶座
         * work_tel : null
         * company_name : null
         * work_addr : null
         * home_addr : null
         * real_name : 陈山
         * email : null
         * age : 23
         */

        private String identity_code;
        private String home_tel;
        private String hometown;
        private String gender;
        private String constellation;
        private String work_tel;
        private String company_name;
        private String work_addr;
        private String home_addr;
        private String real_name;
        private String email;
        private String age;

        public String getIdentity_code() {
            return identity_code;
        }

        public void setIdentity_code(String identity_code) {
            this.identity_code = identity_code;
        }

        public String getHome_tel() {
            return home_tel;
        }

        public void setHome_tel(String home_tel) {
            this.home_tel = home_tel;
        }

        public void setWork_tel(String work_tel) {
            this.work_tel = work_tel;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
        }

        public void setWork_addr(String work_addr) {
            this.work_addr = work_addr;
        }

        public void setHome_addr(String home_addr) {
            this.home_addr = home_addr;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getConstellation() {
            return constellation;
        }

        public void setConstellation(String constellation) {
            this.constellation = constellation;
        }


        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public String getWork_tel() {
            return work_tel;
        }

        public String getCompany_name() {
            return company_name;
        }

        public String getWork_addr() {
            return work_addr;
        }

        public String getHome_addr() {
            return home_addr;
        }

        public String getEmail() {
            return email;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }

    public static class ContactCreditscoreAnalysisBean {
        /**
         * creditscore_top10_contact_count : 5
         * creditscore_top10_contact_median : 704.00
         * creditscore_top10_contact_avg : 738.00
         * creditscore_top10_contact_min : 679.00
         * creditscore_top10_contact_max : 853.00
         */

        private String creditscore_top10_contact_count;
        private String creditscore_top10_contact_median;
        private String creditscore_top10_contact_avg;
        private String creditscore_top10_contact_min;
        private String creditscore_top10_contact_max;

        public String getCreditscore_top10_contact_count() {
            return creditscore_top10_contact_count;
        }

        public void setCreditscore_top10_contact_count(String creditscore_top10_contact_count) {
            this.creditscore_top10_contact_count = creditscore_top10_contact_count;
        }

        public String getCreditscore_top10_contact_median() {
            return creditscore_top10_contact_median;
        }

        public void setCreditscore_top10_contact_median(String creditscore_top10_contact_median) {
            this.creditscore_top10_contact_median = creditscore_top10_contact_median;
        }

        public String getCreditscore_top10_contact_avg() {
            return creditscore_top10_contact_avg;
        }

        public void setCreditscore_top10_contact_avg(String creditscore_top10_contact_avg) {
            this.creditscore_top10_contact_avg = creditscore_top10_contact_avg;
        }

        public String getCreditscore_top10_contact_min() {
            return creditscore_top10_contact_min;
        }

        public void setCreditscore_top10_contact_min(String creditscore_top10_contact_min) {
            this.creditscore_top10_contact_min = creditscore_top10_contact_min;
        }

        public String getCreditscore_top10_contact_max() {
            return creditscore_top10_contact_max;
        }

        public void setCreditscore_top10_contact_max(String creditscore_top10_contact_max) {
            this.creditscore_top10_contact_max = creditscore_top10_contact_max;
        }
    }

    public static class BehaviorAnalysisBean {
        /**
         * emergency_contact3_analysis_6month : 无数据
         * late_night_analysis_6month : 正常活动
         * call_120_analysis_6month : 从未通话
         * emergency_contact4_analysis_6month : 无数据
         * call_lawyer_analysis_6month : 从未通话
         * emergency_contact2_analysis_6month : 无数据
         * mutual_number_analysis_6month : 数量正常
         * loan_contact_analysis_6month : 从未通话
         * emergency_contact5_analysis_6month : 无数据
         * emergency_contact1_analysis_6month : 无数据
         * collection_contact_analysis_6month : 从未通话
         * call_110_analysis_6month : 从未通话
         * call_court_analysis_6month : 从未通话
         * mobile_net_age_analysis : 使用时间2年到5年
         * mobile_silence_analysis_6month : 正常静默
         * call_macau_analysis_6month : 从未通话
         */

        private String emergency_contact3_analysis_6month;
        private String late_night_analysis_6month;
        private String call_120_analysis_6month;
        private String emergency_contact4_analysis_6month;
        private String call_lawyer_analysis_6month;
        private String emergency_contact2_analysis_6month;
        private String mutual_number_analysis_6month;
        private String loan_contact_analysis_6month;
        private String emergency_contact5_analysis_6month;
        private String emergency_contact1_analysis_6month;
        private String collection_contact_analysis_6month;
        private String call_110_analysis_6month;
        private String call_court_analysis_6month;
        private String mobile_net_age_analysis;
        private String mobile_silence_analysis_6month;
        private String call_macau_analysis_6month;

        public String getEmergency_contact3_analysis_6month() {
            return emergency_contact3_analysis_6month;
        }

        public void setEmergency_contact3_analysis_6month(String emergency_contact3_analysis_6month) {
            this.emergency_contact3_analysis_6month = emergency_contact3_analysis_6month;
        }

        public String getLate_night_analysis_6month() {
            return late_night_analysis_6month;
        }

        public void setLate_night_analysis_6month(String late_night_analysis_6month) {
            this.late_night_analysis_6month = late_night_analysis_6month;
        }

        public String getCall_120_analysis_6month() {
            return call_120_analysis_6month;
        }

        public void setCall_120_analysis_6month(String call_120_analysis_6month) {
            this.call_120_analysis_6month = call_120_analysis_6month;
        }

        public String getEmergency_contact4_analysis_6month() {
            return emergency_contact4_analysis_6month;
        }

        public void setEmergency_contact4_analysis_6month(String emergency_contact4_analysis_6month) {
            this.emergency_contact4_analysis_6month = emergency_contact4_analysis_6month;
        }

        public String getCall_lawyer_analysis_6month() {
            return call_lawyer_analysis_6month;
        }

        public void setCall_lawyer_analysis_6month(String call_lawyer_analysis_6month) {
            this.call_lawyer_analysis_6month = call_lawyer_analysis_6month;
        }

        public String getEmergency_contact2_analysis_6month() {
            return emergency_contact2_analysis_6month;
        }

        public void setEmergency_contact2_analysis_6month(String emergency_contact2_analysis_6month) {
            this.emergency_contact2_analysis_6month = emergency_contact2_analysis_6month;
        }

        public String getMutual_number_analysis_6month() {
            return mutual_number_analysis_6month;
        }

        public void setMutual_number_analysis_6month(String mutual_number_analysis_6month) {
            this.mutual_number_analysis_6month = mutual_number_analysis_6month;
        }

        public String getLoan_contact_analysis_6month() {
            return loan_contact_analysis_6month;
        }

        public void setLoan_contact_analysis_6month(String loan_contact_analysis_6month) {
            this.loan_contact_analysis_6month = loan_contact_analysis_6month;
        }

        public String getEmergency_contact5_analysis_6month() {
            return emergency_contact5_analysis_6month;
        }

        public void setEmergency_contact5_analysis_6month(String emergency_contact5_analysis_6month) {
            this.emergency_contact5_analysis_6month = emergency_contact5_analysis_6month;
        }

        public String getEmergency_contact1_analysis_6month() {
            return emergency_contact1_analysis_6month;
        }

        public void setEmergency_contact1_analysis_6month(String emergency_contact1_analysis_6month) {
            this.emergency_contact1_analysis_6month = emergency_contact1_analysis_6month;
        }

        public String getCollection_contact_analysis_6month() {
            return collection_contact_analysis_6month;
        }

        public void setCollection_contact_analysis_6month(String collection_contact_analysis_6month) {
            this.collection_contact_analysis_6month = collection_contact_analysis_6month;
        }

        public String getCall_110_analysis_6month() {
            return call_110_analysis_6month;
        }

        public void setCall_110_analysis_6month(String call_110_analysis_6month) {
            this.call_110_analysis_6month = call_110_analysis_6month;
        }

        public String getCall_court_analysis_6month() {
            return call_court_analysis_6month;
        }

        public void setCall_court_analysis_6month(String call_court_analysis_6month) {
            this.call_court_analysis_6month = call_court_analysis_6month;
        }

        public String getMobile_net_age_analysis() {
            return mobile_net_age_analysis;
        }

        public void setMobile_net_age_analysis(String mobile_net_age_analysis) {
            this.mobile_net_age_analysis = mobile_net_age_analysis;
        }

        public String getMobile_silence_analysis_6month() {
            return mobile_silence_analysis_6month;
        }

        public void setMobile_silence_analysis_6month(String mobile_silence_analysis_6month) {
            this.mobile_silence_analysis_6month = mobile_silence_analysis_6month;
        }

        public String getCall_macau_analysis_6month() {
            return call_macau_analysis_6month;
        }

        public void setCall_macau_analysis_6month(String call_macau_analysis_6month) {
            this.call_macau_analysis_6month = call_macau_analysis_6month;
        }
    }

    public static class AllContactStatsBean {
        /**
         * call_count_holiday_3month : 172
         * call_count_call_time_over10min_6month : 60
         * contact_count_active_3month : 65
         * call_count_active_6month : 286
         * call_time_1month : 26140
         * call_time_active_mobile_6month : 72379
         * call_time_6month : 112356
         * call_count_late_night_6month : 3
         * call_count_passive_6month : 270
         * call_time_active_6month : 78317
         * msg_count_6month : 14
         * contact_count_passive_6month : 134
         * call_count_call_time_5min10min_6month : 32
         * call_time_passive_mobile_6month : 32007
         * call_time_late_night_6month : 2402
         * call_count_3month : 373
         * contact_count_1month : 37
         * call_count_work_time_3month : 200
         * call_count_workday_3month : 201
         * call_count_6month : 557
         * call_count_offwork_time_3month : 170
         * call_time_offwork_time_6month : 63594
         * call_count_offwork_time_6month : 249
         * call_time_offwork_time_3month : 41796
         * contact_count_mutual_3month : 35
         * call_count_1month : 78
         * contact_count_telephone_6month : 24
         * call_time_passive_3month : 22651
         * call_count_call_time_less1min_6month : 314
         * contact_count_call_count_over10_3month : 6
         * call_count_workday_6month : 308
         * contact_count_call_count_over10_6month : 12
         * msg_count_1month : 0
         * contact_count_mutual_6month : 43
         * call_count_call_time_1min5min_6month : 151
         * call_count_holiday_6month : 249
         * contact_count_active_6month : 83
         * call_time_3month : 79781
         * msg_count_3month : 9
         * call_time_passive_6month : 33969
         * call_count_active_3month : 198
         * call_count_late_night_3month : 3
         * call_time_work_time_6month : 46360
         * call_count_work_time_6month : 305
         * call_time_late_night_3month : 2402
         * call_time_active_3month : 57060
         * contact_count_not_mobile_telephone_6month : 14
         * contact_count_passive_3month : 83
         * call_count_passive_3month : 174
         * call_count_active_late_night_6month : 1
         * call_time_work_time_3month : 35583
         * contact_count_mobile_6month : 137
         * call_count_passive_late_night_6month : 2
         * contact_count_3month : 114
         * contact_count_6month : 175
         */

        private String call_count_holiday_3month;
        private String call_count_call_time_over10min_6month;
        private String contact_count_active_3month;
        private String call_count_active_6month;
        private String call_time_1month;
        private String call_time_active_mobile_6month;
        private String call_time_6month;
        private String call_count_late_night_6month;
        private String call_count_passive_6month;
        private String call_time_active_6month;
        private String msg_count_6month;
        private String contact_count_passive_6month;
        private String call_count_call_time_5min10min_6month;
        private String call_time_passive_mobile_6month;
        private String call_time_late_night_6month;
        private String call_count_3month;
        private String contact_count_1month;
        private String call_count_work_time_3month;
        private String call_count_workday_3month;
        private String call_count_6month;
        private String call_count_offwork_time_3month;
        private String call_time_offwork_time_6month;
        private String call_count_offwork_time_6month;
        private String call_time_offwork_time_3month;
        private String contact_count_mutual_3month;
        private String call_count_1month;
        private String contact_count_telephone_6month;
        private String call_time_passive_3month;
        private String call_count_call_time_less1min_6month;
        private String contact_count_call_count_over10_3month;
        private String call_count_workday_6month;
        private String contact_count_call_count_over10_6month;
        private String msg_count_1month;
        private String contact_count_mutual_6month;
        private String call_count_call_time_1min5min_6month;
        private String call_count_holiday_6month;
        private String contact_count_active_6month;
        private String call_time_3month;
        private String msg_count_3month;
        private String call_time_passive_6month;
        private String call_count_active_3month;
        private String call_count_late_night_3month;
        private String call_time_work_time_6month;
        private String call_count_work_time_6month;
        private String call_time_late_night_3month;
        private String call_time_active_3month;
        private String contact_count_not_mobile_telephone_6month;
        private String contact_count_passive_3month;
        private String call_count_passive_3month;
        private String call_count_active_late_night_6month;
        private String call_time_work_time_3month;
        private String contact_count_mobile_6month;
        private String call_count_passive_late_night_6month;
        private String contact_count_3month;
        private String contact_count_6month;

        public String getCall_count_holiday_3month() {
            return call_count_holiday_3month;
        }

        public void setCall_count_holiday_3month(String call_count_holiday_3month) {
            this.call_count_holiday_3month = call_count_holiday_3month;
        }

        public String getCall_count_call_time_over10min_6month() {
            return call_count_call_time_over10min_6month;
        }

        public void setCall_count_call_time_over10min_6month(String call_count_call_time_over10min_6month) {
            this.call_count_call_time_over10min_6month = call_count_call_time_over10min_6month;
        }

        public String getContact_count_active_3month() {
            return contact_count_active_3month;
        }

        public void setContact_count_active_3month(String contact_count_active_3month) {
            this.contact_count_active_3month = contact_count_active_3month;
        }

        public String getCall_count_active_6month() {
            return call_count_active_6month;
        }

        public void setCall_count_active_6month(String call_count_active_6month) {
            this.call_count_active_6month = call_count_active_6month;
        }

        public String getCall_time_1month() {
            return call_time_1month;
        }

        public void setCall_time_1month(String call_time_1month) {
            this.call_time_1month = call_time_1month;
        }

        public String getCall_time_active_mobile_6month() {
            return call_time_active_mobile_6month;
        }

        public void setCall_time_active_mobile_6month(String call_time_active_mobile_6month) {
            this.call_time_active_mobile_6month = call_time_active_mobile_6month;
        }

        public String getCall_time_6month() {
            return call_time_6month;
        }

        public void setCall_time_6month(String call_time_6month) {
            this.call_time_6month = call_time_6month;
        }

        public String getCall_count_late_night_6month() {
            return call_count_late_night_6month;
        }

        public void setCall_count_late_night_6month(String call_count_late_night_6month) {
            this.call_count_late_night_6month = call_count_late_night_6month;
        }

        public String getCall_count_passive_6month() {
            return call_count_passive_6month;
        }

        public void setCall_count_passive_6month(String call_count_passive_6month) {
            this.call_count_passive_6month = call_count_passive_6month;
        }

        public String getCall_time_active_6month() {
            return call_time_active_6month;
        }

        public void setCall_time_active_6month(String call_time_active_6month) {
            this.call_time_active_6month = call_time_active_6month;
        }

        public String getMsg_count_6month() {
            return msg_count_6month;
        }

        public void setMsg_count_6month(String msg_count_6month) {
            this.msg_count_6month = msg_count_6month;
        }

        public String getContact_count_passive_6month() {
            return contact_count_passive_6month;
        }

        public void setContact_count_passive_6month(String contact_count_passive_6month) {
            this.contact_count_passive_6month = contact_count_passive_6month;
        }

        public String getCall_count_call_time_5min10min_6month() {
            return call_count_call_time_5min10min_6month;
        }

        public void setCall_count_call_time_5min10min_6month(String call_count_call_time_5min10min_6month) {
            this.call_count_call_time_5min10min_6month = call_count_call_time_5min10min_6month;
        }

        public String getCall_time_passive_mobile_6month() {
            return call_time_passive_mobile_6month;
        }

        public void setCall_time_passive_mobile_6month(String call_time_passive_mobile_6month) {
            this.call_time_passive_mobile_6month = call_time_passive_mobile_6month;
        }

        public String getCall_time_late_night_6month() {
            return call_time_late_night_6month;
        }

        public void setCall_time_late_night_6month(String call_time_late_night_6month) {
            this.call_time_late_night_6month = call_time_late_night_6month;
        }

        public String getCall_count_3month() {
            return call_count_3month;
        }

        public void setCall_count_3month(String call_count_3month) {
            this.call_count_3month = call_count_3month;
        }

        public String getContact_count_1month() {
            return contact_count_1month;
        }

        public void setContact_count_1month(String contact_count_1month) {
            this.contact_count_1month = contact_count_1month;
        }

        public String getCall_count_work_time_3month() {
            return call_count_work_time_3month;
        }

        public void setCall_count_work_time_3month(String call_count_work_time_3month) {
            this.call_count_work_time_3month = call_count_work_time_3month;
        }

        public String getCall_count_workday_3month() {
            return call_count_workday_3month;
        }

        public void setCall_count_workday_3month(String call_count_workday_3month) {
            this.call_count_workday_3month = call_count_workday_3month;
        }

        public String getCall_count_6month() {
            return call_count_6month;
        }

        public void setCall_count_6month(String call_count_6month) {
            this.call_count_6month = call_count_6month;
        }

        public String getCall_count_offwork_time_3month() {
            return call_count_offwork_time_3month;
        }

        public void setCall_count_offwork_time_3month(String call_count_offwork_time_3month) {
            this.call_count_offwork_time_3month = call_count_offwork_time_3month;
        }

        public String getCall_time_offwork_time_6month() {
            return call_time_offwork_time_6month;
        }

        public void setCall_time_offwork_time_6month(String call_time_offwork_time_6month) {
            this.call_time_offwork_time_6month = call_time_offwork_time_6month;
        }

        public String getCall_count_offwork_time_6month() {
            return call_count_offwork_time_6month;
        }

        public void setCall_count_offwork_time_6month(String call_count_offwork_time_6month) {
            this.call_count_offwork_time_6month = call_count_offwork_time_6month;
        }

        public String getCall_time_offwork_time_3month() {
            return call_time_offwork_time_3month;
        }

        public void setCall_time_offwork_time_3month(String call_time_offwork_time_3month) {
            this.call_time_offwork_time_3month = call_time_offwork_time_3month;
        }

        public String getContact_count_mutual_3month() {
            return contact_count_mutual_3month;
        }

        public void setContact_count_mutual_3month(String contact_count_mutual_3month) {
            this.contact_count_mutual_3month = contact_count_mutual_3month;
        }

        public String getCall_count_1month() {
            return call_count_1month;
        }

        public void setCall_count_1month(String call_count_1month) {
            this.call_count_1month = call_count_1month;
        }

        public String getContact_count_telephone_6month() {
            return contact_count_telephone_6month;
        }

        public void setContact_count_telephone_6month(String contact_count_telephone_6month) {
            this.contact_count_telephone_6month = contact_count_telephone_6month;
        }

        public String getCall_time_passive_3month() {
            return call_time_passive_3month;
        }

        public void setCall_time_passive_3month(String call_time_passive_3month) {
            this.call_time_passive_3month = call_time_passive_3month;
        }

        public String getCall_count_call_time_less1min_6month() {
            return call_count_call_time_less1min_6month;
        }

        public void setCall_count_call_time_less1min_6month(String call_count_call_time_less1min_6month) {
            this.call_count_call_time_less1min_6month = call_count_call_time_less1min_6month;
        }

        public String getContact_count_call_count_over10_3month() {
            return contact_count_call_count_over10_3month;
        }

        public void setContact_count_call_count_over10_3month(String contact_count_call_count_over10_3month) {
            this.contact_count_call_count_over10_3month = contact_count_call_count_over10_3month;
        }

        public String getCall_count_workday_6month() {
            return call_count_workday_6month;
        }

        public void setCall_count_workday_6month(String call_count_workday_6month) {
            this.call_count_workday_6month = call_count_workday_6month;
        }

        public String getContact_count_call_count_over10_6month() {
            return contact_count_call_count_over10_6month;
        }

        public void setContact_count_call_count_over10_6month(String contact_count_call_count_over10_6month) {
            this.contact_count_call_count_over10_6month = contact_count_call_count_over10_6month;
        }

        public String getMsg_count_1month() {
            return msg_count_1month;
        }

        public void setMsg_count_1month(String msg_count_1month) {
            this.msg_count_1month = msg_count_1month;
        }

        public String getContact_count_mutual_6month() {
            return contact_count_mutual_6month;
        }

        public void setContact_count_mutual_6month(String contact_count_mutual_6month) {
            this.contact_count_mutual_6month = contact_count_mutual_6month;
        }

        public String getCall_count_call_time_1min5min_6month() {
            return call_count_call_time_1min5min_6month;
        }

        public void setCall_count_call_time_1min5min_6month(String call_count_call_time_1min5min_6month) {
            this.call_count_call_time_1min5min_6month = call_count_call_time_1min5min_6month;
        }

        public String getCall_count_holiday_6month() {
            return call_count_holiday_6month;
        }

        public void setCall_count_holiday_6month(String call_count_holiday_6month) {
            this.call_count_holiday_6month = call_count_holiday_6month;
        }

        public String getContact_count_active_6month() {
            return contact_count_active_6month;
        }

        public void setContact_count_active_6month(String contact_count_active_6month) {
            this.contact_count_active_6month = contact_count_active_6month;
        }

        public String getCall_time_3month() {
            return call_time_3month;
        }

        public void setCall_time_3month(String call_time_3month) {
            this.call_time_3month = call_time_3month;
        }

        public String getMsg_count_3month() {
            return msg_count_3month;
        }

        public void setMsg_count_3month(String msg_count_3month) {
            this.msg_count_3month = msg_count_3month;
        }

        public String getCall_time_passive_6month() {
            return call_time_passive_6month;
        }

        public void setCall_time_passive_6month(String call_time_passive_6month) {
            this.call_time_passive_6month = call_time_passive_6month;
        }

        public String getCall_count_active_3month() {
            return call_count_active_3month;
        }

        public void setCall_count_active_3month(String call_count_active_3month) {
            this.call_count_active_3month = call_count_active_3month;
        }

        public String getCall_count_late_night_3month() {
            return call_count_late_night_3month;
        }

        public void setCall_count_late_night_3month(String call_count_late_night_3month) {
            this.call_count_late_night_3month = call_count_late_night_3month;
        }

        public String getCall_time_work_time_6month() {
            return call_time_work_time_6month;
        }

        public void setCall_time_work_time_6month(String call_time_work_time_6month) {
            this.call_time_work_time_6month = call_time_work_time_6month;
        }

        public String getCall_count_work_time_6month() {
            return call_count_work_time_6month;
        }

        public void setCall_count_work_time_6month(String call_count_work_time_6month) {
            this.call_count_work_time_6month = call_count_work_time_6month;
        }

        public String getCall_time_late_night_3month() {
            return call_time_late_night_3month;
        }

        public void setCall_time_late_night_3month(String call_time_late_night_3month) {
            this.call_time_late_night_3month = call_time_late_night_3month;
        }

        public String getCall_time_active_3month() {
            return call_time_active_3month;
        }

        public void setCall_time_active_3month(String call_time_active_3month) {
            this.call_time_active_3month = call_time_active_3month;
        }

        public String getContact_count_not_mobile_telephone_6month() {
            return contact_count_not_mobile_telephone_6month;
        }

        public void setContact_count_not_mobile_telephone_6month(String contact_count_not_mobile_telephone_6month) {
            this.contact_count_not_mobile_telephone_6month = contact_count_not_mobile_telephone_6month;
        }

        public String getContact_count_passive_3month() {
            return contact_count_passive_3month;
        }

        public void setContact_count_passive_3month(String contact_count_passive_3month) {
            this.contact_count_passive_3month = contact_count_passive_3month;
        }

        public String getCall_count_passive_3month() {
            return call_count_passive_3month;
        }

        public void setCall_count_passive_3month(String call_count_passive_3month) {
            this.call_count_passive_3month = call_count_passive_3month;
        }

        public String getCall_count_active_late_night_6month() {
            return call_count_active_late_night_6month;
        }

        public void setCall_count_active_late_night_6month(String call_count_active_late_night_6month) {
            this.call_count_active_late_night_6month = call_count_active_late_night_6month;
        }

        public String getCall_time_work_time_3month() {
            return call_time_work_time_3month;
        }

        public void setCall_time_work_time_3month(String call_time_work_time_3month) {
            this.call_time_work_time_3month = call_time_work_time_3month;
        }

        public String getContact_count_mobile_6month() {
            return contact_count_mobile_6month;
        }

        public void setContact_count_mobile_6month(String contact_count_mobile_6month) {
            this.contact_count_mobile_6month = contact_count_mobile_6month;
        }

        public String getCall_count_passive_late_night_6month() {
            return call_count_passive_late_night_6month;
        }

        public void setCall_count_passive_late_night_6month(String call_count_passive_late_night_6month) {
            this.call_count_passive_late_night_6month = call_count_passive_late_night_6month;
        }

        public String getContact_count_3month() {
            return contact_count_3month;
        }

        public void setContact_count_3month(String contact_count_3month) {
            this.contact_count_3month = contact_count_3month;
        }

        public String getContact_count_6month() {
            return contact_count_6month;
        }

        public void setContact_count_6month(String contact_count_6month) {
            this.contact_count_6month = contact_count_6month;
        }
    }

    public static class InfoCheckBean {
        /**
         * is_contact4_called_6month : 无数据
         * is_net_addr_call_addr_3month : 无数据
         * is_identity_code_reliable : 是 运营商是否实名认证
         * is_contact2_called_6month : 无数据
         * is_work_tel_called_6month : 无数据
         * is_contact3_called_6month : 无数据
         * is_net_age_over_3month : 是
         * is_mobile_status_active : 是
         * is_contact1_called_6month : 无数据
         * is_home_tel_called_6month : 无数据
         * is_contact5_called_6month : 无数据
         * is_net_addr_call_addr_1month : 无数据
         * is_identity_code_valid : 是
         * is_net_addr_call_addr_6month : 无数据
         */

        private String is_contact4_called_6month;
        private String is_net_addr_call_addr_3month;
        private String is_identity_code_reliable;
        private String is_contact2_called_6month;
        private String is_work_tel_called_6month;
        private String is_contact3_called_6month;
        private String is_net_age_over_3month;
        private String is_mobile_status_active;
        private String is_contact1_called_6month;
        private String is_home_tel_called_6month;
        private String is_contact5_called_6month;
        private String is_net_addr_call_addr_1month;
        private String is_identity_code_valid;
        private String is_net_addr_call_addr_6month;

        public String getIs_contact4_called_6month() {
            return is_contact4_called_6month;
        }

        public void setIs_contact4_called_6month(String is_contact4_called_6month) {
            this.is_contact4_called_6month = is_contact4_called_6month;
        }

        public String getIs_net_addr_call_addr_3month() {
            return is_net_addr_call_addr_3month;
        }

        public void setIs_net_addr_call_addr_3month(String is_net_addr_call_addr_3month) {
            this.is_net_addr_call_addr_3month = is_net_addr_call_addr_3month;
        }

        public String getIs_identity_code_reliable() {
            return is_identity_code_reliable;
        }

        public void setIs_identity_code_reliable(String is_identity_code_reliable) {
            this.is_identity_code_reliable = is_identity_code_reliable;
        }

        public String getIs_contact2_called_6month() {
            return is_contact2_called_6month;
        }

        public void setIs_contact2_called_6month(String is_contact2_called_6month) {
            this.is_contact2_called_6month = is_contact2_called_6month;
        }

        public String getIs_work_tel_called_6month() {
            return is_work_tel_called_6month;
        }

        public void setIs_work_tel_called_6month(String is_work_tel_called_6month) {
            this.is_work_tel_called_6month = is_work_tel_called_6month;
        }

        public String getIs_contact3_called_6month() {
            return is_contact3_called_6month;
        }

        public void setIs_contact3_called_6month(String is_contact3_called_6month) {
            this.is_contact3_called_6month = is_contact3_called_6month;
        }

        public String getIs_net_age_over_3month() {
            return is_net_age_over_3month;
        }

        public void setIs_net_age_over_3month(String is_net_age_over_3month) {
            this.is_net_age_over_3month = is_net_age_over_3month;
        }

        public String getIs_mobile_status_active() {
            return is_mobile_status_active;
        }

        public void setIs_mobile_status_active(String is_mobile_status_active) {
            this.is_mobile_status_active = is_mobile_status_active;
        }

        public String getIs_contact1_called_6month() {
            return is_contact1_called_6month;
        }

        public void setIs_contact1_called_6month(String is_contact1_called_6month) {
            this.is_contact1_called_6month = is_contact1_called_6month;
        }

        public String getIs_home_tel_called_6month() {
            return is_home_tel_called_6month;
        }

        public void setIs_home_tel_called_6month(String is_home_tel_called_6month) {
            this.is_home_tel_called_6month = is_home_tel_called_6month;
        }

        public String getIs_contact5_called_6month() {
            return is_contact5_called_6month;
        }

        public void setIs_contact5_called_6month(String is_contact5_called_6month) {
            this.is_contact5_called_6month = is_contact5_called_6month;
        }

        public String getIs_net_addr_call_addr_1month() {
            return is_net_addr_call_addr_1month;
        }

        public void setIs_net_addr_call_addr_1month(String is_net_addr_call_addr_1month) {
            this.is_net_addr_call_addr_1month = is_net_addr_call_addr_1month;
        }

        public String getIs_identity_code_valid() {
            return is_identity_code_valid;
        }

        public void setIs_identity_code_valid(String is_identity_code_valid) {
            this.is_identity_code_valid = is_identity_code_valid;
        }

        public String getIs_net_addr_call_addr_6month() {
            return is_net_addr_call_addr_6month;
        }

        public void setIs_net_addr_call_addr_6month(String is_net_addr_call_addr_6month) {
            this.is_net_addr_call_addr_6month = is_net_addr_call_addr_6month;
        }
    }

    public static class InfoMatchBean {
        /**
         * real_name_check_yys : 不匹配  //姓名是否和运营商匹配
         * email_check_yys : 无数据
         * identity_code_check_yys : 不匹配
         * home_addr_check_yys : 无数据
         */

        private String real_name_check_yys;
        private String email_check_yys;
        private String identity_code_check_yys;
        private String home_addr_check_yys;

        public String getReal_name_check_yys() {
            return real_name_check_yys;
        }

        public void setReal_name_check_yys(String real_name_check_yys) {
            this.real_name_check_yys = real_name_check_yys;
        }

        public String getEmail_check_yys() {
            return email_check_yys;
        }

        public void setEmail_check_yys(String email_check_yys) {
            this.email_check_yys = email_check_yys;
        }

        public String getIdentity_code_check_yys() {
            return identity_code_check_yys;
        }

        public void setIdentity_code_check_yys(String identity_code_check_yys) {
            this.identity_code_check_yys = identity_code_check_yys;
        }

        public String getHome_addr_check_yys() {
            return home_addr_check_yys;
        }

        public void setHome_addr_check_yys(String home_addr_check_yys) {
            this.home_addr_check_yys = home_addr_check_yys;
        }
    }

    public static class ContactBlacklistAnalysisBean {
        /**
         * black_top10_contact_carloan_blacklist_count_ratio : 0.00
         * black_top10_contact_fakemobile_count_ratio : 0.00
         * black_top10_contact_over2_count_ratio : 0.00
         * black_top10_contact_paymentfraud_count_ratio : 0.00
         * black_top10_contact_discreditrepay_count_ratio : 0.00
         * black_top10_contact_total_count_ratio : 0.00
         * black_top10_contact_creditcrack_count_ratio : 0.00
         * black_top10_contact_studentloans_overdue_count_ratio : 0.00
         * black_top10_contact_scalping_count_ratio : 0.00
         */

        private String black_top10_contact_carloan_blacklist_count_ratio;
        private String black_top10_contact_fakemobile_count_ratio;
        private String black_top10_contact_over2_count_ratio;
        private String black_top10_contact_paymentfraud_count_ratio;
        private String black_top10_contact_discreditrepay_count_ratio;
        private String black_top10_contact_total_count_ratio;
        private String black_top10_contact_creditcrack_count_ratio;
        private String black_top10_contact_studentloans_overdue_count_ratio;
        private String black_top10_contact_scalping_count_ratio;

        public String getBlack_top10_contact_carloan_blacklist_count_ratio() {
            return black_top10_contact_carloan_blacklist_count_ratio;
        }

        public void setBlack_top10_contact_carloan_blacklist_count_ratio(String black_top10_contact_carloan_blacklist_count_ratio) {
            this.black_top10_contact_carloan_blacklist_count_ratio = black_top10_contact_carloan_blacklist_count_ratio;
        }

        public String getBlack_top10_contact_fakemobile_count_ratio() {
            return black_top10_contact_fakemobile_count_ratio;
        }

        public void setBlack_top10_contact_fakemobile_count_ratio(String black_top10_contact_fakemobile_count_ratio) {
            this.black_top10_contact_fakemobile_count_ratio = black_top10_contact_fakemobile_count_ratio;
        }

        public String getBlack_top10_contact_over2_count_ratio() {
            return black_top10_contact_over2_count_ratio;
        }

        public void setBlack_top10_contact_over2_count_ratio(String black_top10_contact_over2_count_ratio) {
            this.black_top10_contact_over2_count_ratio = black_top10_contact_over2_count_ratio;
        }

        public String getBlack_top10_contact_paymentfraud_count_ratio() {
            return black_top10_contact_paymentfraud_count_ratio;
        }

        public void setBlack_top10_contact_paymentfraud_count_ratio(String black_top10_contact_paymentfraud_count_ratio) {
            this.black_top10_contact_paymentfraud_count_ratio = black_top10_contact_paymentfraud_count_ratio;
        }

        public String getBlack_top10_contact_discreditrepay_count_ratio() {
            return black_top10_contact_discreditrepay_count_ratio;
        }

        public void setBlack_top10_contact_discreditrepay_count_ratio(String black_top10_contact_discreditrepay_count_ratio) {
            this.black_top10_contact_discreditrepay_count_ratio = black_top10_contact_discreditrepay_count_ratio;
        }

        public String getBlack_top10_contact_total_count_ratio() {
            return black_top10_contact_total_count_ratio;
        }

        public void setBlack_top10_contact_total_count_ratio(String black_top10_contact_total_count_ratio) {
            this.black_top10_contact_total_count_ratio = black_top10_contact_total_count_ratio;
        }

        public String getBlack_top10_contact_creditcrack_count_ratio() {
            return black_top10_contact_creditcrack_count_ratio;
        }

        public void setBlack_top10_contact_creditcrack_count_ratio(String black_top10_contact_creditcrack_count_ratio) {
            this.black_top10_contact_creditcrack_count_ratio = black_top10_contact_creditcrack_count_ratio;
        }

        public String getBlack_top10_contact_studentloans_overdue_count_ratio() {
            return black_top10_contact_studentloans_overdue_count_ratio;
        }

        public void setBlack_top10_contact_studentloans_overdue_count_ratio(String black_top10_contact_studentloans_overdue_count_ratio) {
            this.black_top10_contact_studentloans_overdue_count_ratio = black_top10_contact_studentloans_overdue_count_ratio;
        }

        public String getBlack_top10_contact_scalping_count_ratio() {
            return black_top10_contact_scalping_count_ratio;
        }

        public void setBlack_top10_contact_scalping_count_ratio(String black_top10_contact_scalping_count_ratio) {
            this.black_top10_contact_scalping_count_ratio = black_top10_contact_scalping_count_ratio;
        }
    }

    public static class CallDurationStats2hourBean {
        /**
         * call_duration_workday_6month : {"t_0":"21","t_2":"0","t_1":"0","t_4":"7","t_3":"0","t_6":"42","t_5":"26","t_8":"26","t_10":"114","t_7":"18","t_11":"97","t_9":"112"}
         * call_duration_holiday_6month : {"t_0":"0","t_2":"0","t_1":"0","t_4":"67","t_3":"3","t_6":"128","t_5":"141","t_8":"85","t_10":"176","t_7":"209","t_11":"132","t_9":"199"}
         * call_duration_holiday_3month : {"t_0":"0","t_2":"0","t_1":"0","t_4":"107","t_3":"5","t_6":"130","t_5":"155","t_8":"135","t_10":"162","t_7":"324","t_11":"167","t_9":"187"}
         * call_duration_workday_3month : {"t_0":"39","t_2":"0","t_1":"0","t_4":"10","t_3":"0","t_6":"62","t_5":"28","t_8":"41","t_10":"178","t_7":"24","t_11":"102","t_9":"149"}
         */

        private CallDurationWorkday6monthBean call_duration_workday_6month;
        private CallDurationHoliday6monthBean call_duration_holiday_6month;
        private CallDurationHoliday3monthBean call_duration_holiday_3month;
        private CallDurationWorkday3monthBean call_duration_workday_3month;

        public CallDurationWorkday6monthBean getCall_duration_workday_6month() {
            return call_duration_workday_6month;
        }

        public void setCall_duration_workday_6month(CallDurationWorkday6monthBean call_duration_workday_6month) {
            this.call_duration_workday_6month = call_duration_workday_6month;
        }

        public CallDurationHoliday6monthBean getCall_duration_holiday_6month() {
            return call_duration_holiday_6month;
        }

        public void setCall_duration_holiday_6month(CallDurationHoliday6monthBean call_duration_holiday_6month) {
            this.call_duration_holiday_6month = call_duration_holiday_6month;
        }

        public CallDurationHoliday3monthBean getCall_duration_holiday_3month() {
            return call_duration_holiday_3month;
        }

        public void setCall_duration_holiday_3month(CallDurationHoliday3monthBean call_duration_holiday_3month) {
            this.call_duration_holiday_3month = call_duration_holiday_3month;
        }

        public CallDurationWorkday3monthBean getCall_duration_workday_3month() {
            return call_duration_workday_3month;
        }

        public void setCall_duration_workday_3month(CallDurationWorkday3monthBean call_duration_workday_3month) {
            this.call_duration_workday_3month = call_duration_workday_3month;
        }

        public static class CallDurationWorkday6monthBean {
            /**
             * t_0 : 21
             * t_2 : 0
             * t_1 : 0
             * t_4 : 7
             * t_3 : 0
             * t_6 : 42
             * t_5 : 26
             * t_8 : 26
             * t_10 : 114
             * t_7 : 18
             * t_11 : 97
             * t_9 : 112
             */

            private String t_0;
            private String t_2;
            private String t_1;
            private String t_4;
            private String t_3;
            private String t_6;
            private String t_5;
            private String t_8;
            private String t_10;
            private String t_7;
            private String t_11;
            private String t_9;

            public String getT_0() {
                return t_0;
            }

            public void setT_0(String t_0) {
                this.t_0 = t_0;
            }

            public String getT_2() {
                return t_2;
            }

            public void setT_2(String t_2) {
                this.t_2 = t_2;
            }

            public String getT_1() {
                return t_1;
            }

            public void setT_1(String t_1) {
                this.t_1 = t_1;
            }

            public String getT_4() {
                return t_4;
            }

            public void setT_4(String t_4) {
                this.t_4 = t_4;
            }

            public String getT_3() {
                return t_3;
            }

            public void setT_3(String t_3) {
                this.t_3 = t_3;
            }

            public String getT_6() {
                return t_6;
            }

            public void setT_6(String t_6) {
                this.t_6 = t_6;
            }

            public String getT_5() {
                return t_5;
            }

            public void setT_5(String t_5) {
                this.t_5 = t_5;
            }

            public String getT_8() {
                return t_8;
            }

            public void setT_8(String t_8) {
                this.t_8 = t_8;
            }

            public String getT_10() {
                return t_10;
            }

            public void setT_10(String t_10) {
                this.t_10 = t_10;
            }

            public String getT_7() {
                return t_7;
            }

            public void setT_7(String t_7) {
                this.t_7 = t_7;
            }

            public String getT_11() {
                return t_11;
            }

            public void setT_11(String t_11) {
                this.t_11 = t_11;
            }

            public String getT_9() {
                return t_9;
            }

            public void setT_9(String t_9) {
                this.t_9 = t_9;
            }
        }

        public static class CallDurationHoliday6monthBean {
            /**
             * t_0 : 0
             * t_2 : 0
             * t_1 : 0
             * t_4 : 67
             * t_3 : 3
             * t_6 : 128
             * t_5 : 141
             * t_8 : 85
             * t_10 : 176
             * t_7 : 209
             * t_11 : 132
             * t_9 : 199
             */

            private String t_0;
            private String t_2;
            private String t_1;
            private String t_4;
            private String t_3;
            private String t_6;
            private String t_5;
            private String t_8;
            private String t_10;
            private String t_7;
            private String t_11;
            private String t_9;

            public String getT_0() {
                return t_0;
            }

            public void setT_0(String t_0) {
                this.t_0 = t_0;
            }

            public String getT_2() {
                return t_2;
            }

            public void setT_2(String t_2) {
                this.t_2 = t_2;
            }

            public String getT_1() {
                return t_1;
            }

            public void setT_1(String t_1) {
                this.t_1 = t_1;
            }

            public String getT_4() {
                return t_4;
            }

            public void setT_4(String t_4) {
                this.t_4 = t_4;
            }

            public String getT_3() {
                return t_3;
            }

            public void setT_3(String t_3) {
                this.t_3 = t_3;
            }

            public String getT_6() {
                return t_6;
            }

            public void setT_6(String t_6) {
                this.t_6 = t_6;
            }

            public String getT_5() {
                return t_5;
            }

            public void setT_5(String t_5) {
                this.t_5 = t_5;
            }

            public String getT_8() {
                return t_8;
            }

            public void setT_8(String t_8) {
                this.t_8 = t_8;
            }

            public String getT_10() {
                return t_10;
            }

            public void setT_10(String t_10) {
                this.t_10 = t_10;
            }

            public String getT_7() {
                return t_7;
            }

            public void setT_7(String t_7) {
                this.t_7 = t_7;
            }

            public String getT_11() {
                return t_11;
            }

            public void setT_11(String t_11) {
                this.t_11 = t_11;
            }

            public String getT_9() {
                return t_9;
            }

            public void setT_9(String t_9) {
                this.t_9 = t_9;
            }
        }

        public static class CallDurationHoliday3monthBean {
            /**
             * t_0 : 0
             * t_2 : 0
             * t_1 : 0
             * t_4 : 107
             * t_3 : 5
             * t_6 : 130
             * t_5 : 155
             * t_8 : 135
             * t_10 : 162
             * t_7 : 324
             * t_11 : 167
             * t_9 : 187
             */

            private String t_0;
            private String t_2;
            private String t_1;
            private String t_4;
            private String t_3;
            private String t_6;
            private String t_5;
            private String t_8;
            private String t_10;
            private String t_7;
            private String t_11;
            private String t_9;

            public String getT_0() {
                return t_0;
            }

            public void setT_0(String t_0) {
                this.t_0 = t_0;
            }

            public String getT_2() {
                return t_2;
            }

            public void setT_2(String t_2) {
                this.t_2 = t_2;
            }

            public String getT_1() {
                return t_1;
            }

            public void setT_1(String t_1) {
                this.t_1 = t_1;
            }

            public String getT_4() {
                return t_4;
            }

            public void setT_4(String t_4) {
                this.t_4 = t_4;
            }

            public String getT_3() {
                return t_3;
            }

            public void setT_3(String t_3) {
                this.t_3 = t_3;
            }

            public String getT_6() {
                return t_6;
            }

            public void setT_6(String t_6) {
                this.t_6 = t_6;
            }

            public String getT_5() {
                return t_5;
            }

            public void setT_5(String t_5) {
                this.t_5 = t_5;
            }

            public String getT_8() {
                return t_8;
            }

            public void setT_8(String t_8) {
                this.t_8 = t_8;
            }

            public String getT_10() {
                return t_10;
            }

            public void setT_10(String t_10) {
                this.t_10 = t_10;
            }

            public String getT_7() {
                return t_7;
            }

            public void setT_7(String t_7) {
                this.t_7 = t_7;
            }

            public String getT_11() {
                return t_11;
            }

            public void setT_11(String t_11) {
                this.t_11 = t_11;
            }

            public String getT_9() {
                return t_9;
            }

            public void setT_9(String t_9) {
                this.t_9 = t_9;
            }
        }

        public static class CallDurationWorkday3monthBean {
            /**
             * t_0 : 39
             * t_2 : 0
             * t_1 : 0
             * t_4 : 10
             * t_3 : 0
             * t_6 : 62
             * t_5 : 28
             * t_8 : 41
             * t_10 : 178
             * t_7 : 24
             * t_11 : 102
             * t_9 : 149
             */

            private String t_0;
            private String t_2;
            private String t_1;
            private String t_4;
            private String t_3;
            private String t_6;
            private String t_5;
            private String t_8;
            private String t_10;
            private String t_7;
            private String t_11;
            private String t_9;

            public String getT_0() {
                return t_0;
            }

            public void setT_0(String t_0) {
                this.t_0 = t_0;
            }

            public String getT_2() {
                return t_2;
            }

            public void setT_2(String t_2) {
                this.t_2 = t_2;
            }

            public String getT_1() {
                return t_1;
            }

            public void setT_1(String t_1) {
                this.t_1 = t_1;
            }

            public String getT_4() {
                return t_4;
            }

            public void setT_4(String t_4) {
                this.t_4 = t_4;
            }

            public String getT_3() {
                return t_3;
            }

            public void setT_3(String t_3) {
                this.t_3 = t_3;
            }

            public String getT_6() {
                return t_6;
            }

            public void setT_6(String t_6) {
                this.t_6 = t_6;
            }

            public String getT_5() {
                return t_5;
            }

            public void setT_5(String t_5) {
                this.t_5 = t_5;
            }

            public String getT_8() {
                return t_8;
            }

            public void setT_8(String t_8) {
                this.t_8 = t_8;
            }

            public String getT_10() {
                return t_10;
            }

            public void setT_10(String t_10) {
                this.t_10 = t_10;
            }

            public String getT_7() {
                return t_7;
            }

            public void setT_7(String t_7) {
                this.t_7 = t_7;
            }

            public String getT_11() {
                return t_11;
            }

            public void setT_11(String t_11) {
                this.t_11 = t_11;
            }

            public String getT_9() {
                return t_9;
            }

            public void setT_9(String t_9) {
                this.t_9 = t_9;
            }
        }
    }

    public static class ActiveSilenceStatsBean {
        /**
         * continue_silence_day_over15_0call_3month_detail : []
         * active_day_1call_6month : 142
         * continue_silence_day_over15_0call_active_3month : 0
         * continue_silence_day_over15_0call_0msg_send_3month : 0
         * active_day_1call_3month : 80
         * gap_day_last_silence_day_0call_active_6month : 0
         * continue_silence_day_over3_0call_6month_detail : [{"end_date":"2017-09-14","start_date":"2017-09-11"},{"end_date":"2017-10-12","start_date":"2017-10-10"}]
         * max_continue_silence_day_0call_active_3month : 5
         * max_continue_silence_day_0call_active_6month : 5
         * continue_silence_day_over15_0call_0msg_send_6month : 0
         * continue_silence_day_over15_0call_0msg_send_6month_detail : []
         * continue_silence_day_over15_0call_3month : 0
         * silence_day_0call_active_6month : 68
         * continue_silence_day_over3_0call_3month_detail : [{"end_date":"2017-10-12","start_date":"2017-10-10"}]
         * continue_silence_day_over15_0call_6month : 0
         * silence_day_0call_active_3month : 30
         * continue_silence_day_over3_0call_0msg_send_3month : 1
         * continue_silence_day_over3_0call_active_3month_detail : [{"end_date":"2017-10-12","start_date":"2017-10-09"},{"end_date":"2017-11-20","start_date":"2017-11-18"},{"end_date":"2017-12-14","start_date":"2017-12-10"}]
         * continue_silence_day_over15_0call_6month_detail : []
         * continue_silence_day_over3_0call_active_6month : 10
         * continue_silence_day_over15_0call_0msg_send_3month_detail : []
         * continue_silence_day_over3_0call_active_6month_detail : [{"end_date":"2017-07-13","start_date":"2017-07-11"},{"end_date":"2017-07-28","start_date":"2017-07-26"},{"end_date":"2017-08-01","start_date":"2017-07-30"},{"end_date":"2017-08-18","start_date":"2017-08-15"},{"end_date":"2017-08-23","start_date":"2017-08-21"},{"end_date":"2017-09-01","start_date":"2017-08-30"},{"end_date":"2017-09-15","start_date":"2017-09-11"},{"end_date":"2017-10-12","start_date":"2017-10-09"},{"end_date":"2017-11-20","start_date":"2017-11-18"},{"end_date":"2017-12-14","start_date":"2017-12-10"}]
         * silence_day_0call_3month : 11
         * silence_day_0call_6month : 25
         * continue_silence_day_over3_0call_active_3month : 3
         * continue_silence_day_over3_0call_0msg_send_3month_detail : [{"end_date":"2017-10-12","start_date":"2017-10-10"}]
         * continue_silence_day_over15_0call_active_6month_detail : []
         * max_continue_silence_day_0call_6month : 4
         * gap_day_last_silence_day_0call_6month : 0
         * gap_day_last_silence_day_0call_0msg_send_6month : 0
         * max_continue_silence_day_0call_3month : 3
         * continue_silence_day_over3_0call_3month : 1
         * max_continue_active_day_1call_3month : 25
         * continue_silence_day_over3_0call_0msg_send_6month : 2
         * continue_silence_day_over3_0call_0msg_send_6month_detail : [{"end_date":"2017-09-14","start_date":"2017-09-11"},{"end_date":"2017-10-12","start_date":"2017-10-10"}]
         * max_continue_active_day_1call_6month : 25
         * continue_silence_day_over3_0call_6month : 2
         * max_continue_silence_day_0call_0msg_send_6month : 4
         * continue_silence_day_over15_0call_active_3month_detail : []
         * max_continue_silence_day_0call_0msg_send_3month : 3
         * silence_day_0call_0msg_send_3month : 11
         * silence_day_0call_0msg_send_6month : 25
         * continue_silence_day_over15_0call_active_6month : 0
         */

        private String active_day_1call_6month;
        private String continue_silence_day_over15_0call_active_3month;
        private String continue_silence_day_over15_0call_0msg_send_3month;
        private String active_day_1call_3month;
        private String gap_day_last_silence_day_0call_active_6month;
        private String max_continue_silence_day_0call_active_3month;
        private String max_continue_silence_day_0call_active_6month;
        private String continue_silence_day_over15_0call_0msg_send_6month;
        private String continue_silence_day_over15_0call_3month;
        private String silence_day_0call_active_6month;
        private String continue_silence_day_over15_0call_6month;
        private String silence_day_0call_active_3month;
        private String continue_silence_day_over3_0call_0msg_send_3month;
        private String continue_silence_day_over3_0call_active_6month;
        private String silence_day_0call_3month;
        private String silence_day_0call_6month;
        private String continue_silence_day_over3_0call_active_3month;
        private String max_continue_silence_day_0call_6month;
        private String gap_day_last_silence_day_0call_6month;
        private String gap_day_last_silence_day_0call_0msg_send_6month;
        private String max_continue_silence_day_0call_3month;
        private String continue_silence_day_over3_0call_3month;
        private String max_continue_active_day_1call_3month;
        private String continue_silence_day_over3_0call_0msg_send_6month;
        private String max_continue_active_day_1call_6month;
        private String continue_silence_day_over3_0call_6month;
        private String max_continue_silence_day_0call_0msg_send_6month;
        private String max_continue_silence_day_0call_0msg_send_3month;
        private String silence_day_0call_0msg_send_3month;
        private String silence_day_0call_0msg_send_6month;
        private String continue_silence_day_over15_0call_active_6month;
        private List<?> continue_silence_day_over15_0call_3month_detail;
        private List<ContinueSilenceDayOver30call6monthDetailBean> continue_silence_day_over3_0call_6month_detail;
        private List<?> continue_silence_day_over15_0call_0msg_send_6month_detail;
        private List<ContinueSilenceDayOver30call3monthDetailBean> continue_silence_day_over3_0call_3month_detail;
        private List<ContinueSilenceDayOver30callActive3monthDetailBean> continue_silence_day_over3_0call_active_3month_detail;
        private List<?> continue_silence_day_over15_0call_6month_detail;
        private List<?> continue_silence_day_over15_0call_0msg_send_3month_detail;
        private List<ContinueSilenceDayOver30callActive6monthDetailBean> continue_silence_day_over3_0call_active_6month_detail;
        private List<ContinueSilenceDayOver30call0msgSend3monthDetailBean> continue_silence_day_over3_0call_0msg_send_3month_detail;
        private List<?> continue_silence_day_over15_0call_active_6month_detail;
        private List<ContinueSilenceDayOver30call0msgSend6monthDetailBean> continue_silence_day_over3_0call_0msg_send_6month_detail;
        private List<?> continue_silence_day_over15_0call_active_3month_detail;

        public String getActive_day_1call_6month() {
            return active_day_1call_6month;
        }

        public void setActive_day_1call_6month(String active_day_1call_6month) {
            this.active_day_1call_6month = active_day_1call_6month;
        }

        public String getContinue_silence_day_over15_0call_active_3month() {
            return continue_silence_day_over15_0call_active_3month;
        }

        public void setContinue_silence_day_over15_0call_active_3month(String continue_silence_day_over15_0call_active_3month) {
            this.continue_silence_day_over15_0call_active_3month = continue_silence_day_over15_0call_active_3month;
        }

        public String getContinue_silence_day_over15_0call_0msg_send_3month() {
            return continue_silence_day_over15_0call_0msg_send_3month;
        }

        public void setContinue_silence_day_over15_0call_0msg_send_3month(String continue_silence_day_over15_0call_0msg_send_3month) {
            this.continue_silence_day_over15_0call_0msg_send_3month = continue_silence_day_over15_0call_0msg_send_3month;
        }

        public String getActive_day_1call_3month() {
            return active_day_1call_3month;
        }

        public void setActive_day_1call_3month(String active_day_1call_3month) {
            this.active_day_1call_3month = active_day_1call_3month;
        }

        public String getGap_day_last_silence_day_0call_active_6month() {
            return gap_day_last_silence_day_0call_active_6month;
        }

        public void setGap_day_last_silence_day_0call_active_6month(String gap_day_last_silence_day_0call_active_6month) {
            this.gap_day_last_silence_day_0call_active_6month = gap_day_last_silence_day_0call_active_6month;
        }

        public String getMax_continue_silence_day_0call_active_3month() {
            return max_continue_silence_day_0call_active_3month;
        }

        public void setMax_continue_silence_day_0call_active_3month(String max_continue_silence_day_0call_active_3month) {
            this.max_continue_silence_day_0call_active_3month = max_continue_silence_day_0call_active_3month;
        }

        public String getMax_continue_silence_day_0call_active_6month() {
            return max_continue_silence_day_0call_active_6month;
        }

        public void setMax_continue_silence_day_0call_active_6month(String max_continue_silence_day_0call_active_6month) {
            this.max_continue_silence_day_0call_active_6month = max_continue_silence_day_0call_active_6month;
        }

        public String getContinue_silence_day_over15_0call_0msg_send_6month() {
            return continue_silence_day_over15_0call_0msg_send_6month;
        }

        public void setContinue_silence_day_over15_0call_0msg_send_6month(String continue_silence_day_over15_0call_0msg_send_6month) {
            this.continue_silence_day_over15_0call_0msg_send_6month = continue_silence_day_over15_0call_0msg_send_6month;
        }

        public String getContinue_silence_day_over15_0call_3month() {
            return continue_silence_day_over15_0call_3month;
        }

        public void setContinue_silence_day_over15_0call_3month(String continue_silence_day_over15_0call_3month) {
            this.continue_silence_day_over15_0call_3month = continue_silence_day_over15_0call_3month;
        }

        public String getSilence_day_0call_active_6month() {
            return silence_day_0call_active_6month;
        }

        public void setSilence_day_0call_active_6month(String silence_day_0call_active_6month) {
            this.silence_day_0call_active_6month = silence_day_0call_active_6month;
        }

        public String getContinue_silence_day_over15_0call_6month() {
            return continue_silence_day_over15_0call_6month;
        }

        public void setContinue_silence_day_over15_0call_6month(String continue_silence_day_over15_0call_6month) {
            this.continue_silence_day_over15_0call_6month = continue_silence_day_over15_0call_6month;
        }

        public String getSilence_day_0call_active_3month() {
            return silence_day_0call_active_3month;
        }

        public void setSilence_day_0call_active_3month(String silence_day_0call_active_3month) {
            this.silence_day_0call_active_3month = silence_day_0call_active_3month;
        }

        public String getContinue_silence_day_over3_0call_0msg_send_3month() {
            return continue_silence_day_over3_0call_0msg_send_3month;
        }

        public void setContinue_silence_day_over3_0call_0msg_send_3month(String continue_silence_day_over3_0call_0msg_send_3month) {
            this.continue_silence_day_over3_0call_0msg_send_3month = continue_silence_day_over3_0call_0msg_send_3month;
        }

        public String getContinue_silence_day_over3_0call_active_6month() {
            return continue_silence_day_over3_0call_active_6month;
        }

        public void setContinue_silence_day_over3_0call_active_6month(String continue_silence_day_over3_0call_active_6month) {
            this.continue_silence_day_over3_0call_active_6month = continue_silence_day_over3_0call_active_6month;
        }

        public String getSilence_day_0call_3month() {
            return silence_day_0call_3month;
        }

        public void setSilence_day_0call_3month(String silence_day_0call_3month) {
            this.silence_day_0call_3month = silence_day_0call_3month;
        }

        public String getSilence_day_0call_6month() {
            return silence_day_0call_6month;
        }

        public void setSilence_day_0call_6month(String silence_day_0call_6month) {
            this.silence_day_0call_6month = silence_day_0call_6month;
        }

        public String getContinue_silence_day_over3_0call_active_3month() {
            return continue_silence_day_over3_0call_active_3month;
        }

        public void setContinue_silence_day_over3_0call_active_3month(String continue_silence_day_over3_0call_active_3month) {
            this.continue_silence_day_over3_0call_active_3month = continue_silence_day_over3_0call_active_3month;
        }

        public String getMax_continue_silence_day_0call_6month() {
            return max_continue_silence_day_0call_6month;
        }

        public void setMax_continue_silence_day_0call_6month(String max_continue_silence_day_0call_6month) {
            this.max_continue_silence_day_0call_6month = max_continue_silence_day_0call_6month;
        }

        public String getGap_day_last_silence_day_0call_6month() {
            return gap_day_last_silence_day_0call_6month;
        }

        public void setGap_day_last_silence_day_0call_6month(String gap_day_last_silence_day_0call_6month) {
            this.gap_day_last_silence_day_0call_6month = gap_day_last_silence_day_0call_6month;
        }

        public String getGap_day_last_silence_day_0call_0msg_send_6month() {
            return gap_day_last_silence_day_0call_0msg_send_6month;
        }

        public void setGap_day_last_silence_day_0call_0msg_send_6month(String gap_day_last_silence_day_0call_0msg_send_6month) {
            this.gap_day_last_silence_day_0call_0msg_send_6month = gap_day_last_silence_day_0call_0msg_send_6month;
        }

        public String getMax_continue_silence_day_0call_3month() {
            return max_continue_silence_day_0call_3month;
        }

        public void setMax_continue_silence_day_0call_3month(String max_continue_silence_day_0call_3month) {
            this.max_continue_silence_day_0call_3month = max_continue_silence_day_0call_3month;
        }

        public String getContinue_silence_day_over3_0call_3month() {
            return continue_silence_day_over3_0call_3month;
        }

        public void setContinue_silence_day_over3_0call_3month(String continue_silence_day_over3_0call_3month) {
            this.continue_silence_day_over3_0call_3month = continue_silence_day_over3_0call_3month;
        }

        public String getMax_continue_active_day_1call_3month() {
            return max_continue_active_day_1call_3month;
        }

        public void setMax_continue_active_day_1call_3month(String max_continue_active_day_1call_3month) {
            this.max_continue_active_day_1call_3month = max_continue_active_day_1call_3month;
        }

        public String getContinue_silence_day_over3_0call_0msg_send_6month() {
            return continue_silence_day_over3_0call_0msg_send_6month;
        }

        public void setContinue_silence_day_over3_0call_0msg_send_6month(String continue_silence_day_over3_0call_0msg_send_6month) {
            this.continue_silence_day_over3_0call_0msg_send_6month = continue_silence_day_over3_0call_0msg_send_6month;
        }

        public String getMax_continue_active_day_1call_6month() {
            return max_continue_active_day_1call_6month;
        }

        public void setMax_continue_active_day_1call_6month(String max_continue_active_day_1call_6month) {
            this.max_continue_active_day_1call_6month = max_continue_active_day_1call_6month;
        }

        public String getContinue_silence_day_over3_0call_6month() {
            return continue_silence_day_over3_0call_6month;
        }

        public void setContinue_silence_day_over3_0call_6month(String continue_silence_day_over3_0call_6month) {
            this.continue_silence_day_over3_0call_6month = continue_silence_day_over3_0call_6month;
        }

        public String getMax_continue_silence_day_0call_0msg_send_6month() {
            return max_continue_silence_day_0call_0msg_send_6month;
        }

        public void setMax_continue_silence_day_0call_0msg_send_6month(String max_continue_silence_day_0call_0msg_send_6month) {
            this.max_continue_silence_day_0call_0msg_send_6month = max_continue_silence_day_0call_0msg_send_6month;
        }

        public String getMax_continue_silence_day_0call_0msg_send_3month() {
            return max_continue_silence_day_0call_0msg_send_3month;
        }

        public void setMax_continue_silence_day_0call_0msg_send_3month(String max_continue_silence_day_0call_0msg_send_3month) {
            this.max_continue_silence_day_0call_0msg_send_3month = max_continue_silence_day_0call_0msg_send_3month;
        }

        public String getSilence_day_0call_0msg_send_3month() {
            return silence_day_0call_0msg_send_3month;
        }

        public void setSilence_day_0call_0msg_send_3month(String silence_day_0call_0msg_send_3month) {
            this.silence_day_0call_0msg_send_3month = silence_day_0call_0msg_send_3month;
        }

        public String getSilence_day_0call_0msg_send_6month() {
            return silence_day_0call_0msg_send_6month;
        }

        public void setSilence_day_0call_0msg_send_6month(String silence_day_0call_0msg_send_6month) {
            this.silence_day_0call_0msg_send_6month = silence_day_0call_0msg_send_6month;
        }

        public String getContinue_silence_day_over15_0call_active_6month() {
            return continue_silence_day_over15_0call_active_6month;
        }

        public void setContinue_silence_day_over15_0call_active_6month(String continue_silence_day_over15_0call_active_6month) {
            this.continue_silence_day_over15_0call_active_6month = continue_silence_day_over15_0call_active_6month;
        }

        public List<?> getContinue_silence_day_over15_0call_3month_detail() {
            return continue_silence_day_over15_0call_3month_detail;
        }

        public void setContinue_silence_day_over15_0call_3month_detail(List<?> continue_silence_day_over15_0call_3month_detail) {
            this.continue_silence_day_over15_0call_3month_detail = continue_silence_day_over15_0call_3month_detail;
        }

        public List<ContinueSilenceDayOver30call6monthDetailBean> getContinue_silence_day_over3_0call_6month_detail() {
            return continue_silence_day_over3_0call_6month_detail;
        }

        public void setContinue_silence_day_over3_0call_6month_detail(List<ContinueSilenceDayOver30call6monthDetailBean> continue_silence_day_over3_0call_6month_detail) {
            this.continue_silence_day_over3_0call_6month_detail = continue_silence_day_over3_0call_6month_detail;
        }

        public List<?> getContinue_silence_day_over15_0call_0msg_send_6month_detail() {
            return continue_silence_day_over15_0call_0msg_send_6month_detail;
        }

        public void setContinue_silence_day_over15_0call_0msg_send_6month_detail(List<?> continue_silence_day_over15_0call_0msg_send_6month_detail) {
            this.continue_silence_day_over15_0call_0msg_send_6month_detail = continue_silence_day_over15_0call_0msg_send_6month_detail;
        }

        public List<ContinueSilenceDayOver30call3monthDetailBean> getContinue_silence_day_over3_0call_3month_detail() {
            return continue_silence_day_over3_0call_3month_detail;
        }

        public void setContinue_silence_day_over3_0call_3month_detail(List<ContinueSilenceDayOver30call3monthDetailBean> continue_silence_day_over3_0call_3month_detail) {
            this.continue_silence_day_over3_0call_3month_detail = continue_silence_day_over3_0call_3month_detail;
        }

        public List<ContinueSilenceDayOver30callActive3monthDetailBean> getContinue_silence_day_over3_0call_active_3month_detail() {
            return continue_silence_day_over3_0call_active_3month_detail;
        }

        public void setContinue_silence_day_over3_0call_active_3month_detail(List<ContinueSilenceDayOver30callActive3monthDetailBean> continue_silence_day_over3_0call_active_3month_detail) {
            this.continue_silence_day_over3_0call_active_3month_detail = continue_silence_day_over3_0call_active_3month_detail;
        }

        public List<?> getContinue_silence_day_over15_0call_6month_detail() {
            return continue_silence_day_over15_0call_6month_detail;
        }

        public void setContinue_silence_day_over15_0call_6month_detail(List<?> continue_silence_day_over15_0call_6month_detail) {
            this.continue_silence_day_over15_0call_6month_detail = continue_silence_day_over15_0call_6month_detail;
        }

        public List<?> getContinue_silence_day_over15_0call_0msg_send_3month_detail() {
            return continue_silence_day_over15_0call_0msg_send_3month_detail;
        }

        public void setContinue_silence_day_over15_0call_0msg_send_3month_detail(List<?> continue_silence_day_over15_0call_0msg_send_3month_detail) {
            this.continue_silence_day_over15_0call_0msg_send_3month_detail = continue_silence_day_over15_0call_0msg_send_3month_detail;
        }

        public List<ContinueSilenceDayOver30callActive6monthDetailBean> getContinue_silence_day_over3_0call_active_6month_detail() {
            return continue_silence_day_over3_0call_active_6month_detail;
        }

        public void setContinue_silence_day_over3_0call_active_6month_detail(List<ContinueSilenceDayOver30callActive6monthDetailBean> continue_silence_day_over3_0call_active_6month_detail) {
            this.continue_silence_day_over3_0call_active_6month_detail = continue_silence_day_over3_0call_active_6month_detail;
        }

        public List<ContinueSilenceDayOver30call0msgSend3monthDetailBean> getContinue_silence_day_over3_0call_0msg_send_3month_detail() {
            return continue_silence_day_over3_0call_0msg_send_3month_detail;
        }

        public void setContinue_silence_day_over3_0call_0msg_send_3month_detail(List<ContinueSilenceDayOver30call0msgSend3monthDetailBean> continue_silence_day_over3_0call_0msg_send_3month_detail) {
            this.continue_silence_day_over3_0call_0msg_send_3month_detail = continue_silence_day_over3_0call_0msg_send_3month_detail;
        }

        public List<?> getContinue_silence_day_over15_0call_active_6month_detail() {
            return continue_silence_day_over15_0call_active_6month_detail;
        }

        public void setContinue_silence_day_over15_0call_active_6month_detail(List<?> continue_silence_day_over15_0call_active_6month_detail) {
            this.continue_silence_day_over15_0call_active_6month_detail = continue_silence_day_over15_0call_active_6month_detail;
        }

        public List<ContinueSilenceDayOver30call0msgSend6monthDetailBean> getContinue_silence_day_over3_0call_0msg_send_6month_detail() {
            return continue_silence_day_over3_0call_0msg_send_6month_detail;
        }

        public void setContinue_silence_day_over3_0call_0msg_send_6month_detail(List<ContinueSilenceDayOver30call0msgSend6monthDetailBean> continue_silence_day_over3_0call_0msg_send_6month_detail) {
            this.continue_silence_day_over3_0call_0msg_send_6month_detail = continue_silence_day_over3_0call_0msg_send_6month_detail;
        }

        public List<?> getContinue_silence_day_over15_0call_active_3month_detail() {
            return continue_silence_day_over15_0call_active_3month_detail;
        }

        public void setContinue_silence_day_over15_0call_active_3month_detail(List<?> continue_silence_day_over15_0call_active_3month_detail) {
            this.continue_silence_day_over15_0call_active_3month_detail = continue_silence_day_over15_0call_active_3month_detail;
        }

        public static class ContinueSilenceDayOver30call6monthDetailBean {
            /**
             * end_date : 2017-09-14
             * start_date : 2017-09-11
             */

            private String end_date;
            private String start_date;

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }
        }

        public static class ContinueSilenceDayOver30call3monthDetailBean {
            /**
             * end_date : 2017-10-12
             * start_date : 2017-10-10
             */

            private String end_date;
            private String start_date;

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }
        }

        public static class ContinueSilenceDayOver30callActive3monthDetailBean {
            /**
             * end_date : 2017-10-12
             * start_date : 2017-10-09
             */

            private String end_date;
            private String start_date;

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }
        }

        public static class ContinueSilenceDayOver30callActive6monthDetailBean {
            /**
             * end_date : 2017-07-13
             * start_date : 2017-07-11
             */

            private String end_date;
            private String start_date;

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }
        }

        public static class ContinueSilenceDayOver30call0msgSend3monthDetailBean {
            /**
             * end_date : 2017-10-12
             * start_date : 2017-10-10
             */

            private String end_date;
            private String start_date;

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }
        }

        public static class ContinueSilenceDayOver30call0msgSend6monthDetailBean {
            /**
             * end_date : 2017-09-14
             * start_date : 2017-09-11
             */

            private String end_date;
            private String start_date;

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public String getStart_date() {
                return start_date;
            }

            public void setStart_date(String start_date) {
                this.start_date = start_date;
            }
        }
    }

    public static class BehaviorScoreBean {
        /**
         * risk_contact_info_score : null
         * base_info_score : null
         * bill_info_score : null
         * total_score : null
         * call_info_score : 44
         */

        private Object risk_contact_info_score;
        private Object base_info_score;
        private Object bill_info_score;
        private Object total_score;
        private String call_info_score;

        public Object getRisk_contact_info_score() {
            return risk_contact_info_score;
        }

        public void setRisk_contact_info_score(Object risk_contact_info_score) {
            this.risk_contact_info_score = risk_contact_info_score;
        }

        public Object getBase_info_score() {
            return base_info_score;
        }

        public void setBase_info_score(Object base_info_score) {
            this.base_info_score = base_info_score;
        }

        public Object getBill_info_score() {
            return bill_info_score;
        }

        public void setBill_info_score(Object bill_info_score) {
            this.bill_info_score = bill_info_score;
        }

        public Object getTotal_score() {
            return total_score;
        }

        public void setTotal_score(Object total_score) {
            this.total_score = total_score;
        }

        public String getCall_info_score() {
            return call_info_score;
        }

        public void setCall_info_score(String call_info_score) {
            this.call_info_score = call_info_score;
        }
    }

    public static class ContactAreaStatsPerCityBean {
        /**
         * call_count_holiday_3month : 33
         * call_count_call_time_over10min_6month : 2
         * contact_count_active_3month : 19
         * call_count_active_6month : 66
         * call_time_1month : 1791
         * call_time_6month : 10513
         * contact_area_city : 浙江省.杭州市
         * call_count_late_night_6month : 0
         * call_count_passive_6month : 112
         * call_time_active_6month : 5526
         * msg_count_6month : 1
         * contact_count_passive_6month : 59
         * call_count_call_time_5min10min_6month : 1
         * call_time_late_night_6month : 0
         * call_count_3month : 128
         * contact_count_1month : 22
         * call_count_work_time_3month : 77
         * call_count_workday_3month : 95
         * call_count_6month : 178
         * call_count_offwork_time_3month : 51
         * call_time_offwork_time_6month : 3796
         * call_count_offwork_time_6month : 73
         * call_time_offwork_time_3month : 2984
         * contact_count_mutual_3month : 11
         * call_count_1month : 40
         * call_time_passive_3month : 3676
         * call_count_call_time_less1min_6month : 133
         * contact_count_call_count_over10_3month : 2
         * call_count_workday_6month : 132
         * contact_count_call_count_over10_6month : 4
         * msg_count_1month : 0
         * contact_count_mutual_6month : 13
         * call_count_call_time_1min5min_6month : 42
         * call_count_holiday_6month : 46
         * contact_count_active_6month : 24
         * call_time_3month : 8455
         * msg_count_3month : 0
         * call_time_passive_6month : 4987
         * call_count_active_3month : 51
         * call_count_late_night_3month : 0
         * call_time_work_time_6month : 6717
         * call_count_work_time_6month : 105
         * call_time_late_night_3month : 0
         * call_time_active_3month : 4779
         * contact_count_passive_3month : 36
         * call_count_passive_3month : 77
         * call_time_work_time_3month : 5471
         * contact_count_3month : 44
         * contact_area_seq_no : 1
         * contact_count_6month : 70
         */

        private String call_count_holiday_3month;
        private String call_count_call_time_over10min_6month;
        private String contact_count_active_3month;
        private String call_count_active_6month;
        private String call_time_1month;
        private String call_time_6month;
        private String contact_area_city;
        private String call_count_late_night_6month;
        private String call_count_passive_6month;
        private String call_time_active_6month;
        private String msg_count_6month;
        private String contact_count_passive_6month;
        private String call_count_call_time_5min10min_6month;
        private String call_time_late_night_6month;
        private String call_count_3month;
        private String contact_count_1month;
        private String call_count_work_time_3month;
        private String call_count_workday_3month;
        private String call_count_6month;
        private String call_count_offwork_time_3month;
        private String call_time_offwork_time_6month;
        private String call_count_offwork_time_6month;
        private String call_time_offwork_time_3month;
        private String contact_count_mutual_3month;
        private String call_count_1month;
        private String call_time_passive_3month;
        private String call_count_call_time_less1min_6month;
        private String contact_count_call_count_over10_3month;
        private String call_count_workday_6month;
        private String contact_count_call_count_over10_6month;
        private String msg_count_1month;
        private String contact_count_mutual_6month;
        private String call_count_call_time_1min5min_6month;
        private String call_count_holiday_6month;
        private String contact_count_active_6month;
        private String call_time_3month;
        private String msg_count_3month;
        private String call_time_passive_6month;
        private String call_count_active_3month;
        private String call_count_late_night_3month;
        private String call_time_work_time_6month;
        private String call_count_work_time_6month;
        private String call_time_late_night_3month;
        private String call_time_active_3month;
        private String contact_count_passive_3month;
        private String call_count_passive_3month;
        private String call_time_work_time_3month;
        private String contact_count_3month;
        private String contact_area_seq_no;
        private String contact_count_6month;

        public String getCall_count_holiday_3month() {
            return call_count_holiday_3month;
        }

        public void setCall_count_holiday_3month(String call_count_holiday_3month) {
            this.call_count_holiday_3month = call_count_holiday_3month;
        }

        public String getCall_count_call_time_over10min_6month() {
            return call_count_call_time_over10min_6month;
        }

        public void setCall_count_call_time_over10min_6month(String call_count_call_time_over10min_6month) {
            this.call_count_call_time_over10min_6month = call_count_call_time_over10min_6month;
        }

        public String getContact_count_active_3month() {
            return contact_count_active_3month;
        }

        public void setContact_count_active_3month(String contact_count_active_3month) {
            this.contact_count_active_3month = contact_count_active_3month;
        }

        public String getCall_count_active_6month() {
            return call_count_active_6month;
        }

        public void setCall_count_active_6month(String call_count_active_6month) {
            this.call_count_active_6month = call_count_active_6month;
        }

        public String getCall_time_1month() {
            return call_time_1month;
        }

        public void setCall_time_1month(String call_time_1month) {
            this.call_time_1month = call_time_1month;
        }

        public String getCall_time_6month() {
            return call_time_6month;
        }

        public void setCall_time_6month(String call_time_6month) {
            this.call_time_6month = call_time_6month;
        }

        public String getContact_area_city() {
            return contact_area_city;
        }

        public void setContact_area_city(String contact_area_city) {
            this.contact_area_city = contact_area_city;
        }

        public String getCall_count_late_night_6month() {
            return call_count_late_night_6month;
        }

        public void setCall_count_late_night_6month(String call_count_late_night_6month) {
            this.call_count_late_night_6month = call_count_late_night_6month;
        }

        public String getCall_count_passive_6month() {
            return call_count_passive_6month;
        }

        public void setCall_count_passive_6month(String call_count_passive_6month) {
            this.call_count_passive_6month = call_count_passive_6month;
        }

        public String getCall_time_active_6month() {
            return call_time_active_6month;
        }

        public void setCall_time_active_6month(String call_time_active_6month) {
            this.call_time_active_6month = call_time_active_6month;
        }

        public String getMsg_count_6month() {
            return msg_count_6month;
        }

        public void setMsg_count_6month(String msg_count_6month) {
            this.msg_count_6month = msg_count_6month;
        }

        public String getContact_count_passive_6month() {
            return contact_count_passive_6month;
        }

        public void setContact_count_passive_6month(String contact_count_passive_6month) {
            this.contact_count_passive_6month = contact_count_passive_6month;
        }

        public String getCall_count_call_time_5min10min_6month() {
            return call_count_call_time_5min10min_6month;
        }

        public void setCall_count_call_time_5min10min_6month(String call_count_call_time_5min10min_6month) {
            this.call_count_call_time_5min10min_6month = call_count_call_time_5min10min_6month;
        }

        public String getCall_time_late_night_6month() {
            return call_time_late_night_6month;
        }

        public void setCall_time_late_night_6month(String call_time_late_night_6month) {
            this.call_time_late_night_6month = call_time_late_night_6month;
        }

        public String getCall_count_3month() {
            return call_count_3month;
        }

        public void setCall_count_3month(String call_count_3month) {
            this.call_count_3month = call_count_3month;
        }

        public String getContact_count_1month() {
            return contact_count_1month;
        }

        public void setContact_count_1month(String contact_count_1month) {
            this.contact_count_1month = contact_count_1month;
        }

        public String getCall_count_work_time_3month() {
            return call_count_work_time_3month;
        }

        public void setCall_count_work_time_3month(String call_count_work_time_3month) {
            this.call_count_work_time_3month = call_count_work_time_3month;
        }

        public String getCall_count_workday_3month() {
            return call_count_workday_3month;
        }

        public void setCall_count_workday_3month(String call_count_workday_3month) {
            this.call_count_workday_3month = call_count_workday_3month;
        }

        public String getCall_count_6month() {
            return call_count_6month;
        }

        public void setCall_count_6month(String call_count_6month) {
            this.call_count_6month = call_count_6month;
        }

        public String getCall_count_offwork_time_3month() {
            return call_count_offwork_time_3month;
        }

        public void setCall_count_offwork_time_3month(String call_count_offwork_time_3month) {
            this.call_count_offwork_time_3month = call_count_offwork_time_3month;
        }

        public String getCall_time_offwork_time_6month() {
            return call_time_offwork_time_6month;
        }

        public void setCall_time_offwork_time_6month(String call_time_offwork_time_6month) {
            this.call_time_offwork_time_6month = call_time_offwork_time_6month;
        }

        public String getCall_count_offwork_time_6month() {
            return call_count_offwork_time_6month;
        }

        public void setCall_count_offwork_time_6month(String call_count_offwork_time_6month) {
            this.call_count_offwork_time_6month = call_count_offwork_time_6month;
        }

        public String getCall_time_offwork_time_3month() {
            return call_time_offwork_time_3month;
        }

        public void setCall_time_offwork_time_3month(String call_time_offwork_time_3month) {
            this.call_time_offwork_time_3month = call_time_offwork_time_3month;
        }

        public String getContact_count_mutual_3month() {
            return contact_count_mutual_3month;
        }

        public void setContact_count_mutual_3month(String contact_count_mutual_3month) {
            this.contact_count_mutual_3month = contact_count_mutual_3month;
        }

        public String getCall_count_1month() {
            return call_count_1month;
        }

        public void setCall_count_1month(String call_count_1month) {
            this.call_count_1month = call_count_1month;
        }

        public String getCall_time_passive_3month() {
            return call_time_passive_3month;
        }

        public void setCall_time_passive_3month(String call_time_passive_3month) {
            this.call_time_passive_3month = call_time_passive_3month;
        }

        public String getCall_count_call_time_less1min_6month() {
            return call_count_call_time_less1min_6month;
        }

        public void setCall_count_call_time_less1min_6month(String call_count_call_time_less1min_6month) {
            this.call_count_call_time_less1min_6month = call_count_call_time_less1min_6month;
        }

        public String getContact_count_call_count_over10_3month() {
            return contact_count_call_count_over10_3month;
        }

        public void setContact_count_call_count_over10_3month(String contact_count_call_count_over10_3month) {
            this.contact_count_call_count_over10_3month = contact_count_call_count_over10_3month;
        }

        public String getCall_count_workday_6month() {
            return call_count_workday_6month;
        }

        public void setCall_count_workday_6month(String call_count_workday_6month) {
            this.call_count_workday_6month = call_count_workday_6month;
        }

        public String getContact_count_call_count_over10_6month() {
            return contact_count_call_count_over10_6month;
        }

        public void setContact_count_call_count_over10_6month(String contact_count_call_count_over10_6month) {
            this.contact_count_call_count_over10_6month = contact_count_call_count_over10_6month;
        }

        public String getMsg_count_1month() {
            return msg_count_1month;
        }

        public void setMsg_count_1month(String msg_count_1month) {
            this.msg_count_1month = msg_count_1month;
        }

        public String getContact_count_mutual_6month() {
            return contact_count_mutual_6month;
        }

        public void setContact_count_mutual_6month(String contact_count_mutual_6month) {
            this.contact_count_mutual_6month = contact_count_mutual_6month;
        }

        public String getCall_count_call_time_1min5min_6month() {
            return call_count_call_time_1min5min_6month;
        }

        public void setCall_count_call_time_1min5min_6month(String call_count_call_time_1min5min_6month) {
            this.call_count_call_time_1min5min_6month = call_count_call_time_1min5min_6month;
        }

        public String getCall_count_holiday_6month() {
            return call_count_holiday_6month;
        }

        public void setCall_count_holiday_6month(String call_count_holiday_6month) {
            this.call_count_holiday_6month = call_count_holiday_6month;
        }

        public String getContact_count_active_6month() {
            return contact_count_active_6month;
        }

        public void setContact_count_active_6month(String contact_count_active_6month) {
            this.contact_count_active_6month = contact_count_active_6month;
        }

        public String getCall_time_3month() {
            return call_time_3month;
        }

        public void setCall_time_3month(String call_time_3month) {
            this.call_time_3month = call_time_3month;
        }

        public String getMsg_count_3month() {
            return msg_count_3month;
        }

        public void setMsg_count_3month(String msg_count_3month) {
            this.msg_count_3month = msg_count_3month;
        }

        public String getCall_time_passive_6month() {
            return call_time_passive_6month;
        }

        public void setCall_time_passive_6month(String call_time_passive_6month) {
            this.call_time_passive_6month = call_time_passive_6month;
        }

        public String getCall_count_active_3month() {
            return call_count_active_3month;
        }

        public void setCall_count_active_3month(String call_count_active_3month) {
            this.call_count_active_3month = call_count_active_3month;
        }

        public String getCall_count_late_night_3month() {
            return call_count_late_night_3month;
        }

        public void setCall_count_late_night_3month(String call_count_late_night_3month) {
            this.call_count_late_night_3month = call_count_late_night_3month;
        }

        public String getCall_time_work_time_6month() {
            return call_time_work_time_6month;
        }

        public void setCall_time_work_time_6month(String call_time_work_time_6month) {
            this.call_time_work_time_6month = call_time_work_time_6month;
        }

        public String getCall_count_work_time_6month() {
            return call_count_work_time_6month;
        }

        public void setCall_count_work_time_6month(String call_count_work_time_6month) {
            this.call_count_work_time_6month = call_count_work_time_6month;
        }

        public String getCall_time_late_night_3month() {
            return call_time_late_night_3month;
        }

        public void setCall_time_late_night_3month(String call_time_late_night_3month) {
            this.call_time_late_night_3month = call_time_late_night_3month;
        }

        public String getCall_time_active_3month() {
            return call_time_active_3month;
        }

        public void setCall_time_active_3month(String call_time_active_3month) {
            this.call_time_active_3month = call_time_active_3month;
        }

        public String getContact_count_passive_3month() {
            return contact_count_passive_3month;
        }

        public void setContact_count_passive_3month(String contact_count_passive_3month) {
            this.contact_count_passive_3month = contact_count_passive_3month;
        }

        public String getCall_count_passive_3month() {
            return call_count_passive_3month;
        }

        public void setCall_count_passive_3month(String call_count_passive_3month) {
            this.call_count_passive_3month = call_count_passive_3month;
        }

        public String getCall_time_work_time_3month() {
            return call_time_work_time_3month;
        }

        public void setCall_time_work_time_3month(String call_time_work_time_3month) {
            this.call_time_work_time_3month = call_time_work_time_3month;
        }

        public String getContact_count_3month() {
            return contact_count_3month;
        }

        public void setContact_count_3month(String contact_count_3month) {
            this.contact_count_3month = contact_count_3month;
        }

        public String getContact_area_seq_no() {
            return contact_area_seq_no;
        }

        public void setContact_area_seq_no(String contact_area_seq_no) {
            this.contact_area_seq_no = contact_area_seq_no;
        }

        public String getContact_count_6month() {
            return contact_count_6month;
        }

        public void setContact_count_6month(String contact_count_6month) {
            this.contact_count_6month = contact_count_6month;
        }
    }

    public static class CarrierConsumptionStatsPerMonthBean {
        /**
         * consume_amount : 7420
         * recharge_amount : 5000
         * month : 2017-11
         * recharge_count : 1
         */

        private String consume_amount;
        private String recharge_amount;
        private String month;
        private String recharge_count;

        public String getConsume_amount() {
            return consume_amount;
        }

        public void setConsume_amount(String consume_amount) {
            this.consume_amount = consume_amount;
        }

        public String getRecharge_amount() {
            return recharge_amount;
        }

        public void setRecharge_amount(String recharge_amount) {
            this.recharge_amount = recharge_amount;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getRecharge_count() {
            return recharge_count;
        }

        public void setRecharge_count(String recharge_count) {
            this.recharge_count = recharge_count;
        }
    }

    public static class FinanceContactStatsBean {
        /**
         * call_count_3month : 4
         * contact_count_1month : 0
         * call_count_6month : 4
         * call_count_active_6month : 4
         * call_time_3month : 316
         * msg_count_3month : 0
         * call_time_1month : 0
         * call_time_passive_6month : 0
         * call_count_active_3month : 4
         * call_time_6month : 316
         * contact_type : 投资理财
         * call_count_1month : 0
         * call_count_passive_6month : 0
         * call_time_active_6month : 316
         * call_time_passive_3month : 0
         * msg_count_6month : 0
         * contact_count_3month : 1
         * contact_count_6month : 1
         * msg_count_1month : 0
         * call_time_active_3month : 316
         * call_count_passive_3month : 0
         */

        private String call_count_3month;
        private String contact_count_1month;
        private String call_count_6month;
        private String call_count_active_6month;
        private String call_time_3month;
        private String msg_count_3month;
        private String call_time_1month;
        private String call_time_passive_6month;
        private String call_count_active_3month;
        private String call_time_6month;
        private String contact_type;
        private String call_count_1month;
        private String call_count_passive_6month;
        private String call_time_active_6month;
        private String call_time_passive_3month;
        private String msg_count_6month;
        private String contact_count_3month;
        private String contact_count_6month;
        private String msg_count_1month;
        private String call_time_active_3month;
        private String call_count_passive_3month;

        public String getCall_count_3month() {
            return call_count_3month;
        }

        public void setCall_count_3month(String call_count_3month) {
            this.call_count_3month = call_count_3month;
        }

        public String getContact_count_1month() {
            return contact_count_1month;
        }

        public void setContact_count_1month(String contact_count_1month) {
            this.contact_count_1month = contact_count_1month;
        }

        public String getCall_count_6month() {
            return call_count_6month;
        }

        public void setCall_count_6month(String call_count_6month) {
            this.call_count_6month = call_count_6month;
        }

        public String getCall_count_active_6month() {
            return call_count_active_6month;
        }

        public void setCall_count_active_6month(String call_count_active_6month) {
            this.call_count_active_6month = call_count_active_6month;
        }

        public String getCall_time_3month() {
            return call_time_3month;
        }

        public void setCall_time_3month(String call_time_3month) {
            this.call_time_3month = call_time_3month;
        }

        public String getMsg_count_3month() {
            return msg_count_3month;
        }

        public void setMsg_count_3month(String msg_count_3month) {
            this.msg_count_3month = msg_count_3month;
        }

        public String getCall_time_1month() {
            return call_time_1month;
        }

        public void setCall_time_1month(String call_time_1month) {
            this.call_time_1month = call_time_1month;
        }

        public String getCall_time_passive_6month() {
            return call_time_passive_6month;
        }

        public void setCall_time_passive_6month(String call_time_passive_6month) {
            this.call_time_passive_6month = call_time_passive_6month;
        }

        public String getCall_count_active_3month() {
            return call_count_active_3month;
        }

        public void setCall_count_active_3month(String call_count_active_3month) {
            this.call_count_active_3month = call_count_active_3month;
        }

        public String getCall_time_6month() {
            return call_time_6month;
        }

        public void setCall_time_6month(String call_time_6month) {
            this.call_time_6month = call_time_6month;
        }

        public String getContact_type() {
            return contact_type;
        }

        public void setContact_type(String contact_type) {
            this.contact_type = contact_type;
        }

        public String getCall_count_1month() {
            return call_count_1month;
        }

        public void setCall_count_1month(String call_count_1month) {
            this.call_count_1month = call_count_1month;
        }

        public String getCall_count_passive_6month() {
            return call_count_passive_6month;
        }

        public void setCall_count_passive_6month(String call_count_passive_6month) {
            this.call_count_passive_6month = call_count_passive_6month;
        }

        public String getCall_time_active_6month() {
            return call_time_active_6month;
        }

        public void setCall_time_active_6month(String call_time_active_6month) {
            this.call_time_active_6month = call_time_active_6month;
        }

        public String getCall_time_passive_3month() {
            return call_time_passive_3month;
        }

        public void setCall_time_passive_3month(String call_time_passive_3month) {
            this.call_time_passive_3month = call_time_passive_3month;
        }

        public String getMsg_count_6month() {
            return msg_count_6month;
        }

        public void setMsg_count_6month(String msg_count_6month) {
            this.msg_count_6month = msg_count_6month;
        }

        public String getContact_count_3month() {
            return contact_count_3month;
        }

        public void setContact_count_3month(String contact_count_3month) {
            this.contact_count_3month = contact_count_3month;
        }

        public String getContact_count_6month() {
            return contact_count_6month;
        }

        public void setContact_count_6month(String contact_count_6month) {
            this.contact_count_6month = contact_count_6month;
        }

        public String getMsg_count_1month() {
            return msg_count_1month;
        }

        public void setMsg_count_1month(String msg_count_1month) {
            this.msg_count_1month = msg_count_1month;
        }

        public String getCall_time_active_3month() {
            return call_time_active_3month;
        }

        public void setCall_time_active_3month(String call_time_active_3month) {
            this.call_time_active_3month = call_time_active_3month;
        }

        public String getCall_count_passive_3month() {
            return call_count_passive_3month;
        }

        public void setCall_count_passive_3month(String call_count_passive_3month) {
            this.call_count_passive_3month = call_count_passive_3month;
        }
    }

    public static class AllContactDetailBean {
        /**
         * call_count_holiday_3month : 14
         * call_count_holiday_6month : 27
         * contact_attribute : 手机号码
         * call_count_active_6month : 28
         * call_time_3month : 11402
         * msg_count_3month : 0
         * call_time_passive_6month : 2517
         * call_time_1month : 2899
         * call_count_active_3month : 15
         * call_time_6month : 18866
         * contact_type : null
         * call_count_late_night_3month : 0
         * call_count_late_night_6month : 0
         * call_count_passive_6month : 11
         * call_time_active_6month : 16349
         * call_time_work_time_6month : 8098
         * msg_count_6month : 0
         * call_count_work_time_6month : 19
         * call_time_late_night_3month : 0
         * first_time_call_6month : 2017-07-03 19:50:36
         * call_time_active_3month : 10011
         * call_time_late_night_6month : 0
         * call_count_passive_3month : 8
         * call_count_3month : 23
         * contact_name : null
         * contact_relation : null
         * call_count_work_time_3month : 11
         * call_count_workday_3month : 9
         * call_count_6month : 39
         * is_virtual_number : 否
         * call_count_offwork_time_3month : 12
         * call_time_offwork_time_6month : 10768
         * call_count_offwork_time_6month : 20
         * call_time_work_time_3month : 4492
         * call_time_offwork_time_3month : 6910
         * average_gap_day_call_6month : 5.68
         * contact_number : 15959433160
         * contact_area : 福建省.莆田市
         * call_count_1week : 1
         * contact_seq_no : 1
         * is_whole_day_call_3month : 否
         * max_gap_day_call_6month : 14
         * call_count_1month : 5
         * call_time_passive_3month : 1391
         * is_whole_day_call_6month : 否
         * call_count_workday_6month : 12
         * last_time_call_6month : 2017-12-09 10:03:56
         * msg_count_1month : 0
         */

//        private String call_count_holiday_3month;
//        private String call_count_holiday_6month;
//        private String contact_attribute;
//        private String call_count_active_6month;
//        private String call_time_3month;
//        private String msg_count_3month;
//        private String call_time_passive_6month;
//        private String call_time_1month;
//        private String call_count_active_3month;
//        private String call_time_6month;
//        private String contact_type;
//        private String call_count_late_night_3month;
//        private String call_count_late_night_6month;
//        private String call_count_passive_6month;
//        private String call_time_active_6month;
//        private String call_time_work_time_6month;
//        private String msg_count_6month;
//        private String call_count_work_time_6month;
//        private String call_time_late_night_3month;
//        private String first_time_call_6month;
//        private String call_time_active_3month;
//        private String call_time_late_night_6month;
//        private String call_count_passive_3month;
//        private String call_count_3month;
//        private String contact_name;
//        private String contact_relation;
//        private String call_count_work_time_3month;
//        private String call_count_workday_3month;
//        private String call_count_6month;
//        private String is_virtual_number;
//        private String call_count_offwork_time_3month;
//        private String call_time_offwork_time_6month;
//        private String call_count_offwork_time_6month;
//        private String call_time_work_time_3month;
//        private String call_time_offwork_time_3month;
//        private String average_gap_day_call_6month;
        private String contact_number;
//        private String contact_area;
//        private String call_count_1week;
//        private String contact_seq_no;
//        private String is_whole_day_call_3month;
//        private String max_gap_day_call_6month;
//        private String call_count_1month;
//        private String call_time_passive_3month;
//        private String is_whole_day_call_6month;
//        private String call_count_workday_6month;
//        private String last_time_call_6month;
//        private String msg_count_1month;

        //        public String getCall_count_holiday_3month() {
//            return call_count_holiday_3month;
//        }
//
//        public void setCall_count_holiday_3month(String call_count_holiday_3month) {
//            this.call_count_holiday_3month = call_count_holiday_3month;
//        }
//
//        public String getCall_count_holiday_6month() {
//            return call_count_holiday_6month;
//        }
//
//        public void setCall_count_holiday_6month(String call_count_holiday_6month) {
//            this.call_count_holiday_6month = call_count_holiday_6month;
//        }
//
//        public String getContact_attribute() {
//            return contact_attribute;
//        }
//
//        public void setContact_attribute(String contact_attribute) {
//            this.contact_attribute = contact_attribute;
//        }
//
//        public String getCall_count_active_6month() {
//            return call_count_active_6month;
//        }
//
//        public void setCall_count_active_6month(String call_count_active_6month) {
//            this.call_count_active_6month = call_count_active_6month;
//        }
//
//        public String getCall_time_3month() {
//            return call_time_3month;
//        }
//
//        public void setCall_time_3month(String call_time_3month) {
//            this.call_time_3month = call_time_3month;
//        }
//
//        public String getMsg_count_3month() {
//            return msg_count_3month;
//        }
//
//        public void setMsg_count_3month(String msg_count_3month) {
//            this.msg_count_3month = msg_count_3month;
//        }
//
//        public String getCall_time_passive_6month() {
//            return call_time_passive_6month;
//        }
//
//        public void setCall_time_passive_6month(String call_time_passive_6month) {
//            this.call_time_passive_6month = call_time_passive_6month;
//        }
//
//        public String getCall_time_1month() {
//            return call_time_1month;
//        }
//
//        public void setCall_time_1month(String call_time_1month) {
//            this.call_time_1month = call_time_1month;
//        }
//
//        public String getCall_count_active_3month() {
//            return call_count_active_3month;
//        }
//
//        public void setCall_count_active_3month(String call_count_active_3month) {
//            this.call_count_active_3month = call_count_active_3month;
//        }
//
//        public String getCall_time_6month() {
//            return call_time_6month;
//        }
//
//        public void setCall_time_6month(String call_time_6month) {
//            this.call_time_6month = call_time_6month;
//        }
//
//        public Object getContact_type() {
//            return contact_type;
//        }
//
//
//        public String getCall_count_late_night_3month() {
//            return call_count_late_night_3month;
//        }
//
//        public void setCall_count_late_night_3month(String call_count_late_night_3month) {
//            this.call_count_late_night_3month = call_count_late_night_3month;
//        }
//
//        public String getCall_count_late_night_6month() {
//            return call_count_late_night_6month;
//        }
//
//        public void setCall_count_late_night_6month(String call_count_late_night_6month) {
//            this.call_count_late_night_6month = call_count_late_night_6month;
//        }
//
//        public String getCall_count_passive_6month() {
//            return call_count_passive_6month;
//        }
//
//        public void setCall_count_passive_6month(String call_count_passive_6month) {
//            this.call_count_passive_6month = call_count_passive_6month;
//        }
//
//        public String getCall_time_active_6month() {
//            return call_time_active_6month;
//        }
//
//        public void setCall_time_active_6month(String call_time_active_6month) {
//            this.call_time_active_6month = call_time_active_6month;
//        }
//
//        public String getCall_time_work_time_6month() {
//            return call_time_work_time_6month;
//        }
//
//        public void setCall_time_work_time_6month(String call_time_work_time_6month) {
//            this.call_time_work_time_6month = call_time_work_time_6month;
//        }
//
//        public String getMsg_count_6month() {
//            return msg_count_6month;
//        }
//
//        public void setMsg_count_6month(String msg_count_6month) {
//            this.msg_count_6month = msg_count_6month;
//        }
//
//        public String getCall_count_work_time_6month() {
//            return call_count_work_time_6month;
//        }
//
//        public void setCall_count_work_time_6month(String call_count_work_time_6month) {
//            this.call_count_work_time_6month = call_count_work_time_6month;
//        }
//
//        public String getCall_time_late_night_3month() {
//            return call_time_late_night_3month;
//        }
//
//        public void setCall_time_late_night_3month(String call_time_late_night_3month) {
//            this.call_time_late_night_3month = call_time_late_night_3month;
//        }
//
//        public String getFirst_time_call_6month() {
//            return first_time_call_6month;
//        }
//
//        public void setFirst_time_call_6month(String first_time_call_6month) {
//            this.first_time_call_6month = first_time_call_6month;
//        }
//
//        public String getCall_time_active_3month() {
//            return call_time_active_3month;
//        }
//
//        public void setCall_time_active_3month(String call_time_active_3month) {
//            this.call_time_active_3month = call_time_active_3month;
//        }
//
//        public String getCall_time_late_night_6month() {
//            return call_time_late_night_6month;
//        }
//
//        public void setCall_time_late_night_6month(String call_time_late_night_6month) {
//            this.call_time_late_night_6month = call_time_late_night_6month;
//        }
//
//        public String getCall_count_passive_3month() {
//            return call_count_passive_3month;
//        }
//
//        public void setCall_count_passive_3month(String call_count_passive_3month) {
//            this.call_count_passive_3month = call_count_passive_3month;
//        }
//
//        public String getCall_count_3month() {
//            return call_count_3month;
//        }
//
//        public void setCall_count_3month(String call_count_3month) {
//            this.call_count_3month = call_count_3month;
//        }
//
//        public Object getContact_name() {
//            return contact_name;
//        }
//
//        public void setContact_type(String contact_type) {
//            this.contact_type = contact_type;
//        }
//
//        public void setContact_name(String contact_name) {
//            this.contact_name = contact_name;
//        }
//
//        public void setContact_relation(String contact_relation) {
//            this.contact_relation = contact_relation;
//        }
//
//        public Object getContact_relation() {
//            return contact_relation;
//        }
//
//
//        public String getCall_count_work_time_3month() {
//            return call_count_work_time_3month;
//        }
//
//        public void setCall_count_work_time_3month(String call_count_work_time_3month) {
//            this.call_count_work_time_3month = call_count_work_time_3month;
//        }
//
//        public String getCall_count_workday_3month() {
//            return call_count_workday_3month;
//        }
//
//        public void setCall_count_workday_3month(String call_count_workday_3month) {
//            this.call_count_workday_3month = call_count_workday_3month;
//        }
//
//        public String getCall_count_6month() {
//            return call_count_6month;
//        }
//
//        public void setCall_count_6month(String call_count_6month) {
//            this.call_count_6month = call_count_6month;
//        }
//
//        public String getIs_virtual_number() {
//            return is_virtual_number;
//        }
//
//        public void setIs_virtual_number(String is_virtual_number) {
//            this.is_virtual_number = is_virtual_number;
//        }
//
//        public String getCall_count_offwork_time_3month() {
//            return call_count_offwork_time_3month;
//        }
//
//        public void setCall_count_offwork_time_3month(String call_count_offwork_time_3month) {
//            this.call_count_offwork_time_3month = call_count_offwork_time_3month;
//        }
//
//        public String getCall_time_offwork_time_6month() {
//            return call_time_offwork_time_6month;
//        }
//
//        public void setCall_time_offwork_time_6month(String call_time_offwork_time_6month) {
//            this.call_time_offwork_time_6month = call_time_offwork_time_6month;
//        }
//
//        public String getCall_count_offwork_time_6month() {
//            return call_count_offwork_time_6month;
//        }
//
//        public void setCall_count_offwork_time_6month(String call_count_offwork_time_6month) {
//            this.call_count_offwork_time_6month = call_count_offwork_time_6month;
//        }
//
//        public String getCall_time_work_time_3month() {
//            return call_time_work_time_3month;
//        }
//
//        public void setCall_time_work_time_3month(String call_time_work_time_3month) {
//            this.call_time_work_time_3month = call_time_work_time_3month;
//        }
//
//        public String getCall_time_offwork_time_3month() {
//            return call_time_offwork_time_3month;
//        }
//
//        public void setCall_time_offwork_time_3month(String call_time_offwork_time_3month) {
//            this.call_time_offwork_time_3month = call_time_offwork_time_3month;
//        }
//
//        public String getAverage_gap_day_call_6month() {
//            return average_gap_day_call_6month;
//        }
//
//        public void setAverage_gap_day_call_6month(String average_gap_day_call_6month) {
//            this.average_gap_day_call_6month = average_gap_day_call_6month;
//        }
//
        public String getContact_number() {
            return contact_number;
        }

        public void setContact_number(String contact_number) {
            this.contact_number = contact_number;
        }
//
//        public String getContact_area() {
//            return contact_area;
//        }
//
//        public void setContact_area(String contact_area) {
//            this.contact_area = contact_area;
//        }
//
//        public String getCall_count_1week() {
//            return call_count_1week;
//        }
//
//        public void setCall_count_1week(String call_count_1week) {
//            this.call_count_1week = call_count_1week;
//        }
//
//        public String getContact_seq_no() {
//            return contact_seq_no;
//        }
//
//        public void setContact_seq_no(String contact_seq_no) {
//            this.contact_seq_no = contact_seq_no;
//        }
//
//        public String getIs_whole_day_call_3month() {
//            return is_whole_day_call_3month;
//        }
//
//        public void setIs_whole_day_call_3month(String is_whole_day_call_3month) {
//            this.is_whole_day_call_3month = is_whole_day_call_3month;
//        }
//
//        public String getMax_gap_day_call_6month() {
//            return max_gap_day_call_6month;
//        }
//
//        public void setMax_gap_day_call_6month(String max_gap_day_call_6month) {
//            this.max_gap_day_call_6month = max_gap_day_call_6month;
//        }
//
//        public String getCall_count_1month() {
//            return call_count_1month;
//        }
//
//        public void setCall_count_1month(String call_count_1month) {
//            this.call_count_1month = call_count_1month;
//        }
//
//        public String getCall_time_passive_3month() {
//            return call_time_passive_3month;
//        }
//
//        public void setCall_time_passive_3month(String call_time_passive_3month) {
//            this.call_time_passive_3month = call_time_passive_3month;
//        }
//
//        public String getIs_whole_day_call_6month() {
//            return is_whole_day_call_6month;
//        }
//
//        public void setIs_whole_day_call_6month(String is_whole_day_call_6month) {
//            this.is_whole_day_call_6month = is_whole_day_call_6month;
//        }
//
//        public String getCall_count_workday_6month() {
//            return call_count_workday_6month;
//        }
//
//        public void setCall_count_workday_6month(String call_count_workday_6month) {
//            this.call_count_workday_6month = call_count_workday_6month;
//        }
//
//        public String getLast_time_call_6month() {
//            return last_time_call_6month;
//        }
//
//        public void setLast_time_call_6month(String last_time_call_6month) {
//            this.last_time_call_6month = last_time_call_6month;
//        }
//
//        public String getMsg_count_1month() {
//            return msg_count_1month;
//        }
//
//        public void setMsg_count_1month(String msg_count_1month) {
//            this.msg_count_1month = msg_count_1month;
//        }
    }

    public static class AllContactStatsPerMonthBean {
        /**
         * call_count_active : 14
         * call_count_passive : 19
         * call_time_offwork_time : 5638
         * contact_count : 22
         * call_time : 13467
         * call_count_call_time_1min5min : 4
         * contact_count_call_count_over10 : 0
         * call_time_work_time : 7829
         * contact_count_active : 9
         * call_count_call_time_less1min : 17
         * call_count_call_time_over10min : 7
         * call_count_offwork_time : 16
         * call_time_late_night : 0
         * call_count_work_time : 17
         * contact_count_mutual : 4
         * month : 2017-12
         * call_time_passive : 5204
         * call_count_late_night : 0
         * call_count : 33
         * call_count_call_time_5min10min : 5
         * call_time_active : 8263
         * contact_count_passive : 17
         * msg_count : 0
         */

        private String call_count_active;
        private String call_count_passive;
        private String call_time_offwork_time;
        private String contact_count;
        private String call_time;
        private String call_count_call_time_1min5min;
        private String contact_count_call_count_over10;
        private String call_time_work_time;
        private String contact_count_active;
        private String call_count_call_time_less1min;
        private String call_count_call_time_over10min;
        private String call_count_offwork_time;
        private String call_time_late_night;
        private String call_count_work_time;
        private String contact_count_mutual;
        private String month;
        private String call_time_passive;
        private String call_count_late_night;
        private String call_count;
        private String call_count_call_time_5min10min;
        private String call_time_active;
        private String contact_count_passive;
        private String msg_count;

        public String getCall_count_active() {
            return call_count_active;
        }

        public void setCall_count_active(String call_count_active) {
            this.call_count_active = call_count_active;
        }

        public String getCall_count_passive() {
            return call_count_passive;
        }

        public void setCall_count_passive(String call_count_passive) {
            this.call_count_passive = call_count_passive;
        }

        public String getCall_time_offwork_time() {
            return call_time_offwork_time;
        }

        public void setCall_time_offwork_time(String call_time_offwork_time) {
            this.call_time_offwork_time = call_time_offwork_time;
        }

        public String getContact_count() {
            return contact_count;
        }

        public void setContact_count(String contact_count) {
            this.contact_count = contact_count;
        }

        public String getCall_time() {
            return call_time;
        }

        public void setCall_time(String call_time) {
            this.call_time = call_time;
        }

        public String getCall_count_call_time_1min5min() {
            return call_count_call_time_1min5min;
        }

        public void setCall_count_call_time_1min5min(String call_count_call_time_1min5min) {
            this.call_count_call_time_1min5min = call_count_call_time_1min5min;
        }

        public String getContact_count_call_count_over10() {
            return contact_count_call_count_over10;
        }

        public void setContact_count_call_count_over10(String contact_count_call_count_over10) {
            this.contact_count_call_count_over10 = contact_count_call_count_over10;
        }

        public String getCall_time_work_time() {
            return call_time_work_time;
        }

        public void setCall_time_work_time(String call_time_work_time) {
            this.call_time_work_time = call_time_work_time;
        }

        public String getContact_count_active() {
            return contact_count_active;
        }

        public void setContact_count_active(String contact_count_active) {
            this.contact_count_active = contact_count_active;
        }

        public String getCall_count_call_time_less1min() {
            return call_count_call_time_less1min;
        }

        public void setCall_count_call_time_less1min(String call_count_call_time_less1min) {
            this.call_count_call_time_less1min = call_count_call_time_less1min;
        }

        public String getCall_count_call_time_over10min() {
            return call_count_call_time_over10min;
        }

        public void setCall_count_call_time_over10min(String call_count_call_time_over10min) {
            this.call_count_call_time_over10min = call_count_call_time_over10min;
        }

        public String getCall_count_offwork_time() {
            return call_count_offwork_time;
        }

        public void setCall_count_offwork_time(String call_count_offwork_time) {
            this.call_count_offwork_time = call_count_offwork_time;
        }

        public String getCall_time_late_night() {
            return call_time_late_night;
        }

        public void setCall_time_late_night(String call_time_late_night) {
            this.call_time_late_night = call_time_late_night;
        }

        public String getCall_count_work_time() {
            return call_count_work_time;
        }

        public void setCall_count_work_time(String call_count_work_time) {
            this.call_count_work_time = call_count_work_time;
        }

        public String getContact_count_mutual() {
            return contact_count_mutual;
        }

        public void setContact_count_mutual(String contact_count_mutual) {
            this.contact_count_mutual = contact_count_mutual;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getCall_time_passive() {
            return call_time_passive;
        }

        public void setCall_time_passive(String call_time_passive) {
            this.call_time_passive = call_time_passive;
        }

        public String getCall_count_late_night() {
            return call_count_late_night;
        }

        public void setCall_count_late_night(String call_count_late_night) {
            this.call_count_late_night = call_count_late_night;
        }

        public String getCall_count() {
            return call_count;
        }

        public void setCall_count(String call_count) {
            this.call_count = call_count;
        }

        public String getCall_count_call_time_5min10min() {
            return call_count_call_time_5min10min;
        }

        public void setCall_count_call_time_5min10min(String call_count_call_time_5min10min) {
            this.call_count_call_time_5min10min = call_count_call_time_5min10min;
        }

        public String getCall_time_active() {
            return call_time_active;
        }

        public void setCall_time_active(String call_time_active) {
            this.call_time_active = call_time_active;
        }

        public String getContact_count_passive() {
            return contact_count_passive;
        }

        public void setContact_count_passive(String contact_count_passive) {
            this.contact_count_passive = contact_count_passive;
        }

        public String getMsg_count() {
            return msg_count;
        }

        public void setMsg_count(String msg_count) {
            this.msg_count = msg_count;
        }
    }

    public static class FinanceContactDetailBean {
        /**
         * call_count_holiday_3month : 1
         * call_count_holiday_6month : 1
         * contact_attribute : 其他号码
         * call_count_active_6month : 3
         * call_time_3month : 321
         * msg_count_3month : 0
         * call_time_passive_6month : 0
         * call_time_1month : 0
         * call_count_active_3month : 1
         * call_time_6month : 473
         * contact_type : 银行
         * call_count_late_night_3month : 0
         * call_count_late_night_6month : 0
         * call_count_passive_6month : 0
         * call_time_active_6month : 473
         * call_time_work_time_6month : 473
         * msg_count_6month : 0
         * call_count_work_time_6month : 3
         * call_time_late_night_3month : 0
         * first_time_call_6month : 2017-08-14 08:28:23
         * call_time_active_3month : 321
         * call_time_late_night_6month : 0
         * call_count_passive_3month : 0
         * call_count_3month : 1
         * contact_name : 农业银行
         * contact_relation : null
         * call_count_work_time_3month : 1
         * call_count_workday_3month : 0
         * call_count_6month : 3
         * call_count_offwork_time_3month : 0
         * is_virtual_number : 否
         * call_time_offwork_time_6month : 0
         * call_count_offwork_time_6month : 0
         * call_time_work_time_3month : 321
         * call_time_offwork_time_3month : 0
         * average_gap_day_call_6month : 34.00
         * contact_number : 95599
         * contact_area : null
         * call_count_1week : 0
         * contact_seq_no : 41
         * is_whole_day_call_3month : 否
         * max_gap_day_call_6month : 34
         * call_count_1month : 0
         * call_time_passive_3month : 0
         * is_whole_day_call_6month : 否
         * call_count_workday_6month : 2
         * last_time_call_6month : 2017-09-17 10:10:24
         * msg_count_1month : 0
         */

        private String call_count_holiday_3month;
        private String call_count_holiday_6month;
        private String contact_attribute;
        private String call_count_active_6month;
        private String call_time_3month;
        private String msg_count_3month;
        private String call_time_passive_6month;
        private String call_time_1month;
        private String call_count_active_3month;
        private String call_time_6month;
        private String contact_type;
        private String call_count_late_night_3month;
        private String call_count_late_night_6month;
        private String call_count_passive_6month;
        private String call_time_active_6month;
        private String call_time_work_time_6month;
        private String msg_count_6month;
        private String call_count_work_time_6month;
        private String call_time_late_night_3month;
        private String first_time_call_6month;
        private String call_time_active_3month;
        private String call_time_late_night_6month;
        private String call_count_passive_3month;
        private String call_count_3month;
        private String contact_name;
        private Object contact_relation;
        private String call_count_work_time_3month;
        private String call_count_workday_3month;
        private String call_count_6month;
        private String call_count_offwork_time_3month;
        private String is_virtual_number;
        private String call_time_offwork_time_6month;
        private String call_count_offwork_time_6month;
        private String call_time_work_time_3month;
        private String call_time_offwork_time_3month;
        private String average_gap_day_call_6month;
        private String contact_number;
        private Object contact_area;
        private String call_count_1week;
        private String contact_seq_no;
        private String is_whole_day_call_3month;
        private String max_gap_day_call_6month;
        private String call_count_1month;
        private String call_time_passive_3month;
        private String is_whole_day_call_6month;
        private String call_count_workday_6month;
        private String last_time_call_6month;
        private String msg_count_1month;

        public String getCall_count_holiday_3month() {
            return call_count_holiday_3month;
        }

        public void setCall_count_holiday_3month(String call_count_holiday_3month) {
            this.call_count_holiday_3month = call_count_holiday_3month;
        }

        public String getCall_count_holiday_6month() {
            return call_count_holiday_6month;
        }

        public void setCall_count_holiday_6month(String call_count_holiday_6month) {
            this.call_count_holiday_6month = call_count_holiday_6month;
        }

        public String getContact_attribute() {
            return contact_attribute;
        }

        public void setContact_attribute(String contact_attribute) {
            this.contact_attribute = contact_attribute;
        }

        public String getCall_count_active_6month() {
            return call_count_active_6month;
        }

        public void setCall_count_active_6month(String call_count_active_6month) {
            this.call_count_active_6month = call_count_active_6month;
        }

        public String getCall_time_3month() {
            return call_time_3month;
        }

        public void setCall_time_3month(String call_time_3month) {
            this.call_time_3month = call_time_3month;
        }

        public String getMsg_count_3month() {
            return msg_count_3month;
        }

        public void setMsg_count_3month(String msg_count_3month) {
            this.msg_count_3month = msg_count_3month;
        }

        public String getCall_time_passive_6month() {
            return call_time_passive_6month;
        }

        public void setCall_time_passive_6month(String call_time_passive_6month) {
            this.call_time_passive_6month = call_time_passive_6month;
        }

        public String getCall_time_1month() {
            return call_time_1month;
        }

        public void setCall_time_1month(String call_time_1month) {
            this.call_time_1month = call_time_1month;
        }

        public String getCall_count_active_3month() {
            return call_count_active_3month;
        }

        public void setCall_count_active_3month(String call_count_active_3month) {
            this.call_count_active_3month = call_count_active_3month;
        }

        public String getCall_time_6month() {
            return call_time_6month;
        }

        public void setCall_time_6month(String call_time_6month) {
            this.call_time_6month = call_time_6month;
        }

        public String getContact_type() {
            return contact_type;
        }

        public void setContact_type(String contact_type) {
            this.contact_type = contact_type;
        }

        public String getCall_count_late_night_3month() {
            return call_count_late_night_3month;
        }

        public void setCall_count_late_night_3month(String call_count_late_night_3month) {
            this.call_count_late_night_3month = call_count_late_night_3month;
        }

        public String getCall_count_late_night_6month() {
            return call_count_late_night_6month;
        }

        public void setCall_count_late_night_6month(String call_count_late_night_6month) {
            this.call_count_late_night_6month = call_count_late_night_6month;
        }

        public String getCall_count_passive_6month() {
            return call_count_passive_6month;
        }

        public void setCall_count_passive_6month(String call_count_passive_6month) {
            this.call_count_passive_6month = call_count_passive_6month;
        }

        public String getCall_time_active_6month() {
            return call_time_active_6month;
        }

        public void setCall_time_active_6month(String call_time_active_6month) {
            this.call_time_active_6month = call_time_active_6month;
        }

        public String getCall_time_work_time_6month() {
            return call_time_work_time_6month;
        }

        public void setCall_time_work_time_6month(String call_time_work_time_6month) {
            this.call_time_work_time_6month = call_time_work_time_6month;
        }

        public String getMsg_count_6month() {
            return msg_count_6month;
        }

        public void setMsg_count_6month(String msg_count_6month) {
            this.msg_count_6month = msg_count_6month;
        }

        public String getCall_count_work_time_6month() {
            return call_count_work_time_6month;
        }

        public void setCall_count_work_time_6month(String call_count_work_time_6month) {
            this.call_count_work_time_6month = call_count_work_time_6month;
        }

        public String getCall_time_late_night_3month() {
            return call_time_late_night_3month;
        }

        public void setCall_time_late_night_3month(String call_time_late_night_3month) {
            this.call_time_late_night_3month = call_time_late_night_3month;
        }

        public String getFirst_time_call_6month() {
            return first_time_call_6month;
        }

        public void setFirst_time_call_6month(String first_time_call_6month) {
            this.first_time_call_6month = first_time_call_6month;
        }

        public String getCall_time_active_3month() {
            return call_time_active_3month;
        }

        public void setCall_time_active_3month(String call_time_active_3month) {
            this.call_time_active_3month = call_time_active_3month;
        }

        public String getCall_time_late_night_6month() {
            return call_time_late_night_6month;
        }

        public void setCall_time_late_night_6month(String call_time_late_night_6month) {
            this.call_time_late_night_6month = call_time_late_night_6month;
        }

        public String getCall_count_passive_3month() {
            return call_count_passive_3month;
        }

        public void setCall_count_passive_3month(String call_count_passive_3month) {
            this.call_count_passive_3month = call_count_passive_3month;
        }

        public String getCall_count_3month() {
            return call_count_3month;
        }

        public void setCall_count_3month(String call_count_3month) {
            this.call_count_3month = call_count_3month;
        }

        public String getContact_name() {
            return contact_name;
        }

        public void setContact_name(String contact_name) {
            this.contact_name = contact_name;
        }

        public Object getContact_relation() {
            return contact_relation;
        }

        public void setContact_relation(Object contact_relation) {
            this.contact_relation = contact_relation;
        }

        public String getCall_count_work_time_3month() {
            return call_count_work_time_3month;
        }

        public void setCall_count_work_time_3month(String call_count_work_time_3month) {
            this.call_count_work_time_3month = call_count_work_time_3month;
        }

        public String getCall_count_workday_3month() {
            return call_count_workday_3month;
        }

        public void setCall_count_workday_3month(String call_count_workday_3month) {
            this.call_count_workday_3month = call_count_workday_3month;
        }

        public String getCall_count_6month() {
            return call_count_6month;
        }

        public void setCall_count_6month(String call_count_6month) {
            this.call_count_6month = call_count_6month;
        }

        public String getCall_count_offwork_time_3month() {
            return call_count_offwork_time_3month;
        }

        public void setCall_count_offwork_time_3month(String call_count_offwork_time_3month) {
            this.call_count_offwork_time_3month = call_count_offwork_time_3month;
        }

        public String getIs_virtual_number() {
            return is_virtual_number;
        }

        public void setIs_virtual_number(String is_virtual_number) {
            this.is_virtual_number = is_virtual_number;
        }

        public String getCall_time_offwork_time_6month() {
            return call_time_offwork_time_6month;
        }

        public void setCall_time_offwork_time_6month(String call_time_offwork_time_6month) {
            this.call_time_offwork_time_6month = call_time_offwork_time_6month;
        }

        public String getCall_count_offwork_time_6month() {
            return call_count_offwork_time_6month;
        }

        public void setCall_count_offwork_time_6month(String call_count_offwork_time_6month) {
            this.call_count_offwork_time_6month = call_count_offwork_time_6month;
        }

        public String getCall_time_work_time_3month() {
            return call_time_work_time_3month;
        }

        public void setCall_time_work_time_3month(String call_time_work_time_3month) {
            this.call_time_work_time_3month = call_time_work_time_3month;
        }

        public String getCall_time_offwork_time_3month() {
            return call_time_offwork_time_3month;
        }

        public void setCall_time_offwork_time_3month(String call_time_offwork_time_3month) {
            this.call_time_offwork_time_3month = call_time_offwork_time_3month;
        }

        public String getAverage_gap_day_call_6month() {
            return average_gap_day_call_6month;
        }

        public void setAverage_gap_day_call_6month(String average_gap_day_call_6month) {
            this.average_gap_day_call_6month = average_gap_day_call_6month;
        }

        public String getContact_number() {
            return contact_number;
        }

        public void setContact_number(String contact_number) {
            this.contact_number = contact_number;
        }

        public Object getContact_area() {
            return contact_area;
        }

        public void setContact_area(Object contact_area) {
            this.contact_area = contact_area;
        }

        public String getCall_count_1week() {
            return call_count_1week;
        }

        public void setCall_count_1week(String call_count_1week) {
            this.call_count_1week = call_count_1week;
        }

        public String getContact_seq_no() {
            return contact_seq_no;
        }

        public void setContact_seq_no(String contact_seq_no) {
            this.contact_seq_no = contact_seq_no;
        }

        public String getIs_whole_day_call_3month() {
            return is_whole_day_call_3month;
        }

        public void setIs_whole_day_call_3month(String is_whole_day_call_3month) {
            this.is_whole_day_call_3month = is_whole_day_call_3month;
        }

        public String getMax_gap_day_call_6month() {
            return max_gap_day_call_6month;
        }

        public void setMax_gap_day_call_6month(String max_gap_day_call_6month) {
            this.max_gap_day_call_6month = max_gap_day_call_6month;
        }

        public String getCall_count_1month() {
            return call_count_1month;
        }

        public void setCall_count_1month(String call_count_1month) {
            this.call_count_1month = call_count_1month;
        }

        public String getCall_time_passive_3month() {
            return call_time_passive_3month;
        }

        public void setCall_time_passive_3month(String call_time_passive_3month) {
            this.call_time_passive_3month = call_time_passive_3month;
        }

        public String getIs_whole_day_call_6month() {
            return is_whole_day_call_6month;
        }

        public void setIs_whole_day_call_6month(String is_whole_day_call_6month) {
            this.is_whole_day_call_6month = is_whole_day_call_6month;
        }

        public String getCall_count_workday_6month() {
            return call_count_workday_6month;
        }

        public void setCall_count_workday_6month(String call_count_workday_6month) {
            this.call_count_workday_6month = call_count_workday_6month;
        }

        public String getLast_time_call_6month() {
            return last_time_call_6month;
        }

        public void setLast_time_call_6month(String last_time_call_6month) {
            this.last_time_call_6month = last_time_call_6month;
        }

        public String getMsg_count_1month() {
            return msg_count_1month;
        }

        public void setMsg_count_1month(String msg_count_1month) {
            this.msg_count_1month = msg_count_1month;
        }
    }
}
