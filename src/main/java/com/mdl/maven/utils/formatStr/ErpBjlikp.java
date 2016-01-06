package com.mdl.maven.utils.formatStr;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ErpBjlikp {
    private Integer id;

    private Integer mandt;

    private String vbeln;
    
    private String createTaskPackage;

    private String customWoodSum;

    private String ernam;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date erzet;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date erdat;

    private String vkorg;

    private String lfart;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lfdat;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date kodat;

    private String inco1;

    private String kunnr;

    private String kunag;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fkdat;

    private String knumv;

    private String waerk;

    private String zukrl;

    private String verur;

    private String aenam;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date aedat;

    private String knkli;

    private String lifex;

    private String ternr;

    private String knump;

    private BigDecimal netwr;

    private String aulwe;

    private String werks;

    private String lcnum;

    private String proli;

    private String handle;

    private String tsegfl;

    private String tsegtp;

    private String tzonis;

    private String tzonrc;

    private String contDg;

    private String vlstk;

    private String tcode;

    private String sdabw;

    private String vbund;

    private String xwoff;

    private String dirta;

    private String prvbe;

    private String vganz;

    private String imwrk;

    private String speWazoneIst;

    private String speOrigSys;

    private String speGeoroute;

    private String speQiStatus;

    private String sakes;

    private String speLifexType;

    private String speTtype;

    private String speProNumber;

    private String msrActive;

    private String dlvSplitInitia;

    private String dlvVersion;

    private String bev1Luleinh;

    private String bev1Rpsonst;
    
    private String tpqua;
    
    private String xabln;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMandt() {
        return mandt;
    }

    public void setMandt(Integer mandt) {
        this.mandt = mandt;
    }

    public String getVbeln() {
        return vbeln;
    }

    public void setVbeln(String vbeln) {
        this.vbeln = vbeln == null ? null : vbeln.trim();
    }

    public String getErnam() {
        return ernam;
    }

    public void setErnam(String ernam) {
        this.ernam = ernam == null ? null : ernam.trim();
    }

    public Date getErzet() {
        return erzet;
    }

    public void setErzet(Date erzet) {
        this.erzet = erzet;
    }

    public Date getErdat() {
        return erdat;
    }

    public void setErdat(Date erdat) {
        this.erdat = erdat;
    }

    public String getVkorg() {
        return vkorg;
    }

    public void setVkorg(String vkorg) {
        this.vkorg = vkorg == null ? null : vkorg.trim();
    }

    public String getLfart() {
        return lfart;
    }

    public void setLfart(String lfart) {
        this.lfart = lfart == null ? null : lfart.trim();
    }

    public Date getLfdat() {
        return lfdat;
    }

    public void setLfdat(Date lfdat) {
        this.lfdat = lfdat;
    }

    public Date getKodat() {
        return kodat;
    }

    public void setKodat(Date kodat) {
        this.kodat = kodat;
    }

    public String getInco1() {
        return inco1;
    }

    public void setInco1(String inco1) {
        this.inco1 = inco1 == null ? null : inco1.trim();
    }

    public String getKunnr() {
        return kunnr;
    }

    public void setKunnr(String kunnr) {
        this.kunnr = kunnr == null ? null : kunnr.trim();
    }

    public String getKunag() {
        return kunag;
    }

    public void setKunag(String kunag) {
        this.kunag = kunag == null ? null : kunag.trim();
    }

    public Date getFkdat() {
        return fkdat;
    }

    public void setFkdat(Date fkdat) {
        this.fkdat = fkdat;
    }

    public String getKnumv() {
        return knumv;
    }

    public void setKnumv(String knumv) {
        this.knumv = knumv == null ? null : knumv.trim();
    }

    public String getWaerk() {
        return waerk;
    }

    public void setWaerk(String waerk) {
        this.waerk = waerk == null ? null : waerk.trim();
    }

    public String getZukrl() {
        return zukrl;
    }

    public void setZukrl(String zukrl) {
        this.zukrl = zukrl == null ? null : zukrl.trim();
    }

    public String getVerur() {
        return verur;
    }

    public void setVerur(String verur) {
        this.verur = verur == null ? null : verur.trim();
    }

    public String getAenam() {
        return aenam;
    }

    public void setAenam(String aenam) {
        this.aenam = aenam == null ? null : aenam.trim();
    }

    public Date getAedat() {
        return aedat;
    }

    public void setAedat(Date aedat) {
        this.aedat = aedat;
    }

    public String getKnkli() {
        return knkli;
    }

    public void setKnkli(String knkli) {
        this.knkli = knkli == null ? null : knkli.trim();
    }

    public String getLifex() {
        return lifex;
    }

    public void setLifex(String lifex) {
        this.lifex = lifex == null ? null : lifex.trim();
    }

    public String getTernr() {
        return ternr;
    }

    public void setTernr(String ternr) {
        this.ternr = ternr == null ? null : ternr.trim();
    }

    public String getKnump() {
        return knump;
    }

    public void setKnump(String knump) {
        this.knump = knump == null ? null : knump.trim();
    }

    public BigDecimal getNetwr() {
        return netwr;
    }

    public void setNetwr(BigDecimal netwr) {
        this.netwr = netwr;
    }

    public String getAulwe() {
        return aulwe;
    }

    public void setAulwe(String aulwe) {
        this.aulwe = aulwe == null ? null : aulwe.trim();
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getLcnum() {
        return lcnum;
    }

    public void setLcnum(String lcnum) {
        this.lcnum = lcnum == null ? null : lcnum.trim();
    }

    public String getProli() {
        return proli;
    }

    public void setProli(String proli) {
        this.proli = proli == null ? null : proli.trim();
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    public String getTsegfl() {
        return tsegfl;
    }

    public void setTsegfl(String tsegfl) {
        this.tsegfl = tsegfl == null ? null : tsegfl.trim();
    }

    public String getTsegtp() {
        return tsegtp;
    }

    public void setTsegtp(String tsegtp) {
        this.tsegtp = tsegtp == null ? null : tsegtp.trim();
    }

    public String getTzonis() {
        return tzonis;
    }

    public void setTzonis(String tzonis) {
        this.tzonis = tzonis == null ? null : tzonis.trim();
    }

    public String getTzonrc() {
        return tzonrc;
    }

    public void setTzonrc(String tzonrc) {
        this.tzonrc = tzonrc == null ? null : tzonrc.trim();
    }

    public String getContDg() {
        return contDg;
    }

    public void setContDg(String contDg) {
        this.contDg = contDg == null ? null : contDg.trim();
    }

    public String getVlstk() {
        return vlstk;
    }

    public void setVlstk(String vlstk) {
        this.vlstk = vlstk == null ? null : vlstk.trim();
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode == null ? null : tcode.trim();
    }

    public String getSdabw() {
        return sdabw;
    }

    public void setSdabw(String sdabw) {
        this.sdabw = sdabw == null ? null : sdabw.trim();
    }

    public String getVbund() {
        return vbund;
    }

    public void setVbund(String vbund) {
        this.vbund = vbund == null ? null : vbund.trim();
    }

    public String getXwoff() {
        return xwoff;
    }

    public void setXwoff(String xwoff) {
        this.xwoff = xwoff == null ? null : xwoff.trim();
    }

    public String getDirta() {
        return dirta;
    }

    public void setDirta(String dirta) {
        this.dirta = dirta == null ? null : dirta.trim();
    }

    public String getPrvbe() {
        return prvbe;
    }

    public void setPrvbe(String prvbe) {
        this.prvbe = prvbe == null ? null : prvbe.trim();
    }

    public String getVganz() {
        return vganz;
    }

    public void setVganz(String vganz) {
        this.vganz = vganz == null ? null : vganz.trim();
    }

    public String getImwrk() {
        return imwrk;
    }

    public void setImwrk(String imwrk) {
        this.imwrk = imwrk == null ? null : imwrk.trim();
    }

    public String getSpeWazoneIst() {
        return speWazoneIst;
    }

    public void setSpeWazoneIst(String speWazoneIst) {
        this.speWazoneIst = speWazoneIst == null ? null : speWazoneIst.trim();
    }

    public String getSpeOrigSys() {
        return speOrigSys;
    }

    public void setSpeOrigSys(String speOrigSys) {
        this.speOrigSys = speOrigSys == null ? null : speOrigSys.trim();
    }

    public String getSpeGeoroute() {
        return speGeoroute;
    }

    public void setSpeGeoroute(String speGeoroute) {
        this.speGeoroute = speGeoroute == null ? null : speGeoroute.trim();
    }

    public String getSpeQiStatus() {
        return speQiStatus;
    }

    public void setSpeQiStatus(String speQiStatus) {
        this.speQiStatus = speQiStatus == null ? null : speQiStatus.trim();
    }

    public String getSakes() {
        return sakes;
    }

    public void setSakes(String sakes) {
        this.sakes = sakes == null ? null : sakes.trim();
    }

    public String getSpeLifexType() {
        return speLifexType;
    }

    public void setSpeLifexType(String speLifexType) {
        this.speLifexType = speLifexType == null ? null : speLifexType.trim();
    }

    public String getSpeTtype() {
        return speTtype;
    }

    public void setSpeTtype(String speTtype) {
        this.speTtype = speTtype == null ? null : speTtype.trim();
    }

    public String getSpeProNumber() {
        return speProNumber;
    }

    public void setSpeProNumber(String speProNumber) {
        this.speProNumber = speProNumber == null ? null : speProNumber.trim();
    }

    public String getMsrActive() {
        return msrActive;
    }

    public void setMsrActive(String msrActive) {
        this.msrActive = msrActive == null ? null : msrActive.trim();
    }

    public String getDlvSplitInitia() {
        return dlvSplitInitia;
    }

    public void setDlvSplitInitia(String dlvSplitInitia) {
        this.dlvSplitInitia = dlvSplitInitia == null ? null : dlvSplitInitia.trim();
    }

    public String getDlvVersion() {
        return dlvVersion;
    }

    public void setDlvVersion(String dlvVersion) {
        this.dlvVersion = dlvVersion == null ? null : dlvVersion.trim();
    }

    public String getBev1Luleinh() {
        return bev1Luleinh;
    }

    public void setBev1Luleinh(String bev1Luleinh) {
        this.bev1Luleinh = bev1Luleinh == null ? null : bev1Luleinh.trim();
    }

    public String getBev1Rpsonst() {
        return bev1Rpsonst;
    }

    public void setBev1Rpsonst(String bev1Rpsonst) {
        this.bev1Rpsonst = bev1Rpsonst == null ? null : bev1Rpsonst.trim();
    }
    public String getTpqua() {
        return tpqua;
    }

    public void setTpqua(String tpqua) {
        this.tpqua = tpqua == null ? null : tpqua.trim();
    }

	public String getXabln() {
		return xabln;
	}

	public void setXabln(String xabln) {
		this.xabln = xabln;
	}

	public String getCustomWoodSum() {
		return customWoodSum;
	}

	public void setCustomWoodSum(String customWoodSum) {
		this.customWoodSum = customWoodSum;
	}

  public String getCreateTaskPackage() {
    return createTaskPackage;
  }

  public void setCreateTaskPackage(String createTaskPackage) {
    this.createTaskPackage = createTaskPackage;
  }
}
/*package com.ikongjian.erp.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ErpBjlikp {
	
    private Integer id;

    private Integer mandt;

    private String vbeln;

    private String ernam;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date erzet;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date erdat;

    private String bzirk;

    private String vstel;

    private String vkorg;

    private String lfart;

    private String autlf;

    private String kzazu;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date wadat;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lddat;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date tddat;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lfdat;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date kodat;

    private String ablad;

    private String inco1;

    private String inco2;

    private String expkz;

    private String route;

    private String faksk;

    private String lifsk;

    private String vbtyp;

    private String knfak;

    

    private String tpgrp;

    private Integer lprio;

    private String vsbed;

    private String kunnr;

    private String kunag;

    private String kdgrp;

    private Integer stzkl;

    private Integer stzzu;

    private String btgew;

    private String ntgew;

    private String gewei;

    private String volum;

    private String voleh;

    private Integer anzpk;

    private String berot;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lfuhr;

    private String grulg;

    private String lstel;

    private String tragr;

    private String fkarv;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fkdat;

    private String perfk;

    private String routa;

    private String stafo;

    private String kalsm;

    private String knumv;

    private String waerk;

    private String vkbur;

    private Integer vbeak;

    private String zukrl;

    private String verur;

    private String commn;

    private String stwae;

    private Integer stcur;

    private String exnum;

    private String aenam;

    private Date aedat;

    private String lgnum;

    private String lispl;

    private String vkoiv;

    private String vtwiv;

    private String spaiv;

    private String fkaiv;

    private String pioiv;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fkdiv;

    private String kuniv;

    private String kkber;

    private String knkli;

    private String grupp;

    private String sbgrp;

    private String ctlpc;

    private String cmwae;

    private String amtbl;

    private String bolnr;

    private String lifnr;

    private String traty;

    private String traid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date cmfre;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date cmngv;

    private String xabln;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date bldat;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date wadatIst;

    private String trspg;

    private String tpsid;

    private String lifex;

    private String ternr;

    private String kalsmCh;

    private String klief;

    private String kalsp;

    private String knump;

    private BigDecimal netwr;

    private String aulwe;

    private String werks;

    private String lcnum;

    private String abssc;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date kouhr;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date tduhr;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lduhr;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date wauhr;

    private String lgtor;

    private String lgbzo;

    private String akwae;

    private Integer akkur;

    private Integer akprz;

    private String proli;

    private String xblnr;

    private String handle;

    private String tsegfl;

    private String tsegtp;

    private String tzonis;

    private String tzonrc;

    private String contDg;

    private String verursys;

    private String kzwab;

    private String vlstk;

    private String tcode;

    private String vsart;

    private String trmtyp;

    private String sdabw;

    private String vbund;

    private String xwoff;

    private String dirta;

    private String prvbe;

    private String folar;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date podat;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date potim;

    private String vganz;

    private String imwrk;

    private String speLoekz;

    private String speLocSeq;

    private String speAccAppSts;

    private String speShpInfSts;

    private String speRetCanc;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date speWauhrIst;

    private String speWazoneIst;

    private String speRevVlstk;

    private String speLeScenario;

    private String speOrigSys;

    private String speChngSys;

    private String speGeoroute;

    private String speGeorouteind;

    private String speCarrierInd;

    private String speGtsRel;

    private String speGtsRtCde;

    private Integer speRelTmstmp;

    private String speUnitSystem;

    private String speInvBfrGi;

    private String speQiStatus;

    private String speRedInd;

    private String sakes;

    private String speLifexType;

    private String speTtype;

    private String speProNumber;

    private String locGuid;

    private String speBillingInd;

    private String printerProfile;

    private String msrActive;

    private Integer prtnr;

    private String stgeLocChange;

    private String tmCtrlKey;

    private String dlvSplitInitia;

    private String dlvVersion;

    private String bev1Luleinh;

    private Integer bev1Rpfaess;

    private Integer bev1Rpkist;

    private Integer bev1Rpcont;

    private String bev1Rpsonst;

    private Integer bev1Rpflgnr;

    private String borgrGrp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMandt() {
        return mandt;
    }

    public void setMandt(Integer mandt) {
        this.mandt = mandt;
    }

    public String getVbeln() {
        return vbeln;
    }

    public void setVbeln(String vbeln) {
        this.vbeln = vbeln == null ? null : vbeln.trim();
    }

    public String getErnam() {
        return ernam;
    }

    public void setErnam(String ernam) {
        this.ernam = ernam == null ? null : ernam.trim();
    }

    public Date getErzet() {
        return erzet;
    }

    public void setErzet(Date erzet) {
        this.erzet = erzet;
    }

    public Date getErdat() {
        return erdat;
    }

    public void setErdat(Date erdat) {
        this.erdat = erdat;
    }

    public String getBzirk() {
        return bzirk;
    }

    public void setBzirk(String bzirk) {
        this.bzirk = bzirk == null ? null : bzirk.trim();
    }

    public String getVstel() {
        return vstel;
    }

    public void setVstel(String vstel) {
        this.vstel = vstel == null ? null : vstel.trim();
    }

    public String getVkorg() {
        return vkorg;
    }

    public void setVkorg(String vkorg) {
        this.vkorg = vkorg == null ? null : vkorg.trim();
    }

    public String getLfart() {
        return lfart;
    }

    public void setLfart(String lfart) {
        this.lfart = lfart == null ? null : lfart.trim();
    }

    public String getAutlf() {
        return autlf;
    }

    public void setAutlf(String autlf) {
        this.autlf = autlf == null ? null : autlf.trim();
    }

    public String getKzazu() {
        return kzazu;
    }

    public void setKzazu(String kzazu) {
        this.kzazu = kzazu == null ? null : kzazu.trim();
    }

    public Date getWadat() {
        return wadat;
    }

    public void setWadat(Date wadat) {
        this.wadat = wadat;
    }

    public Date getLddat() {
        return lddat;
    }

    public void setLddat(Date lddat) {
        this.lddat = lddat;
    }

    public Date getTddat() {
        return tddat;
    }

    public void setTddat(Date tddat) {
        this.tddat = tddat;
    }

    public Date getLfdat() {
        return lfdat;
    }

    public void setLfdat(Date lfdat) {
        this.lfdat = lfdat;
    }

    public Date getKodat() {
        return kodat;
    }

    public void setKodat(Date kodat) {
        this.kodat = kodat;
    }

    public String getAblad() {
        return ablad;
    }

    public void setAblad(String ablad) {
        this.ablad = ablad == null ? null : ablad.trim();
    }

    public String getInco1() {
        return inco1;
    }

    public void setInco1(String inco1) {
        this.inco1 = inco1 == null ? null : inco1.trim();
    }

    public String getInco2() {
        return inco2;
    }

    public void setInco2(String inco2) {
        this.inco2 = inco2 == null ? null : inco2.trim();
    }

    public String getExpkz() {
        return expkz;
    }

    public void setExpkz(String expkz) {
        this.expkz = expkz == null ? null : expkz.trim();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    public String getFaksk() {
        return faksk;
    }

    public void setFaksk(String faksk) {
        this.faksk = faksk == null ? null : faksk.trim();
    }

    public String getLifsk() {
        return lifsk;
    }

    public void setLifsk(String lifsk) {
        this.lifsk = lifsk == null ? null : lifsk.trim();
    }

    public String getVbtyp() {
        return vbtyp;
    }

    public void setVbtyp(String vbtyp) {
        this.vbtyp = vbtyp == null ? null : vbtyp.trim();
    }

    public String getKnfak() {
        return knfak;
    }

    public void setKnfak(String knfak) {
        this.knfak = knfak == null ? null : knfak.trim();
    }

    public String getTpqua() {
        return tpqua;
    }

    public void setTpqua(String tpqua) {
        this.tpqua = tpqua == null ? null : tpqua.trim();
    }

    public String getTpgrp() {
        return tpgrp;
    }

    public void setTpgrp(String tpgrp) {
        this.tpgrp = tpgrp == null ? null : tpgrp.trim();
    }

    public Integer getLprio() {
        return lprio;
    }

    public void setLprio(Integer lprio) {
        this.lprio = lprio;
    }

    public String getVsbed() {
        return vsbed;
    }

    public void setVsbed(String vsbed) {
        this.vsbed = vsbed == null ? null : vsbed.trim();
    }

    public String getKunnr() {
        return kunnr;
    }

    public void setKunnr(String kunnr) {
        this.kunnr = kunnr == null ? null : kunnr.trim();
    }

    public String getKunag() {
        return kunag;
    }

    public void setKunag(String kunag) {
        this.kunag = kunag == null ? null : kunag.trim();
    }

    public String getKdgrp() {
        return kdgrp;
    }

    public void setKdgrp(String kdgrp) {
        this.kdgrp = kdgrp == null ? null : kdgrp.trim();
    }

    public Integer getStzkl() {
        return stzkl;
    }

    public void setStzkl(Integer stzkl) {
        this.stzkl = stzkl;
    }

    public Integer getStzzu() {
        return stzzu;
    }

    public void setStzzu(Integer stzzu) {
        this.stzzu = stzzu;
    }

    public String getBtgew() {
        return btgew;
    }

    public void setBtgew(String btgew) {
        this.btgew = btgew == null ? null : btgew.trim();
    }

    public String getNtgew() {
        return ntgew;
    }

    public void setNtgew(String ntgew) {
        this.ntgew = ntgew == null ? null : ntgew.trim();
    }

    public String getGewei() {
        return gewei;
    }

    public void setGewei(String gewei) {
        this.gewei = gewei == null ? null : gewei.trim();
    }

    public String getVolum() {
        return volum;
    }

    public void setVolum(String volum) {
        this.volum = volum == null ? null : volum.trim();
    }

    public String getVoleh() {
        return voleh;
    }

    public void setVoleh(String voleh) {
        this.voleh = voleh == null ? null : voleh.trim();
    }

    public Integer getAnzpk() {
        return anzpk;
    }

    public void setAnzpk(Integer anzpk) {
        this.anzpk = anzpk;
    }

    public String getBerot() {
        return berot;
    }

    public void setBerot(String berot) {
        this.berot = berot == null ? null : berot.trim();
    }

    public Date getLfuhr() {
        return lfuhr;
    }

    public void setLfuhr(Date lfuhr) {
        this.lfuhr = lfuhr;
    }

    public String getGrulg() {
        return grulg;
    }

    public void setGrulg(String grulg) {
        this.grulg = grulg == null ? null : grulg.trim();
    }

    public String getLstel() {
        return lstel;
    }

    public void setLstel(String lstel) {
        this.lstel = lstel == null ? null : lstel.trim();
    }

    public String getTragr() {
        return tragr;
    }

    public void setTragr(String tragr) {
        this.tragr = tragr == null ? null : tragr.trim();
    }

    public String getFkarv() {
        return fkarv;
    }

    public void setFkarv(String fkarv) {
        this.fkarv = fkarv == null ? null : fkarv.trim();
    }

    public Date getFkdat() {
        return fkdat;
    }

    public void setFkdat(Date fkdat) {
        this.fkdat = fkdat;
    }

    public String getPerfk() {
        return perfk;
    }

    public void setPerfk(String perfk) {
        this.perfk = perfk == null ? null : perfk.trim();
    }

    public String getRouta() {
        return routa;
    }

    public void setRouta(String routa) {
        this.routa = routa == null ? null : routa.trim();
    }

    public String getStafo() {
        return stafo;
    }

    public void setStafo(String stafo) {
        this.stafo = stafo == null ? null : stafo.trim();
    }

    public String getKalsm() {
        return kalsm;
    }

    public void setKalsm(String kalsm) {
        this.kalsm = kalsm == null ? null : kalsm.trim();
    }

    public String getKnumv() {
        return knumv;
    }

    public void setKnumv(String knumv) {
        this.knumv = knumv == null ? null : knumv.trim();
    }

    public String getWaerk() {
        return waerk;
    }

    public void setWaerk(String waerk) {
        this.waerk = waerk == null ? null : waerk.trim();
    }

    public String getVkbur() {
        return vkbur;
    }

    public void setVkbur(String vkbur) {
        this.vkbur = vkbur == null ? null : vkbur.trim();
    }

    public Integer getVbeak() {
        return vbeak;
    }

    public void setVbeak(Integer vbeak) {
        this.vbeak = vbeak;
    }

    public String getZukrl() {
        return zukrl;
    }

    public void setZukrl(String zukrl) {
        this.zukrl = zukrl == null ? null : zukrl.trim();
    }

    public String getVerur() {
        return verur;
    }

    public void setVerur(String verur) {
        this.verur = verur == null ? null : verur.trim();
    }

    public String getCommn() {
        return commn;
    }

    public void setCommn(String commn) {
        this.commn = commn == null ? null : commn.trim();
    }

    public String getStwae() {
        return stwae;
    }

    public void setStwae(String stwae) {
        this.stwae = stwae == null ? null : stwae.trim();
    }

    public Integer getStcur() {
        return stcur;
    }

    public void setStcur(Integer stcur) {
        this.stcur = stcur;
    }

    public String getExnum() {
        return exnum;
    }

    public void setExnum(String exnum) {
        this.exnum = exnum == null ? null : exnum.trim();
    }

    public String getAenam() {
        return aenam;
    }

    public void setAenam(String aenam) {
        this.aenam = aenam == null ? null : aenam.trim();
    }

    public Date getAedat() {
        return aedat;
    }

    public void setAedat(Date aedat) {
        this.aedat = aedat;
    }

    public String getLgnum() {
        return lgnum;
    }

    public void setLgnum(String lgnum) {
        this.lgnum = lgnum == null ? null : lgnum.trim();
    }

    public String getLispl() {
        return lispl;
    }

    public void setLispl(String lispl) {
        this.lispl = lispl == null ? null : lispl.trim();
    }

    public String getVkoiv() {
        return vkoiv;
    }

    public void setVkoiv(String vkoiv) {
        this.vkoiv = vkoiv == null ? null : vkoiv.trim();
    }

    public String getVtwiv() {
        return vtwiv;
    }

    public void setVtwiv(String vtwiv) {
        this.vtwiv = vtwiv == null ? null : vtwiv.trim();
    }

    public String getSpaiv() {
        return spaiv;
    }

    public void setSpaiv(String spaiv) {
        this.spaiv = spaiv == null ? null : spaiv.trim();
    }

    public String getFkaiv() {
        return fkaiv;
    }

    public void setFkaiv(String fkaiv) {
        this.fkaiv = fkaiv == null ? null : fkaiv.trim();
    }

    public String getPioiv() {
        return pioiv;
    }

    public void setPioiv(String pioiv) {
        this.pioiv = pioiv == null ? null : pioiv.trim();
    }

    public Date getFkdiv() {
        return fkdiv;
    }

    public void setFkdiv(Date fkdiv) {
        this.fkdiv = fkdiv;
    }

    public String getKuniv() {
        return kuniv;
    }

    public void setKuniv(String kuniv) {
        this.kuniv = kuniv == null ? null : kuniv.trim();
    }

    public String getKkber() {
        return kkber;
    }

    public void setKkber(String kkber) {
        this.kkber = kkber == null ? null : kkber.trim();
    }

    public String getKnkli() {
        return knkli;
    }

    public void setKnkli(String knkli) {
        this.knkli = knkli == null ? null : knkli.trim();
    }

    public String getGrupp() {
        return grupp;
    }

    public void setGrupp(String grupp) {
        this.grupp = grupp == null ? null : grupp.trim();
    }

    public String getSbgrp() {
        return sbgrp;
    }

    public void setSbgrp(String sbgrp) {
        this.sbgrp = sbgrp == null ? null : sbgrp.trim();
    }

    public String getCtlpc() {
        return ctlpc;
    }

    public void setCtlpc(String ctlpc) {
        this.ctlpc = ctlpc == null ? null : ctlpc.trim();
    }

    public String getCmwae() {
        return cmwae;
    }

    public void setCmwae(String cmwae) {
        this.cmwae = cmwae == null ? null : cmwae.trim();
    }

    public String getAmtbl() {
        return amtbl;
    }

    public void setAmtbl(String amtbl) {
        this.amtbl = amtbl == null ? null : amtbl.trim();
    }

    public String getBolnr() {
        return bolnr;
    }

    public void setBolnr(String bolnr) {
        this.bolnr = bolnr == null ? null : bolnr.trim();
    }

    public String getLifnr() {
        return lifnr;
    }

    public void setLifnr(String lifnr) {
        this.lifnr = lifnr == null ? null : lifnr.trim();
    }

    public String getTraty() {
        return traty;
    }

    public void setTraty(String traty) {
        this.traty = traty == null ? null : traty.trim();
    }

    public String getTraid() {
        return traid;
    }

    public void setTraid(String traid) {
        this.traid = traid == null ? null : traid.trim();
    }

    public Date getCmfre() {
        return cmfre;
    }

    public void setCmfre(Date cmfre) {
        this.cmfre = cmfre;
    }

    public Date getCmngv() {
        return cmngv;
    }

    public void setCmngv(Date cmngv) {
        this.cmngv = cmngv;
    }

    public String getXabln() {
        return xabln;
    }

    public void setXabln(String xabln) {
        this.xabln = xabln == null ? null : xabln.trim();
    }

    public Date getBldat() {
        return bldat;
    }

    public void setBldat(Date bldat) {
        this.bldat = bldat;
    }

    public Date getWadatIst() {
        return wadatIst;
    }

    public void setWadatIst(Date wadatIst) {
        this.wadatIst = wadatIst;
    }

    public String getTrspg() {
        return trspg;
    }

    public void setTrspg(String trspg) {
        this.trspg = trspg == null ? null : trspg.trim();
    }

    public String getTpsid() {
        return tpsid;
    }

    public void setTpsid(String tpsid) {
        this.tpsid = tpsid == null ? null : tpsid.trim();
    }

    public String getLifex() {
        return lifex;
    }

    public void setLifex(String lifex) {
        this.lifex = lifex == null ? null : lifex.trim();
    }

    public String getTernr() {
        return ternr;
    }

    public void setTernr(String ternr) {
        this.ternr = ternr == null ? null : ternr.trim();
    }

    public String getKalsmCh() {
        return kalsmCh;
    }

    public void setKalsmCh(String kalsmCh) {
        this.kalsmCh = kalsmCh == null ? null : kalsmCh.trim();
    }

    public String getKlief() {
        return klief;
    }

    public void setKlief(String klief) {
        this.klief = klief == null ? null : klief.trim();
    }

    public String getKalsp() {
        return kalsp;
    }

    public void setKalsp(String kalsp) {
        this.kalsp = kalsp == null ? null : kalsp.trim();
    }

    public String getKnump() {
        return knump;
    }

    public void setKnump(String knump) {
        this.knump = knump == null ? null : knump.trim();
    }

    public String getAulwe() {
        return aulwe;
    }

    public void setAulwe(String aulwe) {
        this.aulwe = aulwe == null ? null : aulwe.trim();
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getLcnum() {
        return lcnum;
    }

    public void setLcnum(String lcnum) {
        this.lcnum = lcnum == null ? null : lcnum.trim();
    }

    public String getAbssc() {
        return abssc;
    }

    public void setAbssc(String abssc) {
        this.abssc = abssc == null ? null : abssc.trim();
    }

    public Date getKouhr() {
        return kouhr;
    }

    public void setKouhr(Date kouhr) {
        this.kouhr = kouhr;
    }

    public Date getTduhr() {
        return tduhr;
    }

    public void setTduhr(Date tduhr) {
        this.tduhr = tduhr;
    }

    public Date getLduhr() {
        return lduhr;
    }

    public void setLduhr(Date lduhr) {
        this.lduhr = lduhr;
    }

    public Date getWauhr() {
        return wauhr;
    }

    public void setWauhr(Date wauhr) {
        this.wauhr = wauhr;
    }

    public String getLgtor() {
        return lgtor;
    }

    public void setLgtor(String lgtor) {
        this.lgtor = lgtor == null ? null : lgtor.trim();
    }

    public String getLgbzo() {
        return lgbzo;
    }

    public void setLgbzo(String lgbzo) {
        this.lgbzo = lgbzo == null ? null : lgbzo.trim();
    }

    public String getAkwae() {
        return akwae;
    }

    public void setAkwae(String akwae) {
        this.akwae = akwae == null ? null : akwae.trim();
    }

    public Integer getAkkur() {
        return akkur;
    }

    public void setAkkur(Integer akkur) {
        this.akkur = akkur;
    }

    public Integer getAkprz() {
        return akprz;
    }

    public void setAkprz(Integer akprz) {
        this.akprz = akprz;
    }

    public String getProli() {
        return proli;
    }

    public void setProli(String proli) {
        this.proli = proli == null ? null : proli.trim();
    }

    public String getXblnr() {
        return xblnr;
    }

    public void setXblnr(String xblnr) {
        this.xblnr = xblnr == null ? null : xblnr.trim();
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle == null ? null : handle.trim();
    }

    public String getTsegfl() {
        return tsegfl;
    }

    public void setTsegfl(String tsegfl) {
        this.tsegfl = tsegfl == null ? null : tsegfl.trim();
    }

    public String getTsegtp() {
        return tsegtp;
    }

    public void setTsegtp(String tsegtp) {
        this.tsegtp = tsegtp == null ? null : tsegtp.trim();
    }

    public String getTzonis() {
        return tzonis;
    }

    public void setTzonis(String tzonis) {
        this.tzonis = tzonis == null ? null : tzonis.trim();
    }

    public String getTzonrc() {
        return tzonrc;
    }

    public void setTzonrc(String tzonrc) {
        this.tzonrc = tzonrc == null ? null : tzonrc.trim();
    }

    public String getContDg() {
        return contDg;
    }

    public void setContDg(String contDg) {
        this.contDg = contDg == null ? null : contDg.trim();
    }

    public String getVerursys() {
        return verursys;
    }

    public void setVerursys(String verursys) {
        this.verursys = verursys == null ? null : verursys.trim();
    }

    public String getKzwab() {
        return kzwab;
    }

    public void setKzwab(String kzwab) {
        this.kzwab = kzwab == null ? null : kzwab.trim();
    }

    public String getVlstk() {
        return vlstk;
    }

    public void setVlstk(String vlstk) {
        this.vlstk = vlstk == null ? null : vlstk.trim();
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode == null ? null : tcode.trim();
    }

    public String getVsart() {
        return vsart;
    }

    public void setVsart(String vsart) {
        this.vsart = vsart == null ? null : vsart.trim();
    }

    public String getTrmtyp() {
        return trmtyp;
    }

    public void setTrmtyp(String trmtyp) {
        this.trmtyp = trmtyp == null ? null : trmtyp.trim();
    }

    public String getSdabw() {
        return sdabw;
    }

    public void setSdabw(String sdabw) {
        this.sdabw = sdabw == null ? null : sdabw.trim();
    }

    public String getVbund() {
        return vbund;
    }

    public void setVbund(String vbund) {
        this.vbund = vbund == null ? null : vbund.trim();
    }

    public String getXwoff() {
        return xwoff;
    }

    public void setXwoff(String xwoff) {
        this.xwoff = xwoff == null ? null : xwoff.trim();
    }

    public String getDirta() {
        return dirta;
    }

    public void setDirta(String dirta) {
        this.dirta = dirta == null ? null : dirta.trim();
    }

    public String getPrvbe() {
        return prvbe;
    }

    public void setPrvbe(String prvbe) {
        this.prvbe = prvbe == null ? null : prvbe.trim();
    }

    public String getFolar() {
        return folar;
    }

    public void setFolar(String folar) {
        this.folar = folar == null ? null : folar.trim();
    }

    public Date getPodat() {
        return podat;
    }

    public void setPodat(Date podat) {
        this.podat = podat;
    }

    public Date getPotim() {
        return potim;
    }

    public void setPotim(Date potim) {
        this.potim = potim;
    }

    public String getVganz() {
        return vganz;
    }

    public void setVganz(String vganz) {
        this.vganz = vganz == null ? null : vganz.trim();
    }

    public String getImwrk() {
        return imwrk;
    }

    public void setImwrk(String imwrk) {
        this.imwrk = imwrk == null ? null : imwrk.trim();
    }

    public String getSpeLoekz() {
        return speLoekz;
    }

    public void setSpeLoekz(String speLoekz) {
        this.speLoekz = speLoekz == null ? null : speLoekz.trim();
    }

    public String getSpeLocSeq() {
        return speLocSeq;
    }

    public void setSpeLocSeq(String speLocSeq) {
        this.speLocSeq = speLocSeq == null ? null : speLocSeq.trim();
    }

    public String getSpeAccAppSts() {
        return speAccAppSts;
    }

    public void setSpeAccAppSts(String speAccAppSts) {
        this.speAccAppSts = speAccAppSts == null ? null : speAccAppSts.trim();
    }

    public String getSpeShpInfSts() {
        return speShpInfSts;
    }

    public void setSpeShpInfSts(String speShpInfSts) {
        this.speShpInfSts = speShpInfSts == null ? null : speShpInfSts.trim();
    }

    public String getSpeRetCanc() {
        return speRetCanc;
    }

    public void setSpeRetCanc(String speRetCanc) {
        this.speRetCanc = speRetCanc == null ? null : speRetCanc.trim();
    }

    public Date getSpeWauhrIst() {
        return speWauhrIst;
    }

    public void setSpeWauhrIst(Date speWauhrIst) {
        this.speWauhrIst = speWauhrIst;
    }

    public String getSpeWazoneIst() {
        return speWazoneIst;
    }

    public void setSpeWazoneIst(String speWazoneIst) {
        this.speWazoneIst = speWazoneIst == null ? null : speWazoneIst.trim();
    }

    public String getSpeRevVlstk() {
        return speRevVlstk;
    }

    public void setSpeRevVlstk(String speRevVlstk) {
        this.speRevVlstk = speRevVlstk == null ? null : speRevVlstk.trim();
    }

    public String getSpeLeScenario() {
        return speLeScenario;
    }

    public void setSpeLeScenario(String speLeScenario) {
        this.speLeScenario = speLeScenario == null ? null : speLeScenario.trim();
    }

    public String getSpeOrigSys() {
        return speOrigSys;
    }

    public void setSpeOrigSys(String speOrigSys) {
        this.speOrigSys = speOrigSys == null ? null : speOrigSys.trim();
    }

    public String getSpeChngSys() {
        return speChngSys;
    }

    public void setSpeChngSys(String speChngSys) {
        this.speChngSys = speChngSys == null ? null : speChngSys.trim();
    }

    public String getSpeGeoroute() {
        return speGeoroute;
    }

    public void setSpeGeoroute(String speGeoroute) {
        this.speGeoroute = speGeoroute == null ? null : speGeoroute.trim();
    }

    public String getSpeGeorouteind() {
        return speGeorouteind;
    }

    public void setSpeGeorouteind(String speGeorouteind) {
        this.speGeorouteind = speGeorouteind == null ? null : speGeorouteind.trim();
    }

    public String getSpeCarrierInd() {
        return speCarrierInd;
    }

    public void setSpeCarrierInd(String speCarrierInd) {
        this.speCarrierInd = speCarrierInd == null ? null : speCarrierInd.trim();
    }

    public String getSpeGtsRel() {
        return speGtsRel;
    }

    public void setSpeGtsRel(String speGtsRel) {
        this.speGtsRel = speGtsRel == null ? null : speGtsRel.trim();
    }

    public String getSpeGtsRtCde() {
        return speGtsRtCde;
    }

    public void setSpeGtsRtCde(String speGtsRtCde) {
        this.speGtsRtCde = speGtsRtCde == null ? null : speGtsRtCde.trim();
    }

    public Integer getSpeRelTmstmp() {
        return speRelTmstmp;
    }

    public void setSpeRelTmstmp(Integer speRelTmstmp) {
        this.speRelTmstmp = speRelTmstmp;
    }

    public String getSpeUnitSystem() {
        return speUnitSystem;
    }

    public void setSpeUnitSystem(String speUnitSystem) {
        this.speUnitSystem = speUnitSystem == null ? null : speUnitSystem.trim();
    }

    public String getSpeInvBfrGi() {
        return speInvBfrGi;
    }

    public void setSpeInvBfrGi(String speInvBfrGi) {
        this.speInvBfrGi = speInvBfrGi == null ? null : speInvBfrGi.trim();
    }

    public String getSpeQiStatus() {
        return speQiStatus;
    }

    public void setSpeQiStatus(String speQiStatus) {
        this.speQiStatus = speQiStatus == null ? null : speQiStatus.trim();
    }

    public String getSpeRedInd() {
        return speRedInd;
    }

    public void setSpeRedInd(String speRedInd) {
        this.speRedInd = speRedInd == null ? null : speRedInd.trim();
    }

    public String getSakes() {
        return sakes;
    }

    public void setSakes(String sakes) {
        this.sakes = sakes == null ? null : sakes.trim();
    }

    public String getSpeLifexType() {
        return speLifexType;
    }

    public void setSpeLifexType(String speLifexType) {
        this.speLifexType = speLifexType == null ? null : speLifexType.trim();
    }

    public String getSpeTtype() {
        return speTtype;
    }

    public void setSpeTtype(String speTtype) {
        this.speTtype = speTtype == null ? null : speTtype.trim();
    }

    public String getSpeProNumber() {
        return speProNumber;
    }

    public void setSpeProNumber(String speProNumber) {
        this.speProNumber = speProNumber == null ? null : speProNumber.trim();
    }

    public String getLocGuid() {
        return locGuid;
    }

    public void setLocGuid(String locGuid) {
        this.locGuid = locGuid == null ? null : locGuid.trim();
    }

    public String getSpeBillingInd() {
        return speBillingInd;
    }

    public void setSpeBillingInd(String speBillingInd) {
        this.speBillingInd = speBillingInd == null ? null : speBillingInd.trim();
    }

    public String getPrinterProfile() {
        return printerProfile;
    }

    public void setPrinterProfile(String printerProfile) {
        this.printerProfile = printerProfile == null ? null : printerProfile.trim();
    }

    public String getMsrActive() {
        return msrActive;
    }

    public void setMsrActive(String msrActive) {
        this.msrActive = msrActive == null ? null : msrActive.trim();
    }

    public Integer getPrtnr() {
        return prtnr;
    }

    public void setPrtnr(Integer prtnr) {
        this.prtnr = prtnr;
    }

    public String getStgeLocChange() {
        return stgeLocChange;
    }

    public void setStgeLocChange(String stgeLocChange) {
        this.stgeLocChange = stgeLocChange == null ? null : stgeLocChange.trim();
    }

    public String getTmCtrlKey() {
        return tmCtrlKey;
    }

    public void setTmCtrlKey(String tmCtrlKey) {
        this.tmCtrlKey = tmCtrlKey == null ? null : tmCtrlKey.trim();
    }

    public String getDlvSplitInitia() {
        return dlvSplitInitia;
    }

    public void setDlvSplitInitia(String dlvSplitInitia) {
        this.dlvSplitInitia = dlvSplitInitia == null ? null : dlvSplitInitia.trim();
    }


    public Integer getBev1Rpfaess() {
        return bev1Rpfaess;
    }

    public void setBev1Rpfaess(Integer bev1Rpfaess) {
        this.bev1Rpfaess = bev1Rpfaess;
    }

    public Integer getBev1Rpkist() {
        return bev1Rpkist;
    }

    public void setBev1Rpkist(Integer bev1Rpkist) {
        this.bev1Rpkist = bev1Rpkist;
    }

    public Integer getBev1Rpcont() {
        return bev1Rpcont;
    }

    public void setBev1Rpcont(Integer bev1Rpcont) {
        this.bev1Rpcont = bev1Rpcont;
    }
    
    public String getDlvVersion() {
		return dlvVersion;
	}

	public void setDlvVersion(String dlvVersion) {
		this.dlvVersion = dlvVersion;
	}

	public String getBev1Luleinh() {
		return bev1Luleinh;
	}

	public void setBev1Luleinh(String bev1Luleinh) {
		this.bev1Luleinh = bev1Luleinh;
	}

	public String getBev1Rpsonst() {
		return bev1Rpsonst;
	}

	public void setBev1Rpsonst(String bev1Rpsonst) {
		this.bev1Rpsonst = bev1Rpsonst;
	}

	public Integer getBev1Rpflgnr() {
        return bev1Rpflgnr;
    }

    public void setBev1Rpflgnr(Integer bev1Rpflgnr) {
        this.bev1Rpflgnr = bev1Rpflgnr;
    }

    public String getBorgrGrp() {
        return borgrGrp;
    }

    public void setBorgrGrp(String borgrGrp) {
        this.borgrGrp = borgrGrp == null ? null : borgrGrp.trim();
    }

	public BigDecimal getNetwr() {
		return netwr;
	}

	public void setNetwr(BigDecimal netwr) {
		this.netwr = netwr;
	}



}*/