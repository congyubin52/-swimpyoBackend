package com.btc.swimpyo.backend.mappers.reservation.user;

import com.btc.swimpyo.backend.dto.reservation.ReservationDto;
import com.btc.swimpyo.backend.dto.room.user.UserReviewDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserReservationDaoMapper {

    // Room 정보 가져오기
    public ReservationDto selectRoomInfo(ReservationDto reservationDto);

    // 예약 정보 db에 저장
    public int insertRsvInfo(ReservationDto reservationDto);

    // 예약 가능한 방만 찾기
    public int searchDate(ReservationDto reservationDto);
    public int searchTime(ReservationDto reservationDto);
    public int insertRsvInfoByMoment(ReservationDto reservationDto);

}