package security.practice.securityspring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 측정일시
    @Column(length = 100, nullable = false)
    private String MSRDT;

    // 권역명
    @Column(length = 20, nullable = false)
    private String MSRRGN_NM;

    // 측정소명
    @Column(length = 50, nullable = false)
    private String MSRSTE_NM;

    // 미세먼지
    @Column(length = 10, nullable = false)
    private String PM10;

    // 초미세먼지농도
    @Column(length = 10, nullable = false)
    private String PM25;

    // 오존(ppm)
    @Column(length = 10, nullable = false)
    private String O3;

    // 이산화질소농도
    @Column(length = 10, nullable = false)
    private String NO2;

    // 일산화탄소농도
    @Column(length = 10, nullable = false)
    private String CO;

    // 아황산가스농도
    @Column(length = 10, nullable = false)
    private String SO2;

    // 통합대기환경등급
    @Column(length = 10, nullable = false)
    private String IDEX_NM;

    // 통합대기환경지수
    @Column(length = 10, nullable = false)
    private String IDEX_MVL;

    // 지수결정물질
    @Column(length = 10, nullable = false)
    private String ARPLT_MAIN;

    // @Column(length = 100, nullable = false)
    // "PM25":"초미세먼지농도(㎍/㎥)","PM10":"미세먼지(㎍/㎥)","SO2":"아황산가스농도(ppm)","IDEX_MVL":"통합대기환경지수","NO2":"이산화질소농도(ppm)","IDEX_NM":"통합대기환경등급",
    // "MSRDT":"측정일시","MSRRGN_NM":"권역명","CO":"일산화탄소농도(ppm)","O3":"오존(ppm)","ARPLT_MAIN":"지수결정물질","MSRSTE_NM":"측정소명"

}
