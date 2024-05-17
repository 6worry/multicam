package com.multi.erp.schedule;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDTO {
	private String scheduleId;//스케쥴번호
	private String scheduleUserId;//스케쥴등록 사용자
//	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date scheduleDay;//스케쥴날짜
	private String title;//스케쥴타이틀
	private String category;//스케쥴카테고리
	private String boss;//스케쥴참조할 상사
	private String place;//스케쥴장소
	private String content;//스케쥴간략내용
	private String state;//스케줄진행상황
}