package org.virtue.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.virtue.pojo.HotelInfo;
import org.virtue.pojo.Student;

public interface HotelInfoRepository extends JpaRepository<HotelInfo, Long> {
}
