package asuna.testkit
import asuna.macros.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class Test89 extends AnyFunSpec with Matchers {
  case class Foo89(
    i1: Long,
    i2: Int,
    i3: Int,
    i4: String,
    i5: Long,
    i6: Int,
    i7: Int,
    i8: String,
    i9: Long,
    i10: Int,
    i11: Int,
    i12: String,
    i13: Long,
    i14: Int,
    i15: Int,
    i16: String,
    i17: Long,
    i18: Int,
    i19: Int,
    i20: String,
    i21: Long,
    i22: Int,
    i23: Int,
    i24: String,
    i25: Long,
    i26: Int,
    i27: Int,
    i28: String,
    i29: Long,
    i30: Int,
    i31: Int,
    i32: String,
    i33: Long,
    i34: Int,
    i35: Int,
    i36: String,
    i37: Long,
    i38: Int,
    i39: Int,
    i40: String,
    i41: Long,
    i42: Int,
    i43: Int,
    i44: String,
    i45: Long,
    i46: Int,
    i47: Int,
    i48: String,
    i49: Long,
    i50: Int,
    i51: Int,
    i52: String,
    i53: Long,
    i54: Int,
    i55: Int,
    i56: String,
    i57: Long,
    i58: Int,
    i59: Int,
    i60: String,
    i61: Long,
    i62: Int,
    i63: Int,
    i64: String,
    i65: Long,
    i66: Int,
    i67: Int,
    i68: String,
    i69: Long,
    i70: Int,
    i71: Int,
    i72: String,
    i73: Long,
    i74: Int,
    i75: Int,
    i76: String,
    i77: Long,
    i78: Int,
    i79: Int,
    i80: String,
    i81: Long,
    i82: Int,
    i83: Int,
    i84: String,
    i85: Long,
    i86: Int,
    i87: Int,
    i88: String,
    i89: Long
  ) {
    self =>
    override def toString: String =
      s"(Long" + s"(${self.i1}),i1)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Long" + s"(${self.i9}),i9)|" + s"(Int" + s"(${self.i10}),i10)|" + s"(Int" + s"(${self.i11}),i11)|" + s"(String" + s"(${self.i12}),i12)|" + s"(Long" + s"(${self.i13}),i13)|" + s"(Int" + s"(${self.i14}),i14)|" + s"(Int" + s"(${self.i15}),i15)|" + s"(String" + s"(${self.i16}),i16)|" + s"(Long" + s"(${self.i17}),i17)|" + s"(Int" + s"(${self.i18}),i18)|" + s"(Int" + s"(${self.i19}),i19)|" + s"(String" + s"(${self.i20}),i20)|" + s"(Long" + s"(${self.i21}),i21)|" + s"(Int" + s"(${self.i22}),i22)|" + s"(Int" + s"(${self.i23}),i23)|" + s"(String" + s"(${self.i24}),i24)|" + s"(Long" + s"(${self.i25}),i25)|" + s"(Int" + s"(${self.i26}),i26)|" + s"(Int" + s"(${self.i27}),i27)|" + s"(String" + s"(${self.i28}),i28)|" + s"(Long" + s"(${self.i29}),i29)|" + s"(Int" + s"(${self.i30}),i30)|" + s"(Int" + s"(${self.i31}),i31)|" + s"(String" + s"(${self.i32}),i32)|" + s"(Long" + s"(${self.i33}),i33)|" + s"(Int" + s"(${self.i34}),i34)|" + s"(Int" + s"(${self.i35}),i35)|" + s"(String" + s"(${self.i36}),i36)|" + s"(Long" + s"(${self.i37}),i37)|" + s"(Int" + s"(${self.i38}),i38)|" + s"(Int" + s"(${self.i39}),i39)|" + s"(String" + s"(${self.i40}),i40)|" + s"(Long" + s"(${self.i41}),i41)|" + s"(Int" + s"(${self.i42}),i42)|" + s"(Int" + s"(${self.i43}),i43)|" + s"(String" + s"(${self.i44}),i44)|" + s"(Long" + s"(${self.i45}),i45)|" + s"(Int" + s"(${self.i46}),i46)|" + s"(Int" + s"(${self.i47}),i47)|" + s"(String" + s"(${self.i48}),i48)|" + s"(Long" + s"(${self.i49}),i49)|" + s"(Int" + s"(${self.i50}),i50)|" + s"(Int" + s"(${self.i51}),i51)|" + s"(String" + s"(${self.i52}),i52)|" + s"(Long" + s"(${self.i53}),i53)|" + s"(Int" + s"(${self.i54}),i54)|" + s"(Int" + s"(${self.i55}),i55)|" + s"(String" + s"(${self.i56}),i56)|" + s"(Long" + s"(${self.i57}),i57)|" + s"(Int" + s"(${self.i58}),i58)|" + s"(Int" + s"(${self.i59}),i59)|" + s"(String" + s"(${self.i60}),i60)|" + s"(Long" + s"(${self.i61}),i61)|" + s"(Int" + s"(${self.i62}),i62)|" + s"(Int" + s"(${self.i63}),i63)|" + s"(String" + s"(${self.i64}),i64)|" + s"(Long" + s"(${self.i65}),i65)|" + s"(Int" + s"(${self.i66}),i66)|" + s"(Int" + s"(${self.i67}),i67)|" + s"(String" + s"(${self.i68}),i68)|" + s"(Long" + s"(${self.i69}),i69)|" + s"(Int" + s"(${self.i70}),i70)|" + s"(Int" + s"(${self.i71}),i71)|" + s"(String" + s"(${self.i72}),i72)|" + s"(Long" + s"(${self.i73}),i73)|" + s"(Int" + s"(${self.i74}),i74)|" + s"(Int" + s"(${self.i75}),i75)|" + s"(String" + s"(${self.i76}),i76)|" + s"(Long" + s"(${self.i77}),i77)|" + s"(Int" + s"(${self.i78}),i78)|" + s"(Int" + s"(${self.i79}),i79)|" + s"(String" + s"(${self.i80}),i80)|" + s"(Long" + s"(${self.i81}),i81)|" + s"(Int" + s"(${self.i82}),i82)|" + s"(Int" + s"(${self.i83}),i83)|" + s"(String" + s"(${self.i84}),i84)|" + s"(Long" + s"(${self.i85}),i85)|" + s"(Int" + s"(${self.i86}),i86)|" + s"(Int" + s"(${self.i87}),i87)|" + s"(String" + s"(${self.i88}),i88)|" + s"(Long" + s"(${self.i89}),i89)"
    def reverseString: String =
      s"(Long" + s"(${self.i89}),i89)|" + s"(String" + s"(${self.i88}),i88)|" + s"(Int" + s"(${self.i87}),i87)|" + s"(Int" + s"(${self.i86}),i86)|" + s"(Long" + s"(${self.i85}),i85)|" + s"(String" + s"(${self.i84}),i84)|" + s"(Int" + s"(${self.i83}),i83)|" + s"(Int" + s"(${self.i82}),i82)|" + s"(Long" + s"(${self.i81}),i81)|" + s"(String" + s"(${self.i80}),i80)|" + s"(Int" + s"(${self.i79}),i79)|" + s"(Int" + s"(${self.i78}),i78)|" + s"(Long" + s"(${self.i77}),i77)|" + s"(String" + s"(${self.i76}),i76)|" + s"(Int" + s"(${self.i75}),i75)|" + s"(Int" + s"(${self.i74}),i74)|" + s"(Long" + s"(${self.i73}),i73)|" + s"(String" + s"(${self.i72}),i72)|" + s"(Int" + s"(${self.i71}),i71)|" + s"(Int" + s"(${self.i70}),i70)|" + s"(Long" + s"(${self.i69}),i69)|" + s"(String" + s"(${self.i68}),i68)|" + s"(Int" + s"(${self.i67}),i67)|" + s"(Int" + s"(${self.i66}),i66)|" + s"(Long" + s"(${self.i65}),i65)|" + s"(String" + s"(${self.i64}),i64)|" + s"(Int" + s"(${self.i63}),i63)|" + s"(Int" + s"(${self.i62}),i62)|" + s"(Long" + s"(${self.i61}),i61)|" + s"(String" + s"(${self.i60}),i60)|" + s"(Int" + s"(${self.i59}),i59)|" + s"(Int" + s"(${self.i58}),i58)|" + s"(Long" + s"(${self.i57}),i57)|" + s"(String" + s"(${self.i56}),i56)|" + s"(Int" + s"(${self.i55}),i55)|" + s"(Int" + s"(${self.i54}),i54)|" + s"(Long" + s"(${self.i53}),i53)|" + s"(String" + s"(${self.i52}),i52)|" + s"(Int" + s"(${self.i51}),i51)|" + s"(Int" + s"(${self.i50}),i50)|" + s"(Long" + s"(${self.i49}),i49)|" + s"(String" + s"(${self.i48}),i48)|" + s"(Int" + s"(${self.i47}),i47)|" + s"(Int" + s"(${self.i46}),i46)|" + s"(Long" + s"(${self.i45}),i45)|" + s"(String" + s"(${self.i44}),i44)|" + s"(Int" + s"(${self.i43}),i43)|" + s"(Int" + s"(${self.i42}),i42)|" + s"(Long" + s"(${self.i41}),i41)|" + s"(String" + s"(${self.i40}),i40)|" + s"(Int" + s"(${self.i39}),i39)|" + s"(Int" + s"(${self.i38}),i38)|" + s"(Long" + s"(${self.i37}),i37)|" + s"(String" + s"(${self.i36}),i36)|" + s"(Int" + s"(${self.i35}),i35)|" + s"(Int" + s"(${self.i34}),i34)|" + s"(Long" + s"(${self.i33}),i33)|" + s"(String" + s"(${self.i32}),i32)|" + s"(Int" + s"(${self.i31}),i31)|" + s"(Int" + s"(${self.i30}),i30)|" + s"(Long" + s"(${self.i29}),i29)|" + s"(String" + s"(${self.i28}),i28)|" + s"(Int" + s"(${self.i27}),i27)|" + s"(Int" + s"(${self.i26}),i26)|" + s"(Long" + s"(${self.i25}),i25)|" + s"(String" + s"(${self.i24}),i24)|" + s"(Int" + s"(${self.i23}),i23)|" + s"(Int" + s"(${self.i22}),i22)|" + s"(Long" + s"(${self.i21}),i21)|" + s"(String" + s"(${self.i20}),i20)|" + s"(Int" + s"(${self.i19}),i19)|" + s"(Int" + s"(${self.i18}),i18)|" + s"(Long" + s"(${self.i17}),i17)|" + s"(String" + s"(${self.i16}),i16)|" + s"(Int" + s"(${self.i15}),i15)|" + s"(Int" + s"(${self.i14}),i14)|" + s"(Long" + s"(${self.i13}),i13)|" + s"(String" + s"(${self.i12}),i12)|" + s"(Int" + s"(${self.i11}),i11)|" + s"(Int" + s"(${self.i10}),i10)|" + s"(Long" + s"(${self.i9}),i9)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Long" + s"(${self.i1}),i1)"
  }
  val fooValue89 = Foo89(
    i1 = 1,
    i2 = 2,
    i3 = 3,
    i4 = "i4",
    i5 = 5,
    i6 = 6,
    i7 = 7,
    i8 = "i8",
    i9 = 9,
    i10 = 10,
    i11 = 11,
    i12 = "i12",
    i13 = 13,
    i14 = 14,
    i15 = 15,
    i16 = "i16",
    i17 = 17,
    i18 = 18,
    i19 = 19,
    i20 = "i20",
    i21 = 21,
    i22 = 22,
    i23 = 23,
    i24 = "i24",
    i25 = 25,
    i26 = 26,
    i27 = 27,
    i28 = "i28",
    i29 = 29,
    i30 = 30,
    i31 = 31,
    i32 = "i32",
    i33 = 33,
    i34 = 34,
    i35 = 35,
    i36 = "i36",
    i37 = 37,
    i38 = 38,
    i39 = 39,
    i40 = "i40",
    i41 = 41,
    i42 = 42,
    i43 = 43,
    i44 = "i44",
    i45 = 45,
    i46 = 46,
    i47 = 47,
    i48 = "i48",
    i49 = 49,
    i50 = 50,
    i51 = 51,
    i52 = "i52",
    i53 = 53,
    i54 = 54,
    i55 = 55,
    i56 = "i56",
    i57 = 57,
    i58 = 58,
    i59 = 59,
    i60 = "i60",
    i61 = 61,
    i62 = 62,
    i63 = 63,
    i64 = "i64",
    i65 = 65,
    i66 = 66,
    i67 = 67,
    i68 = "i68",
    i69 = 69,
    i70 = 70,
    i71 = 71,
    i72 = "i72",
    i73 = 73,
    i74 = 74,
    i75 = 75,
    i76 = "i76",
    i77 = 77,
    i78 = 78,
    i79 = 79,
    i80 = "i80",
    i81 = 81,
    i82 = 82,
    i83 = 83,
    i84 = "i84",
    i85 = 85,
    i86 = 86,
    i87 = 87,
    i88 = "i88",
    i89 = 89
  )
  val ap89 = PropertyApply[Foo89]
  import in._
  import out._
  val fooEncoder89: ListEncoder[Foo89]         = encoder
  val reverseFooEncoder89: ListEncoder[Foo89]  = reverseEncoder
  val fooDecoder89: ModelDecoder[Foo89]        = decoder
  val reverseFooDecoder89: ModelDecoder[Foo89] = reverseDecoder
  describe("A case class by 89 length") {
    it("should generic to a encoder") {
      val str1 = fooEncoder89.encode(fooValue89).mkString("|")
      str1 shouldBe fooValue89.toString
    }
    it("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder89.encode(fooValue89).mkString("|")
      str2 shouldBe fooValue89.reverseString
    }
    it("should generic to a decoder") {
      val (_, model1) = fooDecoder89.init(fooValue89.toString)
      model1 shouldBe fooValue89
    }
    it("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder89.init(fooValue89.reverseString)
      model2 shouldBe fooValue89
    }
  }
}
