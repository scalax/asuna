package org.scalax.asuna.mapper.append

object MacroTest4 {

  trait MM

  case class LargeModel(
      miaomiao1: Int = 123
    , miaomiao2: String
    , miaomiao3: String
    , miaomiao4: String
    , miaomiao5: String
    , miaomiao6: String
    , miaomiao7: String
    , miaomiao8: String
    , miaomiao9: String
    , miaomiao10: String
    , miaomiao11: String
    , miaomiao12: String
    , miaomiao13: String
    , miaomiao14: String
    , miaomiao15: String
    , miaomiao16: String
    , miaomiao17: Option[LargeModel11]
    , miaomiao18: String
    , miaomiao19: String
    , miaomiao20: String
    , miaomiao21: String
    , miaomiao22: String
    , miaomiao23: String
    , miaomiao24: String
    , miaomiao25: String
    , miaomiao26: String
    , miaomiao27: String
    , miaomiao28: String
    , miaomiao29: String
    , miaomiao30: String
    , miaomiao31: String
    , miaomiao32: String
    , miaomiao33: String
    , miaomiao34: String
    , miaomiao35: String
    , miaomiao36: String
    , miaomiao37: String
    , miaomiao38: String
    , miaomiao39: String
    , miaomiao40: String
    , miaomiao41: String
    , miaomiao42: Int = 27
    , miaomiao43: String
    , miaomiao44: String
    , miaomiao45: String
    , miaomiao46: String
    , miaomiao47: String
    , miaomiao48: String
    , miaomiao49: String
    , miaomiao50: String
    , miaomiao51: String
    , miaomiao52: String
    , miaomiao53: String
    , miaomiao54: String
    , miaomiao55: String
    , miaomiao56: Int = 3812
    , miaomiao57: String
    , miaomiao58: String
    , miaomiao59: String
    , miaomiao60: String
    , miaomiao61: String
    , miaomiao62: String
    , miaomiao63: String
    , miaomiao64: String
    , miaomiao65: String
    , miaomiao66: String
    , miaomiao67: String
    , miaomiao68: String
    , miaomiao69: String
    , miaomiao70: String
    , miaomiao71: String
    , miaomiao72: String
    , miaomiao73: String
    , miaomiao74: String
    , miaomiao75: String
    , miaomiao76: String
    , miaomiao77: String
    , miaomiao78: String
    , miaomiao79: String
    , miaomiao80: String
    , miaomiao81: String
    , miaomiao82: String
    , miaomiao83: String
    , miaomiao84: String
    , miaomiao85: String
    , miaomiao86: String
    , miaomiao87: String
    , miaomiao88: String
    , miaomiao89: String
    , miaomiao90: String
    , miaomiao91: String
    , miaomiao92: String
    , miaomiao93: String
    , miaomiao94: Int = 782
    , miaomiao95: String
    , miaomiao96: String
    , miaomiao97: String
    , miaomiao98: String
    , miaomiao99: String
    , miaomiao100: String
  )

  case class LargeModel11(
      miaomiao1: Int = 123
    , miaomiao2: String
    , miaomiao3: String
    , miaomiao4: String
    , miaomiao5: String
    , miaomiao6: String
    , miaomiao7: String
    , miaomiao8: String
    , miaomiao9: String
    , miaomiao10: String
    , miaomiao11: List[LargeModel]
    , miaomiao12: String
    , miaomiao13: String
    , miaomiao14: String
    , miaomiao15: String
    , miaomiao16: String
    , miaomiao17: String
    , miaomiao18: String
    , miaomiao19: String
    , miaomiao20: String
    , miaomiao21: String
    , miaomiao22: String
    , miaomiao23: String
    , miaomiao24: String
    , miaomiao25: String
    , miaomiao26: String
    , miaomiao27: String
    , miaomiao28: String
    , miaomiao29: String
    , miaomiao30: String
    , miaomiao31: String
    , miaomiao32: String
    , miaomiao33: String
    , miaomiao34: String
    , miaomiao35: String
    , miaomiao36: String
    , miaomiao37: String
    , miaomiao38: String
    , miaomiao39: String
    , miaomiao40: String
    , miaomiao41: String
    , miaomiao42: Int = 27
    , miaomiao43: String
    , miaomiao44: String
    , miaomiao45: String
    , miaomiao46: String
    , miaomiao47: String
    , miaomiao48: String
    , miaomiao49: String
    , miaomiao50: String
    , miaomiao51: String
    , miaomiao52: String
    , miaomiao53: String
    , miaomiao54: String
    , miaomiao55: String
    , miaomiao56: Int = 3812
    , miaomiao57: String
    , miaomiao58: String
    , miaomiao59: String
    , miaomiao60: String
    , miaomiao61: String
    , miaomiao62: String
    , miaomiao63: String
    , miaomiao64: String
    , miaomiao65: String
    , miaomiao66: String
    , miaomiao67: String
    , miaomiao68: String
    , miaomiao69: String
    , miaomiao70: String
    , miaomiao71: String
    , miaomiao72: String
    , miaomiao73: String
    , miaomiao74: String
    , miaomiao75: String
    , miaomiao76: String
    , miaomiao77: String
    , miaomiao78: String
    , miaomiao79: String
    , miaomiao80: String
    , miaomiao81: String
    , miaomiao82: String
    , miaomiao83: String
    , miaomiao84: String
    , miaomiao85: String
    , miaomiao86: String
    , miaomiao87: String
    , miaomiao88: String
    , miaomiao89: String
    , miaomiao90: String
    , miaomiao91: String
    , miaomiao92: String
    , miaomiao93: String
    , miaomiao94: Int = 782
    , miaomiao95: String
    , miaomiao96: String
    , miaomiao97: String
    , miaomiao98: String
    , miaomiao99: String
    , miaomiao100: String
  )

  def dd = LargeModel(
      miaomiao1 = 404
    , miaomiao2 = "init string"
    , miaomiao3 = "init string"
    , miaomiao4 = "init string"
    , miaomiao5 = "init string"
    , miaomiao6 = "init string"
    , miaomiao7 = "init string"
    , miaomiao8 = "init string"
    , miaomiao9 = "init string"
    , miaomiao10 = "init string"
    , miaomiao11 = "init string"
    , miaomiao12 = "2333"
    , miaomiao13 = "init string"
    , miaomiao14 = "init string"
    , miaomiao15 = "init string"
    , miaomiao16 = "init string"
    , miaomiao17 = Option(jj)
    , miaomiao18 = "init string"
    , miaomiao19 = "init string"
    , miaomiao20 = "init string"
    , miaomiao21 = "init string"
    , miaomiao22 = "init string"
    , miaomiao23 = "init string"
    , miaomiao24 = "init string"
    , miaomiao25 = "init string"
    , miaomiao26 = "init string"
    , miaomiao27 = "init string"
    , miaomiao28 = "init string"
    , miaomiao29 = "init string"
    , miaomiao30 = "init string"
    , miaomiao31 = "init string"
    , miaomiao32 = "init string"
    , miaomiao33 = "init string"
    , miaomiao34 = "init string"
    , miaomiao35 = "init string"
    , miaomiao36 = "init string"
    , miaomiao37 = "init string"
    , miaomiao38 = "init string"
    , miaomiao39 = "init string"
    , miaomiao40 = "init string"
    , miaomiao41 = "init string"
    , miaomiao42 = 2333
    , miaomiao43 = "init string"
    , miaomiao44 = "init string"
    , miaomiao45 = "init string"
    , miaomiao46 = "init string"
    , miaomiao47 = "init string"
    , miaomiao48 = "init string"
    , miaomiao49 = "init string"
    , miaomiao50 = "init string"
    , miaomiao51 = "init string"
    , miaomiao52 = "init string"
    , miaomiao53 = "init string"
    , miaomiao54 = "init string"
    , miaomiao55 = "init string"
    , miaomiao56 = 4567
    , miaomiao57 = "init string"
    , miaomiao58 = "init string"
    , miaomiao59 = "init string"
    , miaomiao60 = "init string"
    , miaomiao61 = "init string"
    , miaomiao62 = "init string"
    , miaomiao63 = "init string"
    , miaomiao64 = "init string"
    , miaomiao65 = "init string"
    , miaomiao66 = "init string"
    , miaomiao67 = "init string"
    , miaomiao68 = "init string"
    , miaomiao69 = "init string"
    , miaomiao70 = "init string"
    , miaomiao71 = "init string"
    , miaomiao72 = "init string"
    , miaomiao73 = "init string"
    , miaomiao74 = "init string"
    , miaomiao75 = "init string"
    , miaomiao76 = "init string"
    , miaomiao77 = "init string"
    , miaomiao78 = "init string"
    , miaomiao79 = "init string"
    , miaomiao80 = "init string"
    , miaomiao81 = "init string"
    , miaomiao82 = "init string"
    , miaomiao83 = "init string"
    , miaomiao84 = "init string"
    , miaomiao85 = "init string"
    , miaomiao86 = "init string"
    , miaomiao87 = "init string"
    , miaomiao88 = "init string"
    , miaomiao89 = "init string"
    , miaomiao90 = "init string"
    , miaomiao91 = "init string"
    , miaomiao92 = "init string"
    , miaomiao93 = "init string"
    , miaomiao94 = 8910
    , miaomiao95 = "init string"
    , miaomiao96 = "init string"
    , miaomiao97 = "init string"
    , miaomiao98 = "init string"
    , miaomiao99 = "init string"
    , miaomiao100 = "init string"
  )

  val jj = LargeModel11(
      miaomiao1 = 404
    , miaomiao2 = "init string"
    , miaomiao3 = "init string"
    , miaomiao4 = "init string"
    , miaomiao5 = "init string"
    , miaomiao6 = "init string"
    , miaomiao7 = "init string"
    , miaomiao8 = "init string"
    , miaomiao9 = "init string"
    , miaomiao10 = "init string"
    , miaomiao11 = List.empty
    , miaomiao12 = "2333"
    , miaomiao13 = "init string"
    , miaomiao14 = "init string"
    , miaomiao15 = "init string"
    , miaomiao16 = "init string"
    , miaomiao17 = "init string"
    , miaomiao18 = "init string"
    , miaomiao19 = "init string"
    , miaomiao20 = "init string"
    , miaomiao21 = "init string"
    , miaomiao22 = "init string"
    , miaomiao23 = "init string"
    , miaomiao24 = "init string"
    , miaomiao25 = "init string"
    , miaomiao26 = "init string"
    , miaomiao27 = "init string"
    , miaomiao28 = "init string"
    , miaomiao29 = "init string"
    , miaomiao30 = "init string"
    , miaomiao31 = "init string"
    , miaomiao32 = "init string"
    , miaomiao33 = "init string"
    , miaomiao34 = "init string"
    , miaomiao35 = "init string"
    , miaomiao36 = "init string"
    , miaomiao37 = "init string"
    , miaomiao38 = "init string"
    , miaomiao39 = "init string"
    , miaomiao40 = "init string"
    , miaomiao41 = "init string"
    , miaomiao42 = 2333
    , miaomiao43 = "init string"
    , miaomiao44 = "init string"
    , miaomiao45 = "init string"
    , miaomiao46 = "init string"
    , miaomiao47 = "init string"
    , miaomiao48 = "init string"
    , miaomiao49 = "init string"
    , miaomiao50 = "init string"
    , miaomiao51 = "init string"
    , miaomiao52 = "init string"
    , miaomiao53 = "init string"
    , miaomiao54 = "init string"
    , miaomiao55 = "init string"
    , miaomiao56 = 4567
    , miaomiao57 = "init string"
    , miaomiao58 = "init string"
    , miaomiao59 = "init string"
    , miaomiao60 = "init string"
    , miaomiao61 = "init string"
    , miaomiao62 = "init string"
    , miaomiao63 = "init string"
    , miaomiao64 = "init string"
    , miaomiao65 = "init string"
    , miaomiao66 = "init string"
    , miaomiao67 = "init string"
    , miaomiao68 = "init string"
    , miaomiao69 = "init string"
    , miaomiao70 = "init string"
    , miaomiao71 = "init string"
    , miaomiao72 = "init string"
    , miaomiao73 = "init string"
    , miaomiao74 = "init string"
    , miaomiao75 = "init string"
    , miaomiao76 = "init string"
    , miaomiao77 = "init string"
    , miaomiao78 = "init string"
    , miaomiao79 = "init string"
    , miaomiao80 = "init string"
    , miaomiao81 = "init string"
    , miaomiao82 = "init string"
    , miaomiao83 = "init string"
    , miaomiao84 = "init string"
    , miaomiao85 = "init string"
    , miaomiao86 = "init string"
    , miaomiao87 = "init string"
    , miaomiao88 = "init string"
    , miaomiao89 = "init string"
    , miaomiao90 = "init string"
    , miaomiao91 = "init string"
    , miaomiao92 = "init string"
    , miaomiao93 = "init string"
    , miaomiao94 = 8910
    , miaomiao95 = "init string"
    , miaomiao96 = "init string"
    , miaomiao97 = "init string"
    , miaomiao98 = "init string"
    , miaomiao99 = "init string"
    , miaomiao100 = "init string"
  )

}
