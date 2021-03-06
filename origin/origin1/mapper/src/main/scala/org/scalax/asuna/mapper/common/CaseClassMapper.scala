package org.scalax.asuna.mapper.common;
import org.scalax.asuna.core.encoder.EncoderShape;
import org.scalax.asuna.core.encoder.EncoderShapeValue;
import org.scalax.asuna.mapper.encoder.EncoderWrapperHelper;
import org.scalax.asuna.mapper.encoder.EncoderContent;
import org.scalax.asuna.mapper.encoder.EncoderDebugShape;
import org.scalax.asuna.core.decoder.{DecoderShape, SplitData};
import org.scalax.asuna.core.decoder.DecoderShapeValue;
import org.scalax.asuna.mapper.decoder.DecoderWrapperHelper;
import org.scalax.asuna.mapper.decoder.DecoderContent;
import org.scalax.asuna.mapper.decoder.DecoderDebugShape;
import org.scalax.asuna.core.formatter.FormatterShape;
import org.scalax.asuna.core.formatter.FormatterShapeValue;
import org.scalax.asuna.mapper.formatter.FormatterWrapperHelper;
import org.scalax.asuna.mapper.formatter.FormatterContent;
import org.scalax.asuna.mapper.formatter.FormatterDebugShape;
//import scala.annotation.implicitNotFound;
import scala.language.higherKinds;
trait CaseClassMapper;
object CaseClassMapper {
  def withRep[
      Rep1
    , Data1
  ](
      rep1: Rep1
    , setter: => PropertyDataType1[
        Data1
    ]
  ): CaseClassRepMapper1[
      Rep1
    , Data1
  ] = {
    new CaseClassRepMapper1[
        Rep1
      , Data1
    ](
        rep1 = rep1
    )
  };
  def defineDataType[
      Data1
  ](
      property1: PropertyType[Data1]
  ): PropertyDataType1[
      Data1
  ] = {
    new PropertyDataType1[
        Data1
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
  ](
      rep1: Rep1
  ): CaseClassRepMapper1[
      Rep1
    , Rep1#TempData
  ] = {
    new CaseClassRepMapper1[
        Rep1
      , Rep1#TempData
    ](
        rep1 = rep1
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
  ](
      rep1: Rep1
    , rep2: Rep2
    , setter: => PropertyDataType2[
        Data1
      , Data2
    ]
  ): CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ] = {
    new CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ](
        rep1 = rep1
      , rep2 = rep2
    )
  };
  def defineDataType[
      Data1
    , Data2
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
  ): PropertyDataType2[
      Data1
    , Data2
  ] = {
    new PropertyDataType2[
        Data1
      , Data2
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
  ): CaseClassRepMapper2[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
  ] = {
    new CaseClassRepMapper2[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , setter: => PropertyDataType3[
        Data1
      , Data2
      , Data3
    ]
  ): CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ] = {
    new CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
  ): PropertyDataType3[
      Data1
    , Data2
    , Data3
  ] = {
    new PropertyDataType3[
        Data1
      , Data2
      , Data3
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
  ): CaseClassRepMapper3[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
  ] = {
    new CaseClassRepMapper3[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , setter: => PropertyDataType4[
        Data1
      , Data2
      , Data3
      , Data4
    ]
  ): CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ] = {
    new CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
  ): PropertyDataType4[
      Data1
    , Data2
    , Data3
    , Data4
  ] = {
    new PropertyDataType4[
        Data1
      , Data2
      , Data3
      , Data4
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
  ): CaseClassRepMapper4[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
  ] = {
    new CaseClassRepMapper4[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , setter: => PropertyDataType5[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
    ]
  ): CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ] = {
    new CaseClassRepMapper5[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
  ): PropertyDataType5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ] = {
    new PropertyDataType5[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
  ): CaseClassRepMapper5[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
  ] = {
    new CaseClassRepMapper5[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , setter: => PropertyDataType6[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
    ]
  ): CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ] = {
    new CaseClassRepMapper6[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
  ): PropertyDataType6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ] = {
    new PropertyDataType6[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
  ): CaseClassRepMapper6[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
  ] = {
    new CaseClassRepMapper6[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , setter: => PropertyDataType7[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
    ]
  ): CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ] = {
    new CaseClassRepMapper7[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
    , property7: PropertyType[Data7]
  ): PropertyDataType7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ] = {
    new PropertyDataType7[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
    , Rep7 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
  ): CaseClassRepMapper7[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
    , Rep7
    , Rep7#TempData
  ] = {
    new CaseClassRepMapper7[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
      , Rep7
      , Rep7#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , setter: => PropertyDataType8[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
    ]
  ): CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ] = {
    new CaseClassRepMapper8[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
    , property7: PropertyType[Data7]
    , property8: PropertyType[Data8]
  ): PropertyDataType8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ] = {
    new PropertyDataType8[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
    , Rep7 <: DataGenTag
    , Rep8 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
  ): CaseClassRepMapper8[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
    , Rep7
    , Rep7#TempData
    , Rep8
    , Rep8#TempData
  ] = {
    new CaseClassRepMapper8[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
      , Rep7
      , Rep7#TempData
      , Rep8
      , Rep8#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , setter: => PropertyDataType9[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
    ]
  ): CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ] = {
    new CaseClassRepMapper9[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
    , property7: PropertyType[Data7]
    , property8: PropertyType[Data8]
    , property9: PropertyType[Data9]
  ): PropertyDataType9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ] = {
    new PropertyDataType9[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
    , Rep7 <: DataGenTag
    , Rep8 <: DataGenTag
    , Rep9 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
  ): CaseClassRepMapper9[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
    , Rep7
    , Rep7#TempData
    , Rep8
    , Rep8#TempData
    , Rep9
    , Rep9#TempData
  ] = {
    new CaseClassRepMapper9[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
      , Rep7
      , Rep7#TempData
      , Rep8
      , Rep8#TempData
      , Rep9
      , Rep9#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
    , setter: => PropertyDataType10[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
    ]
  ): CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ] = {
    new CaseClassRepMapper10[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
    , property7: PropertyType[Data7]
    , property8: PropertyType[Data8]
    , property9: PropertyType[Data9]
    , property10: PropertyType[Data10]
  ): PropertyDataType10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ] = {
    new PropertyDataType10[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
    , Rep7 <: DataGenTag
    , Rep8 <: DataGenTag
    , Rep9 <: DataGenTag
    , Rep10 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
  ): CaseClassRepMapper10[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
    , Rep7
    , Rep7#TempData
    , Rep8
    , Rep8#TempData
    , Rep9
    , Rep9#TempData
    , Rep10
    , Rep10#TempData
  ] = {
    new CaseClassRepMapper10[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
      , Rep7
      , Rep7#TempData
      , Rep8
      , Rep8#TempData
      , Rep9
      , Rep9#TempData
      , Rep10
      , Rep10#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
    , rep11: Rep11
    , setter: => PropertyDataType11[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
      , Data11
    ]
  ): CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ] = {
    new CaseClassRepMapper11[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
      , rep11 = rep11
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
    , property7: PropertyType[Data7]
    , property8: PropertyType[Data8]
    , property9: PropertyType[Data9]
    , property10: PropertyType[Data10]
    , property11: PropertyType[Data11]
  ): PropertyDataType11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ] = {
    new PropertyDataType11[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
      , Data11
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
    , Rep7 <: DataGenTag
    , Rep8 <: DataGenTag
    , Rep9 <: DataGenTag
    , Rep10 <: DataGenTag
    , Rep11 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
    , rep11: Rep11
  ): CaseClassRepMapper11[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
    , Rep7
    , Rep7#TempData
    , Rep8
    , Rep8#TempData
    , Rep9
    , Rep9#TempData
    , Rep10
    , Rep10#TempData
    , Rep11
    , Rep11#TempData
  ] = {
    new CaseClassRepMapper11[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
      , Rep7
      , Rep7#TempData
      , Rep8
      , Rep8#TempData
      , Rep9
      , Rep9#TempData
      , Rep10
      , Rep10#TempData
      , Rep11
      , Rep11#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
      , rep11 = rep11
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
    , rep11: Rep11
    , rep12: Rep12
    , setter: => PropertyDataType12[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
      , Data11
      , Data12
    ]
  ): CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ] = {
    new CaseClassRepMapper12[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
      , rep11 = rep11
      , rep12 = rep12
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
    , property7: PropertyType[Data7]
    , property8: PropertyType[Data8]
    , property9: PropertyType[Data9]
    , property10: PropertyType[Data10]
    , property11: PropertyType[Data11]
    , property12: PropertyType[Data12]
  ): PropertyDataType12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ] = {
    new PropertyDataType12[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
      , Data11
      , Data12
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
    , Rep7 <: DataGenTag
    , Rep8 <: DataGenTag
    , Rep9 <: DataGenTag
    , Rep10 <: DataGenTag
    , Rep11 <: DataGenTag
    , Rep12 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
    , rep11: Rep11
    , rep12: Rep12
  ): CaseClassRepMapper12[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
    , Rep7
    , Rep7#TempData
    , Rep8
    , Rep8#TempData
    , Rep9
    , Rep9#TempData
    , Rep10
    , Rep10#TempData
    , Rep11
    , Rep11#TempData
    , Rep12
    , Rep12#TempData
  ] = {
    new CaseClassRepMapper12[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
      , Rep7
      , Rep7#TempData
      , Rep8
      , Rep8#TempData
      , Rep9
      , Rep9#TempData
      , Rep10
      , Rep10#TempData
      , Rep11
      , Rep11#TempData
      , Rep12
      , Rep12#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
      , rep11 = rep11
      , rep12 = rep12
    )
  };
  def withRep[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
    , Rep13
    , Data13
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
    , rep11: Rep11
    , rep12: Rep12
    , rep13: Rep13
    , setter: => PropertyDataType13[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
      , Data11
      , Data12
      , Data13
    ]
  ): CaseClassRepMapper13[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
    , Rep13
    , Data13
  ] = {
    new CaseClassRepMapper13[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
      , Rep13
      , Data13
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
      , rep11 = rep11
      , rep12 = rep12
      , rep13 = rep13
    )
  };
  def defineDataType[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ](
      property1: PropertyType[Data1]
    , property2: PropertyType[Data2]
    , property3: PropertyType[Data3]
    , property4: PropertyType[Data4]
    , property5: PropertyType[Data5]
    , property6: PropertyType[Data6]
    , property7: PropertyType[Data7]
    , property8: PropertyType[Data8]
    , property9: PropertyType[Data9]
    , property10: PropertyType[Data10]
    , property11: PropertyType[Data11]
    , property12: PropertyType[Data12]
    , property13: PropertyType[Data13]
  ): PropertyDataType13[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ] = {
    new PropertyDataType13[
        Data1
      , Data2
      , Data3
      , Data4
      , Data5
      , Data6
      , Data7
      , Data8
      , Data9
      , Data10
      , Data11
      , Data12
      , Data13
    ]
    ???
  };
  def mergeRep[
      Rep1 <: DataGenTag
    , Rep2 <: DataGenTag
    , Rep3 <: DataGenTag
    , Rep4 <: DataGenTag
    , Rep5 <: DataGenTag
    , Rep6 <: DataGenTag
    , Rep7 <: DataGenTag
    , Rep8 <: DataGenTag
    , Rep9 <: DataGenTag
    , Rep10 <: DataGenTag
    , Rep11 <: DataGenTag
    , Rep12 <: DataGenTag
    , Rep13 <: DataGenTag
  ](
      rep1: Rep1
    , rep2: Rep2
    , rep3: Rep3
    , rep4: Rep4
    , rep5: Rep5
    , rep6: Rep6
    , rep7: Rep7
    , rep8: Rep8
    , rep9: Rep9
    , rep10: Rep10
    , rep11: Rep11
    , rep12: Rep12
    , rep13: Rep13
  ): CaseClassRepMapper13[
      Rep1
    , Rep1#TempData
    , Rep2
    , Rep2#TempData
    , Rep3
    , Rep3#TempData
    , Rep4
    , Rep4#TempData
    , Rep5
    , Rep5#TempData
    , Rep6
    , Rep6#TempData
    , Rep7
    , Rep7#TempData
    , Rep8
    , Rep8#TempData
    , Rep9
    , Rep9#TempData
    , Rep10
    , Rep10#TempData
    , Rep11
    , Rep11#TempData
    , Rep12
    , Rep12#TempData
    , Rep13
    , Rep13#TempData
  ] = {
    new CaseClassRepMapper13[
        Rep1
      , Rep1#TempData
      , Rep2
      , Rep2#TempData
      , Rep3
      , Rep3#TempData
      , Rep4
      , Rep4#TempData
      , Rep5
      , Rep5#TempData
      , Rep6
      , Rep6#TempData
      , Rep7
      , Rep7#TempData
      , Rep8
      , Rep8#TempData
      , Rep9
      , Rep9#TempData
      , Rep10
      , Rep10#TempData
      , Rep11
      , Rep11#TempData
      , Rep12
      , Rep12#TempData
      , Rep13
      , Rep13#TempData
    ](
        rep1 = rep1
      , rep2 = rep2
      , rep3 = rep3
      , rep4 = rep4
      , rep5 = rep5
      , rep6 = rep6
      , rep7 = rep7
      , rep8 = rep8
      , rep9 = rep9
      , rep10 = rep10
      , rep11 = rep11
      , rep12 = rep12
      , rep13 = rep13
    )
  };
  def withData[
      Data1
  ](
      data1: Data1
  ): CaseClassDataMapper1[
      Data1
  ] = {
    new CaseClassDataMapper1(
        data1 = data1
    )
  };
  def withData[
      Data1
    , Data2
  ](
      data1: Data1
    , data2: Data2
  ): CaseClassDataMapper2[
      Data1
    , Data2
  ] = {
    new CaseClassDataMapper2(
        data1 = data1
      , data2 = data2
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
  ): CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ] = {
    new CaseClassDataMapper3(
        data1 = data1
      , data2 = data2
      , data3 = data3
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
  ): CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ] = {
    new CaseClassDataMapper4(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
  ): CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ] = {
    new CaseClassDataMapper5(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
  ): CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ] = {
    new CaseClassDataMapper6(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
  ): CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ] = {
    new CaseClassDataMapper7(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
  ): CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ] = {
    new CaseClassDataMapper8(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
  ): CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ] = {
    new CaseClassDataMapper9(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
    , data10: Data10
  ): CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ] = {
    new CaseClassDataMapper10(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
      , data10 = data10
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
    , data10: Data10
    , data11: Data11
  ): CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ] = {
    new CaseClassDataMapper11(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
      , data10 = data10
      , data11 = data11
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
    , data10: Data10
    , data11: Data11
    , data12: Data12
  ): CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ] = {
    new CaseClassDataMapper12(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
      , data10 = data10
      , data11 = data11
      , data12 = data12
    )
  };
  def withData[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ](
      data1: Data1
    , data2: Data2
    , data3: Data3
    , data4: Data4
    , data5: Data5
    , data6: Data6
    , data7: Data7
    , data8: Data8
    , data9: Data9
    , data10: Data10
    , data11: Data11
    , data12: Data12
    , data13: Data13
  ): CaseClassDataMapper13[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ] = {
    new CaseClassDataMapper13(
        data1 = data1
      , data2 = data2
      , data3 = data3
      , data4 = data4
      , data5 = data5
      , data6 = data6
      , data7 = data7
      , data8 = data8
      , data9 = data9
      , data10 = data10
      , data11 = data11
      , data12 = data12
      , data13 = data13
    )
  };
};
class CaseClassRepMapper1[
    Rep1
  , Data1
](
    val rep1: Rep1
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper1. You can replace selfInfo with\n" +
      "debug1(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper1[
      Rep1
    , Data1
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug1(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug1(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug1(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug1(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug1(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug1(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper1[
      Data1
  ];
};
class PropertyDataType1[
    Data1
]
class CaseClassDataMapper1[
    Data1
](
    val data1: Data1
);
object CaseClassRepMapper1 {
  implicit def caseClassHelper1EncoderGen[Rep1, Data1, Target1, RepCol, DataCol](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ], CaseClassRepMapper1[
      Target1
    , Data1
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper1[
        Rep1
      , Data1
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper1[
          Target1
        , Data1
      ];
      override type Data = CaseClassDataMapper1[
          Data1
      ];
      override def wrapRep(
          base: => CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        new CaseClassRepMapper1[
            Target1
          , Data1
        ](
            rep1 = shape1.wrapRep(base.rep1)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep;
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper1[
            Data1
        ]
        , rep: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldData: DataCol
      ): DataCol = {
        val data2 = oldData;
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper1DecoderGen[Rep1, Data1, Target1, RepCol, DataCol](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ], CaseClassRepMapper1[
      Target1
    , Data1
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper1[
        Rep1
      , Data1
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper1[
          Target1
        , Data1
      ];
      override type Data = CaseClassDataMapper1[
          Data1
      ];
      override def wrapRep(
          base: => CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        new CaseClassRepMapper1[
            Target1
          , Data1
        ](
            rep1 = shape1.wrapRep(base.rep1)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep;
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper1[
          Data1
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        SplitData(
            current = new CaseClassDataMapper1(
              data1 = split1.current
          )
          , left = split1.left
        )
      };
    }
  };
  implicit def caseClassHelper1FormatterGen[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper1[
      Rep1
    , Data1
  ], CaseClassDataMapper1[
      Data1
  ], CaseClassRepMapper1[
      Target1
    , Data1
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper1[
        Rep1
      , Data1
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper1[
          Target1
        , Data1
      ];
      override type Data = CaseClassDataMapper1[
          Data1
      ];
      override def wrapRep(
          base: => CaseClassRepMapper1[
            Rep1
          , Data1
        ]
      ): CaseClassRepMapper1[
          Target1
        , Data1
      ] = {
        new CaseClassRepMapper1[
            Target1
          , Data1
        ](
            rep1 = shape1.wrapRep(base.rep1)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep2 = oldRep;
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper1[
            Data1
        ]
        , rep: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data2 = oldData;
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper1[
            Target1
          , Data1
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper1[
          Data1
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        SplitData(
            current = new CaseClassDataMapper1(
              data1 = split1.current
          )
          , left = split1.left
        )
      };
    }
  };
};
class CaseClassRepMapper2[
    Rep1
  , Data1
  , Rep2
  , Data2
](
    val rep1: Rep1
  , val rep2: Rep2
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper2. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug2(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper2[
      Data1
    , Data2
  ];
};
class PropertyDataType2[
    Data1
  , Data2
]
class CaseClassDataMapper2[
    Data1
  , Data2
](
    val data1: Data1
  , val data2: Data2
);
object CaseClassRepMapper2 {
  implicit def caseClassHelper2EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ], CaseClassRepMapper2[
      Target1
    , Data1
    , Target2
    , Data2
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ];
      override type Data = CaseClassDataMapper2[
          Data1
        , Data2
      ];
      override def wrapRep(
          base: => CaseClassRepMapper2[
            Rep1
          , Data1
          , Rep2
          , Data2
        ]
      ): CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ] = {
        new CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep;
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper2[
            Data1
          , Data2
        ]
        , rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldData: DataCol
      ): DataCol = {
        val data3 = oldData;
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper2DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, DataCol](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ], CaseClassRepMapper2[
      Target1
    , Data1
    , Target2
    , Data2
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ];
      override type Data = CaseClassDataMapper2[
          Data1
        , Data2
      ];
      override def wrapRep(
          base: => CaseClassRepMapper2[
            Rep1
          , Data1
          , Rep2
          , Data2
        ]
      ): CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ] = {
        new CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep;
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper2[
          Data1
        , Data2
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        SplitData(
            current = new CaseClassDataMapper2(
              data1 = split1.current
            , data2 = split2.current
          )
          , left = split2.left
        )
      };
    }
  };
  implicit def caseClassHelper2FormatterGen[Rep1, Data1, Target1, Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper2[
      Rep1
    , Data1
    , Rep2
    , Data2
  ], CaseClassDataMapper2[
      Data1
    , Data2
  ], CaseClassRepMapper2[
      Target1
    , Data1
    , Target2
    , Data2
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper2[
        Rep1
      , Data1
      , Rep2
      , Data2
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ];
      override type Data = CaseClassDataMapper2[
          Data1
        , Data2
      ];
      override def wrapRep(
          base: => CaseClassRepMapper2[
            Rep1
          , Data1
          , Rep2
          , Data2
        ]
      ): CaseClassRepMapper2[
          Target1
        , Data1
        , Target2
        , Data2
      ] = {
        new CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep3 = oldRep;
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper2[
            Data1
          , Data2
        ]
        , rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data3 = oldData;
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper2[
            Target1
          , Data1
          , Target2
          , Data2
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper2[
          Data1
        , Data2
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        SplitData(
            current = new CaseClassDataMapper2(
              data1 = split1.current
            , data2 = split2.current
          )
          , left = split2.left
        )
      };
    }
  };
};
class CaseClassRepMapper3[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper3. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug3(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ];
};
class PropertyDataType3[
    Data1
  , Data2
  , Data3
]
class CaseClassDataMapper3[
    Data1
  , Data2
  , Data3
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
);
object CaseClassRepMapper3 {
  implicit def caseClassHelper3EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ], CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ], CaseClassRepMapper3[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ];
      override type Data = CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ];
      override def wrapRep(
          base: => CaseClassRepMapper3[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
        ]
      ): CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ] = {
        new CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep4 = oldRep;
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper3[
            Data1
          , Data2
          , Data3
        ]
        , rep: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldData: DataCol
      ): DataCol = {
        val data4 = oldData;
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper3DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, DataCol](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ], CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ], CaseClassRepMapper3[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ];
      override type Data = CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ];
      override def wrapRep(
          base: => CaseClassRepMapper3[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
        ]
      ): CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ] = {
        new CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep4 = oldRep;
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        SplitData(
            current = new CaseClassDataMapper3(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
          )
          , left = split3.left
        )
      };
    }
  };
  implicit def caseClassHelper3FormatterGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper3[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
  ], CaseClassDataMapper3[
      Data1
    , Data2
    , Data3
  ], CaseClassRepMapper3[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper3[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ];
      override type Data = CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ];
      override def wrapRep(
          base: => CaseClassRepMapper3[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
        ]
      ): CaseClassRepMapper3[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
      ] = {
        new CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep4 = oldRep;
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper3[
            Data1
          , Data2
          , Data3
        ]
        , rep: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data4 = oldData;
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper3[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper3[
          Data1
        , Data2
        , Data3
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        SplitData(
            current = new CaseClassDataMapper3(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
          )
          , left = split3.left
        )
      };
    }
  };
};
class CaseClassRepMapper4[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper4. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug4(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ];
};
class PropertyDataType4[
    Data1
  , Data2
  , Data3
  , Data4
]
class CaseClassDataMapper4[
    Data1
  , Data2
  , Data3
  , Data4
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
);
object CaseClassRepMapper4 {
  implicit def caseClassHelper4EncoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ], CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ], CaseClassRepMapper4[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ];
      override type Data = CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ];
      override def wrapRep(
          base: => CaseClassRepMapper4[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
        ]
      ): CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ] = {
        new CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep5 = oldRep;
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper4[
            Data1
          , Data2
          , Data3
          , Data4
        ]
        , rep: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldData: DataCol
      ): DataCol = {
        val data5 = oldData;
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper4DecoderGen[Rep1, Data1, Target1, Rep2, Data2, Target2, Rep3, Data3, Target3, Rep4, Data4, Target4, RepCol, DataCol](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ], CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ], CaseClassRepMapper4[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ];
      override type Data = CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ];
      override def wrapRep(
          base: => CaseClassRepMapper4[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
        ]
      ): CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ] = {
        new CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep5 = oldRep;
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        SplitData(
            current = new CaseClassDataMapper4(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
          )
          , left = split4.left
        )
      };
    }
  };
  implicit def caseClassHelper4FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper4[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
  ], CaseClassDataMapper4[
      Data1
    , Data2
    , Data3
    , Data4
  ], CaseClassRepMapper4[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper4[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ];
      override type Data = CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ];
      override def wrapRep(
          base: => CaseClassRepMapper4[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
        ]
      ): CaseClassRepMapper4[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
      ] = {
        new CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep5 = oldRep;
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper4[
            Data1
          , Data2
          , Data3
          , Data4
        ]
        , rep: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data5 = oldData;
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper4[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper4[
          Data1
        , Data2
        , Data3
        , Data4
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        SplitData(
            current = new CaseClassDataMapper4(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
          )
          , left = split4.left
        )
      };
    }
  };
};
class CaseClassRepMapper5[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper5. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug5(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ];
};
class PropertyDataType5[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
]
class CaseClassDataMapper5[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
);
object CaseClassRepMapper5 {
  implicit def caseClassHelper5EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ], CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ], CaseClassRepMapper5[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper5[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ];
      override type Data = CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ];
      override def wrapRep(
          base: => CaseClassRepMapper5[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
        ]
      ): CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ] = {
        new CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep6 = oldRep;
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper5[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
        ]
        , rep: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ]
        , oldData: DataCol
      ): DataCol = {
        val data6 = oldData;
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper5DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ], CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ], CaseClassRepMapper5[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper5[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ];
      override type Data = CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ];
      override def wrapRep(
          base: => CaseClassRepMapper5[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
        ]
      ): CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ] = {
        new CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep6 = oldRep;
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        SplitData(
            current = new CaseClassDataMapper5(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
          )
          , left = split5.left
        )
      };
    }
  };
  implicit def caseClassHelper5FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper5[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
  ], CaseClassDataMapper5[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
  ], CaseClassRepMapper5[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper5[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ];
      override type Data = CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ];
      override def wrapRep(
          base: => CaseClassRepMapper5[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
        ]
      ): CaseClassRepMapper5[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
      ] = {
        new CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep6 = oldRep;
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper5[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
        ]
        , rep: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data6 = oldData;
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper5[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper5[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        SplitData(
            current = new CaseClassDataMapper5(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
          )
          , left = split5.left
        )
      };
    }
  };
};
class CaseClassRepMapper6[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper6. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug6(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ];
};
class PropertyDataType6[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
]
class CaseClassDataMapper6[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
);
object CaseClassRepMapper6 {
  implicit def caseClassHelper6EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ], CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ], CaseClassRepMapper6[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper6[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ];
      override type Data = CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ];
      override def wrapRep(
          base: => CaseClassRepMapper6[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
        ]
      ): CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ] = {
        new CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep7 = oldRep;
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper6[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
        ]
        , rep: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ]
        , oldData: DataCol
      ): DataCol = {
        val data7 = oldData;
        val data6 = shape6.buildData(data.data6, rep.rep6, data7);
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper6DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ], CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ], CaseClassRepMapper6[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper6[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ];
      override type Data = CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ];
      override def wrapRep(
          base: => CaseClassRepMapper6[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
        ]
      ): CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ] = {
        new CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep7 = oldRep;
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        SplitData(
            current = new CaseClassDataMapper6(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
          )
          , left = split6.left
        )
      };
    }
  };
  implicit def caseClassHelper6FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper6[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
  ], CaseClassDataMapper6[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
  ], CaseClassRepMapper6[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper6[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ];
      override type Data = CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ];
      override def wrapRep(
          base: => CaseClassRepMapper6[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
        ]
      ): CaseClassRepMapper6[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
      ] = {
        new CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep7 = oldRep;
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper6[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
        ]
        , rep: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data7 = oldData;
        val data6 = shape6.buildData(data.data6, rep.rep6, data7);
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper6[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper6[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        SplitData(
            current = new CaseClassDataMapper6(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
          )
          , left = split6.left
        )
      };
    }
  };
};
class CaseClassRepMapper7[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper7. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\ndebug7(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape7: EncoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape7: DecoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
    , debugShape7: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug7(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug7(context)`
      , `rep7.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ];
};
class PropertyDataType7[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
]
class CaseClassDataMapper7[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
);
object CaseClassRepMapper7 {
  implicit def caseClassHelper7EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ], CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ], CaseClassRepMapper7[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper7[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ];
      override type Data = CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ];
      override def wrapRep(
          base: => CaseClassRepMapper7[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
        ]
      ): CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ] = {
        new CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep8 = oldRep;
        val rep7 = shape7.buildRep(base.rep7, rep8);
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper7[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
        ]
        , rep: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ]
        , oldData: DataCol
      ): DataCol = {
        val data8 = oldData;
        val data7 = shape7.buildData(data.data7, rep.rep7, data8);
        val data6 = shape6.buildData(data.data6, rep.rep6, data7);
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper7DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ], CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ], CaseClassRepMapper7[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper7[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ];
      override type Data = CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ];
      override def wrapRep(
          base: => CaseClassRepMapper7[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
        ]
      ): CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ] = {
        new CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep8 = oldRep;
        val rep7 = shape7.buildRep(base.rep7, rep8);
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        SplitData(
            current = new CaseClassDataMapper7(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
          )
          , left = split7.left
        )
      };
    }
  };
  implicit def caseClassHelper7FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper7[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
  ], CaseClassDataMapper7[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
  ], CaseClassRepMapper7[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper7[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ];
      override type Data = CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ];
      override def wrapRep(
          base: => CaseClassRepMapper7[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
        ]
      ): CaseClassRepMapper7[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
      ] = {
        new CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep8 = oldRep;
        val rep7 = shape7.buildRep(base.rep7, rep8);
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper7[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
        ]
        , rep: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data8 = oldData;
        val data7 = shape7.buildData(data.data7, rep.rep7, data8);
        val data6 = shape6.buildData(data.data6, rep.rep6, data7);
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper7[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper7[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        SplitData(
            current = new CaseClassDataMapper7(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
          )
          , left = split7.left
        )
      };
    }
  };
};
class CaseClassRepMapper8[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
  , val rep8: Rep8
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper8. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\ndebug7(context)\ndebug8(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape7: EncoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape8: EncoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape7: DecoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape8: DecoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape7: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
    , debugShape8: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug8(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug7(context)`
      , `rep7.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug8(context)`
      , `rep8.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ];
};
class PropertyDataType8[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
]
class CaseClassDataMapper8[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
);
object CaseClassRepMapper8 {
  implicit def caseClassHelper8EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ], CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ], CaseClassRepMapper8[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper8[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ];
      override type Data = CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ];
      override def wrapRep(
          base: => CaseClassRepMapper8[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
        ]
      ): CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ] = {
        new CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep9 = oldRep;
        val rep8 = shape8.buildRep(base.rep8, rep9);
        val rep7 = shape7.buildRep(base.rep7, rep8);
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper8[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
        ]
        , rep: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ]
        , oldData: DataCol
      ): DataCol = {
        val data9 = oldData;
        val data8 = shape8.buildData(data.data8, rep.rep8, data9);
        val data7 = shape7.buildData(data.data7, rep.rep7, data8);
        val data6 = shape6.buildData(data.data6, rep.rep6, data7);
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper8DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ], CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ], CaseClassRepMapper8[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper8[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ];
      override type Data = CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ];
      override def wrapRep(
          base: => CaseClassRepMapper8[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
        ]
      ): CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ] = {
        new CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep9 = oldRep;
        val rep8 = shape8.buildRep(base.rep8, rep9);
        val rep7 = shape7.buildRep(base.rep7, rep8);
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        SplitData(
            current = new CaseClassDataMapper8(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
          )
          , left = split8.left
        )
      };
    }
  };
  implicit def caseClassHelper8FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
    , shape8: FormatterShape.Aux[Rep8, Data8, Target8, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper8[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
  ], CaseClassDataMapper8[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
  ], CaseClassRepMapper8[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper8[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ];
      override type Data = CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ];
      override def wrapRep(
          base: => CaseClassRepMapper8[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
        ]
      ): CaseClassRepMapper8[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
      ] = {
        new CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep9 = oldRep;
        val rep8 = shape8.buildRep(base.rep8, rep9);
        val rep7 = shape7.buildRep(base.rep7, rep8);
        val rep6 = shape6.buildRep(base.rep6, rep7);
        val rep5 = shape5.buildRep(base.rep5, rep6);
        val rep4 = shape4.buildRep(base.rep4, rep5);
        val rep3 = shape3.buildRep(base.rep3, rep4);
        val rep2 = shape2.buildRep(base.rep2, rep3);
        val rep1 = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper8[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
        ]
        , rep: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data9 = oldData;
        val data8 = shape8.buildData(data.data8, rep.rep8, data9);
        val data7 = shape7.buildData(data.data7, rep.rep7, data8);
        val data6 = shape6.buildData(data.data6, rep.rep6, data7);
        val data5 = shape5.buildData(data.data5, rep.rep5, data6);
        val data4 = shape4.buildData(data.data4, rep.rep4, data5);
        val data3 = shape3.buildData(data.data3, rep.rep3, data4);
        val data2 = shape2.buildData(data.data2, rep.rep2, data3);
        val data1 = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper8[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper8[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        SplitData(
            current = new CaseClassDataMapper8(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
          )
          , left = split8.left
        )
      };
    }
  };
};
class CaseClassRepMapper9[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
  , val rep8: Rep8
  , val rep9: Rep9
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper9. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\ndebug7(context)\ndebug8(context)\ndebug9(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape7: EncoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape8: EncoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape9: EncoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape7: DecoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape8: DecoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape9: DecoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape7: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape8: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
    , debugShape9: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug9(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug7(context)`
      , `rep7.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug8(context)`
      , `rep8.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug9(context)`
      , `rep9.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ];
};
class PropertyDataType9[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
]
class CaseClassDataMapper9[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
);
object CaseClassRepMapper9 {
  implicit def caseClassHelper9EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ], CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ], CaseClassRepMapper9[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper9[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ];
      override type Data = CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ];
      override def wrapRep(
          base: => CaseClassRepMapper9[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
        ]
      ): CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ] = {
        new CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep10 = oldRep;
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper9[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
        ]
        , rep: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ]
        , oldData: DataCol
      ): DataCol = {
        val data10 = oldData;
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper9DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ], CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ], CaseClassRepMapper9[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper9[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ];
      override type Data = CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ];
      override def wrapRep(
          base: => CaseClassRepMapper9[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
        ]
      ): CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ] = {
        new CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep10 = oldRep;
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        SplitData(
            current = new CaseClassDataMapper9(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
          )
          , left = split9.left
        )
      };
    }
  };
  implicit def caseClassHelper9FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
    , shape8: FormatterShape.Aux[Rep8, Data8, Target8, RepCol, EncoderDataCol, DecoderDataCol]
    , shape9: FormatterShape.Aux[Rep9, Data9, Target9, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper9[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
  ], CaseClassDataMapper9[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
  ], CaseClassRepMapper9[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper9[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ];
      override type Data = CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ];
      override def wrapRep(
          base: => CaseClassRepMapper9[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
        ]
      ): CaseClassRepMapper9[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
      ] = {
        new CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep10 = oldRep;
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper9[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
        ]
        , rep: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data10 = oldData;
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper9[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper9[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        SplitData(
            current = new CaseClassDataMapper9(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
          )
          , left = split9.left
        )
      };
    }
  };
};
class CaseClassRepMapper10[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
  , Rep10
  , Data10
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
  , val rep8: Rep8
  , val rep9: Rep9
  , val rep10: Rep10
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper10. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\ndebug7(context)\ndebug8(context)\ndebug9(context)\ndebug10(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape7: EncoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape8: EncoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape9: EncoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape10: EncoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape7: DecoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape8: DecoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape9: DecoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape10: DecoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape7: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape8: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape9: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
    , debugShape10: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug10(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug7(context)`
      , `rep7.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug8(context)`
      , `rep8.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug9(context)`
      , `rep9.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug10(context)`
      , `rep10.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ];
};
class PropertyDataType10[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
]
class CaseClassDataMapper10[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
  , val data10: Data10
);
object CaseClassRepMapper10 {
  implicit def caseClassHelper10EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ], CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ], CaseClassRepMapper10[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper10[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ];
      override type Data = CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ];
      override def wrapRep(
          base: => CaseClassRepMapper10[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
        ]
      ): CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ] = {
        new CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep11 = oldRep;
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper10[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
        ]
        , rep: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ]
        , oldData: DataCol
      ): DataCol = {
        val data11 = oldData;
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper10DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ], CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ], CaseClassRepMapper10[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper10[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ];
      override type Data = CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ];
      override def wrapRep(
          base: => CaseClassRepMapper10[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
        ]
      ): CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ] = {
        new CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep11 = oldRep;
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        SplitData(
            current = new CaseClassDataMapper10(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
          )
          , left = split10.left
        )
      };
    }
  };
  implicit def caseClassHelper10FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
    , shape8: FormatterShape.Aux[Rep8, Data8, Target8, RepCol, EncoderDataCol, DecoderDataCol]
    , shape9: FormatterShape.Aux[Rep9, Data9, Target9, RepCol, EncoderDataCol, DecoderDataCol]
    , shape10: FormatterShape.Aux[Rep10, Data10, Target10, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper10[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
  ], CaseClassDataMapper10[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
  ], CaseClassRepMapper10[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper10[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ];
      override type Data = CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ];
      override def wrapRep(
          base: => CaseClassRepMapper10[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
        ]
      ): CaseClassRepMapper10[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
      ] = {
        new CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep11 = oldRep;
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper10[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
        ]
        , rep: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data11 = oldData;
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper10[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper10[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        SplitData(
            current = new CaseClassDataMapper10(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
          )
          , left = split10.left
        )
      };
    }
  };
};
class CaseClassRepMapper11[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
  , Rep10
  , Data10
  , Rep11
  , Data11
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
  , val rep8: Rep8
  , val rep9: Rep9
  , val rep10: Rep10
  , val rep11: Rep11
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper11. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\ndebug7(context)\ndebug8(context)\ndebug9(context)\ndebug10(context)\ndebug11(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape7: EncoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape8: EncoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape9: EncoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape10: EncoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape11: EncoderDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , DataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape7: DecoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape8: DecoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape9: DecoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape10: DecoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape11: DecoderDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , DataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape7: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape8: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape9: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape10: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
    , debugShape11: FormatterDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug11(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug7(context)`
      , `rep7.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug8(context)`
      , `rep8.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug9(context)`
      , `rep9.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug10(context)`
      , `rep10.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep11, Data11, Target, RepCol, DataCol, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data11, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data11, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep11, Data11, Target, RepCol, DataCol, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data11, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data11, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep11
      , Data11
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `11`
      , `debug11(context)`
      , `rep11.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data11, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data11, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ];
};
class PropertyDataType11[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
]
class CaseClassDataMapper11[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
  , val data10: Data10
  , val data11: Data11
);
object CaseClassRepMapper11 {
  implicit def caseClassHelper11EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
    , shape11: EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ], CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ], CaseClassRepMapper11[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper11[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ];
      override type Data = CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ];
      override def wrapRep(
          base: => CaseClassRepMapper11[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
        ]
      ): CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ] = {
        new CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep12 = oldRep;
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper11[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
        ]
        , rep: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ]
        , oldData: DataCol
      ): DataCol = {
        val data12 = oldData;
        val data11 = shape11.buildData(data.data11, rep.rep11, data12);
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper11DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
    , shape11: DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ], CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ], CaseClassRepMapper11[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper11[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ];
      override type Data = CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ];
      override def wrapRep(
          base: => CaseClassRepMapper11[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
        ]
      ): CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ] = {
        new CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep12 = oldRep;
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        val split11  = shape11.takeData(rep.rep11, split10.left);
        SplitData(
            current = new CaseClassDataMapper11(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
            , data11 = split11.current
          )
          , left = split11.left
        )
      };
    }
  };
  implicit def caseClassHelper11FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
    , shape8: FormatterShape.Aux[Rep8, Data8, Target8, RepCol, EncoderDataCol, DecoderDataCol]
    , shape9: FormatterShape.Aux[Rep9, Data9, Target9, RepCol, EncoderDataCol, DecoderDataCol]
    , shape10: FormatterShape.Aux[Rep10, Data10, Target10, RepCol, EncoderDataCol, DecoderDataCol]
    , shape11: FormatterShape.Aux[Rep11, Data11, Target11, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper11[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
  ], CaseClassDataMapper11[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
  ], CaseClassRepMapper11[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper11[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ];
      override type Data = CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ];
      override def wrapRep(
          base: => CaseClassRepMapper11[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
        ]
      ): CaseClassRepMapper11[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
      ] = {
        new CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep12 = oldRep;
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper11[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
        ]
        , rep: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data12 = oldData;
        val data11 = shape11.buildData(data.data11, rep.rep11, data12);
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper11[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper11[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        val split11  = shape11.takeData(rep.rep11, split10.left);
        SplitData(
            current = new CaseClassDataMapper11(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
            , data11 = split11.current
          )
          , left = split11.left
        )
      };
    }
  };
};
class CaseClassRepMapper12[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
  , Rep10
  , Data10
  , Rep11
  , Data11
  , Rep12
  , Data12
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
  , val rep8: Rep8
  , val rep9: Rep9
  , val rep10: Rep10
  , val rep11: Rep11
  , val rep12: Rep12
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper12. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\ndebug7(context)\ndebug8(context)\ndebug9(context)\ndebug10(context)\ndebug11(context)\ndebug12(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`, `12`, Target12, `rep12.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape7: EncoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape8: EncoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape9: EncoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape10: EncoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape11: EncoderDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , DataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape12: EncoderDebugShape.Aux[
        Rep12
      , Data12
      , Target12
      , RepCol
      , DataCol
      , `12`
      , `debug(context)`
      , `rep12.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`, `12`, Target12, `rep12.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape7: DecoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape8: DecoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape9: DecoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape10: DecoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape11: DecoderDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , DataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape12: DecoderDebugShape.Aux[
        Rep12
      , Data12
      , Target12
      , RepCol
      , DataCol
      , `12`
      , `debug(context)`
      , `rep12.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`, `12`, Target12, `rep12.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape7: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape8: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape9: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape10: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape11: FormatterDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
    , debugShape12: FormatterDebugShape.Aux[
        Rep12
      , Data12
      , Target12
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `12`
      , `debug(context)`
      , `rep12.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug12(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug7(context)`
      , `rep7.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug8(context)`
      , `rep8.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug9(context)`
      , `rep9.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug10(context)`
      , `rep10.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep11, Data11, Target, RepCol, DataCol, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data11, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data11, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep11, Data11, Target, RepCol, DataCol, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data11, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data11, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep11
      , Data11
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `11`
      , `debug11(context)`
      , `rep11.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data11, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data11, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug12[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep12, Data12, Target, RepCol, DataCol, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data12, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep12);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data12, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug12[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep12, Data12, Target, RepCol, DataCol, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data12, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep12);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data12, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug12[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep12
      , Data12
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `12`
      , `debug12(context)`
      , `rep12.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data12, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep12);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data12, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ];
};
class PropertyDataType12[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
  , Data12
]
class CaseClassDataMapper12[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
  , Data12
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
  , val data10: Data10
  , val data11: Data11
  , val data12: Data12
);
object CaseClassRepMapper12 {
  implicit def caseClassHelper12EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , Rep12
    , Data12
    , Target12
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
    , shape11: EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]
    , shape12: EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ], CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ], CaseClassRepMapper12[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper12[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ];
      override type Data = CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ];
      override def wrapRep(
          base: => CaseClassRepMapper12[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
        ]
      ): CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ] = {
        new CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
          , rep12 = shape12.wrapRep(base.rep12)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep13 = oldRep;
        val rep12 = shape12.buildRep(base.rep12, rep13);
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper12[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
          , Data12
        ]
        , rep: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ]
        , oldData: DataCol
      ): DataCol = {
        val data13 = oldData;
        val data12 = shape12.buildData(data.data12, rep.rep12, data13);
        val data11 = shape11.buildData(data.data11, rep.rep11, data12);
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper12DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , Rep12
    , Data12
    , Target12
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
    , shape11: DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]
    , shape12: DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ], CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ], CaseClassRepMapper12[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper12[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ];
      override type Data = CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ];
      override def wrapRep(
          base: => CaseClassRepMapper12[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
        ]
      ): CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ] = {
        new CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
          , rep12 = shape12.wrapRep(base.rep12)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep13 = oldRep;
        val rep12 = shape12.buildRep(base.rep12, rep13);
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        val split11  = shape11.takeData(rep.rep11, split10.left);
        val split12  = shape12.takeData(rep.rep12, split11.left);
        SplitData(
            current = new CaseClassDataMapper12(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
            , data11 = split11.current
            , data12 = split12.current
          )
          , left = split12.left
        )
      };
    }
  };
  implicit def caseClassHelper12FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , Rep12
    , Data12
    , Target12
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
    , shape8: FormatterShape.Aux[Rep8, Data8, Target8, RepCol, EncoderDataCol, DecoderDataCol]
    , shape9: FormatterShape.Aux[Rep9, Data9, Target9, RepCol, EncoderDataCol, DecoderDataCol]
    , shape10: FormatterShape.Aux[Rep10, Data10, Target10, RepCol, EncoderDataCol, DecoderDataCol]
    , shape11: FormatterShape.Aux[Rep11, Data11, Target11, RepCol, EncoderDataCol, DecoderDataCol]
    , shape12: FormatterShape.Aux[Rep12, Data12, Target12, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper12[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
  ], CaseClassDataMapper12[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
  ], CaseClassRepMapper12[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper12[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ];
      override type Data = CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ];
      override def wrapRep(
          base: => CaseClassRepMapper12[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
        ]
      ): CaseClassRepMapper12[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
      ] = {
        new CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
          , rep12 = shape12.wrapRep(base.rep12)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep13 = oldRep;
        val rep12 = shape12.buildRep(base.rep12, rep13);
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper12[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
          , Data12
        ]
        , rep: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data13 = oldData;
        val data12 = shape12.buildData(data.data12, rep.rep12, data13);
        val data11 = shape11.buildData(data.data11, rep.rep11, data12);
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper12[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper12[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        val split11  = shape11.takeData(rep.rep11, split10.left);
        val split12  = shape12.takeData(rep.rep12, split11.left);
        SplitData(
            current = new CaseClassDataMapper12(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
            , data11 = split11.current
            , data12 = split12.current
          )
          , left = split12.left
        )
      };
    }
  };
};
class CaseClassRepMapper13[
    Rep1
  , Data1
  , Rep2
  , Data2
  , Rep3
  , Data3
  , Rep4
  , Data4
  , Rep5
  , Data5
  , Rep6
  , Data6
  , Rep7
  , Data7
  , Rep8
  , Data8
  , Rep9
  , Data9
  , Rep10
  , Data10
  , Rep11
  , Data11
  , Rep12
  , Data12
  , Rep13
  , Data13
](
    val rep1: Rep1
  , val rep2: Rep2
  , val rep3: Rep3
  , val rep4: Rep4
  , val rep5: Rep5
  , val rep6: Rep6
  , val rep7: Rep7
  , val rep8: Rep8
  , val rep9: Rep9
  , val rep10: Rep10
  , val rep11: Rep11
  , val rep12: Rep12
  , val rep13: Rep13
) extends DataGenTag {
  @deprecated(
      "Your are debugging case class mapping rule. This is CaseClassRepMapper13. You can replace selfInfo with\n" +
      "debug1(context)\ndebug2(context)\ndebug3(context)\ndebug4(context)\ndebug5(context)\ndebug6(context)\ndebug7(context)\ndebug8(context)\ndebug9(context)\ndebug10(context)\ndebug11(context)\ndebug12(context)\ndebug13(context)\nto find the missing column."
    , "0.0.1"
  ) def info: CaseClassRepMapper13[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
    , Rep13
    , Data13
  ] = this;
  def debug[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`, `12`, Target12, `rep12.debug(context)`, `13`, Target13, `rep13.debug(context)`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: EncoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape2: EncoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape3: EncoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape4: EncoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape5: EncoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape6: EncoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape7: EncoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape8: EncoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape9: EncoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape10: EncoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape11: EncoderDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , DataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape12: EncoderDebugShape.Aux[
        Rep12
      , Data12
      , Target12
      , RepCol
      , DataCol
      , `12`
      , `debug(context)`
      , `rep12.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape13: EncoderDebugShape.Aux[
        Rep13
      , Data13
      , Target13
      , RepCol
      , DataCol
      , `13`
      , `debug(context)`
      , `rep13.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
  ): EncoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`, `12`, Target12, `rep12.debug(context)`, `13`, Target13, `rep13.debug(context)`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape1: DecoderDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , DataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape2: DecoderDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , DataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape3: DecoderDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , DataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape4: DecoderDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , DataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape5: DecoderDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , DataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape6: DecoderDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , DataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape7: DecoderDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , DataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape8: DecoderDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , DataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape9: DecoderDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , DataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape10: DecoderDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , DataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape11: DecoderDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , DataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape12: DecoderDebugShape.Aux[
        Rep12
      , Data12
      , Target12
      , RepCol
      , DataCol
      , `12`
      , `debug(context)`
      , `rep12.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape13: DecoderDebugShape.Aux[
        Rep13
      , Data13
      , Target13
      , RepCol
      , DataCol
      , `13`
      , `debug(context)`
      , `rep13.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
  ): DecoderWrapperHelper[RepCol, DataCol, Wrapper] = {
    context
  };
  def debug[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], `debug(context)`, `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`, `1`, Target1, `rep1.debug(context)`, `2`, Target2, `rep2.debug(context)`, `3`, Target3, `rep3.debug(context)`, `4`, Target4, `rep4.debug(context)`, `5`, Target5, `rep5.debug(context)`, `6`, Target6, `rep6.debug(context)`, `7`, Target7, `rep7.debug(context)`, `8`, Target8, `rep8.debug(context)`, `9`, Target9, `rep9.debug(context)`, `10`, Target10, `rep10.debug(context)`, `11`, Target11, `rep11.debug(context)`, `12`, Target12, `rep12.debug(context)`, `13`, Target13, `rep13.debug(context)`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape1: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target1
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug(context)`
      , `rep1.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape2: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target2
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug(context)`
      , `rep2.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape3: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target3
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug(context)`
      , `rep3.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape4: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target4
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug(context)`
      , `rep4.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape5: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target5
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug(context)`
      , `rep5.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape6: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target6
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug(context)`
      , `rep6.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape7: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target7
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug(context)`
      , `rep7.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape8: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target8
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug(context)`
      , `rep8.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape9: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target9
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug(context)`
      , `rep9.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape10: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target10
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug(context)`
      , `rep10.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape11: FormatterDebugShape.Aux[
        Rep11
      , Data11
      , Target11
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `11`
      , `debug(context)`
      , `rep11.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape12: FormatterDebugShape.Aux[
        Rep12
      , Data12
      , Target12
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `12`
      , `debug(context)`
      , `rep12.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
    , debugShape13: FormatterDebugShape.Aux[
        Rep13
      , Data13
      , Target13
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `13`
      , `debug(context)`
      , `rep13.debug(context)`
      , `.\nOr you can change debug(context) to debug1(context) - debug13(context) to debug other fields.\n\n`
    ]
  ): FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper] = {
    context
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep1, Data1, Target, RepCol, DataCol, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data1, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data1, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug1[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `1`, `debug1(context)`, `rep1.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep1
      , Data1
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `1`
      , `debug1(context)`
      , `rep1.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep1);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data1, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep2, Data2, Target, RepCol, DataCol, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data2, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data2, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug2[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `2`, `debug2(context)`, `rep2.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep2
      , Data2
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `2`
      , `debug2(context)`
      , `rep2.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep2);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data2, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep3, Data3, Target, RepCol, DataCol, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data3, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data3, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug3[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `3`, `debug3(context)`, `rep3.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep3
      , Data3
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `3`
      , `debug3(context)`
      , `rep3.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep3);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data3, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep4, Data4, Target, RepCol, DataCol, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data4, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data4, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug4[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `4`, `debug4(context)`, `rep4.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep4
      , Data4
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `4`
      , `debug4(context)`
      , `rep4.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep4);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data4, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep5, Data5, Target, RepCol, DataCol, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data5, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data5, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug5[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `5`, `debug5(context)`, `rep5.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep5
      , Data5
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `5`
      , `debug5(context)`
      , `rep5.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep5);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data5, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep6, Data6, Target, RepCol, DataCol, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data6, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data6, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug6[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `6`, `debug6(context)`, `rep6.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep6
      , Data6
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `6`
      , `debug6(context)`
      , `rep6.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep6);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data6, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep7, Data7, Target, RepCol, DataCol, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data7, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data7, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug7[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `7`, `debug7(context)`, `rep7.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep7
      , Data7
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `7`
      , `debug7(context)`
      , `rep7.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep7);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data7, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep8, Data8, Target, RepCol, DataCol, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data8, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data8, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug8[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `8`, `debug8(context)`, `rep8.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep8
      , Data8
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `8`
      , `debug8(context)`
      , `rep8.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep8);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data8, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep9, Data9, Target, RepCol, DataCol, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data9, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data9, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug9[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `9`, `debug9(context)`, `rep9.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep9
      , Data9
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `9`
      , `debug9(context)`
      , `rep9.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep9);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data9, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep10, Data10, Target, RepCol, DataCol, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data10, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data10, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug10[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `10`, `debug10(context)`, `rep10.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep10
      , Data10
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `10`
      , `debug10(context)`
      , `rep10.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep10);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data10, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep11, Data11, Target, RepCol, DataCol, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data11, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data11, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep11, Data11, Target, RepCol, DataCol, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data11, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data11, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug11[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `11`, `debug11(context)`, `rep11.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep11
      , Data11
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `11`
      , `debug11(context)`
      , `rep11.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data11, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep11);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data11, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug12[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep12, Data12, Target, RepCol, DataCol, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data12, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep12);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data12, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug12[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep12, Data12, Target, RepCol, DataCol, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data12, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep12);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data12, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug12[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `12`, `debug12(context)`, `rep12.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep12
      , Data12
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `12`
      , `debug12(context)`
      , `rep12.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data12, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep12);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data12, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug13[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _], Target, `13`, `debug13(context)`, `rep13.debug(context)`, `.\n\n`](
      context: EncoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: EncoderDebugShape.Aux[Rep13, Data13, Target, RepCol, DataCol, `13`, `debug13(context)`, `rep13.debug(context)`, `.\n\n`]
  ): EncoderShapeValue[Data13, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep13);
    val shape1  = debugShape.shape.packed;
    new EncoderShapeValue[Data13, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug13[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _], Target, `13`, `debug13(context)`, `rep13.debug(context)`, `.\n\n`](
      context: DecoderWrapperHelper[RepCol, DataCol, Wrapper]
  )(
      implicit debugShape: DecoderDebugShape.Aux[Rep13, Data13, Target, RepCol, DataCol, `13`, `debug13(context)`, `rep13.debug(context)`, `.\n\n`]
  ): DecoderShapeValue[Data13, RepCol, DataCol] = {
    val target1 = debugShape.shape.wrapRep(rep13);
    val shape1  = debugShape.shape.packed;
    new DecoderShapeValue[Data13, RepCol, DataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  def debug13[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _], Target, `13`, `debug13(context)`, `rep13.debug(context)`, `.\n\n`](
      context: FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper]
  )(
      implicit debugShape: FormatterDebugShape.Aux[
        Rep13
      , Data13
      , Target
      , RepCol
      , EncoderDataCol
      , DecoderDataCol
      , `13`
      , `debug13(context)`
      , `rep13.debug(context)`
      , `.\n\n`
    ]
  ): FormatterShapeValue[Data13, RepCol, EncoderDataCol, DecoderDataCol] = {
    val target1 = debugShape.shape.wrapRep(rep13);
    val shape1  = debugShape.shape.packed;
    new FormatterShapeValue[Data13, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = Target;
      override val rep   = target1;
      override val shape = shape1;
    }
  };
  override type TempData = CaseClassDataMapper13[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ];
};
class PropertyDataType13[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
  , Data12
  , Data13
]
class CaseClassDataMapper13[
    Data1
  , Data2
  , Data3
  , Data4
  , Data5
  , Data6
  , Data7
  , Data8
  , Data9
  , Data10
  , Data11
  , Data12
  , Data13
](
    val data1: Data1
  , val data2: Data2
  , val data3: Data3
  , val data4: Data4
  , val data5: Data5
  , val data6: Data6
  , val data7: Data7
  , val data8: Data8
  , val data9: Data9
  , val data10: Data10
  , val data11: Data11
  , val data12: Data12
  , val data13: Data13
);
object CaseClassRepMapper13 {
  implicit def caseClassHelper13EncoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , Rep12
    , Data12
    , Target12
    , Rep13
    , Data13
    , Target13
    , RepCol
    , DataCol
  ](
      implicit shape1: EncoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: EncoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: EncoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: EncoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: EncoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: EncoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: EncoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: EncoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: EncoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: EncoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
    , shape11: EncoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]
    , shape12: EncoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]
    , shape13: EncoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]
  ): EncoderShape.Aux[CaseClassRepMapper13[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
    , Rep13
    , Data13
  ], CaseClassDataMapper13[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ], CaseClassRepMapper13[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
    , Target13
    , Data13
  ], RepCol, DataCol] = {
    new EncoderShape[CaseClassRepMapper13[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
      , Rep13
      , Data13
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper13[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
        , Target13
        , Data13
      ];
      override type Data = CaseClassDataMapper13[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
        , Data13
      ];
      override def wrapRep(
          base: => CaseClassRepMapper13[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
          , Rep13
          , Data13
        ]
      ): CaseClassRepMapper13[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
        , Target13
        , Data13
      ] = {
        new CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
          , rep12 = shape12.wrapRep(base.rep12)
          , rep13 = shape13.wrapRep(base.rep13)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep14 = oldRep;
        val rep13 = shape13.buildRep(base.rep13, rep14);
        val rep12 = shape12.buildRep(base.rep12, rep13);
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper13[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
          , Data12
          , Data13
        ]
        , rep: CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ]
        , oldData: DataCol
      ): DataCol = {
        val data14 = oldData;
        val data13 = shape13.buildData(data.data13, rep.rep13, data14);
        val data12 = shape12.buildData(data.data12, rep.rep12, data13);
        val data11 = shape11.buildData(data.data11, rep.rep11, data12);
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
    }
  };
  implicit def caseClassHelper13DecoderGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , Rep12
    , Data12
    , Target12
    , Rep13
    , Data13
    , Target13
    , RepCol
    , DataCol
  ](
      implicit shape1: DecoderShape.Aux[Rep1, Data1, Target1, RepCol, DataCol]
    , shape2: DecoderShape.Aux[Rep2, Data2, Target2, RepCol, DataCol]
    , shape3: DecoderShape.Aux[Rep3, Data3, Target3, RepCol, DataCol]
    , shape4: DecoderShape.Aux[Rep4, Data4, Target4, RepCol, DataCol]
    , shape5: DecoderShape.Aux[Rep5, Data5, Target5, RepCol, DataCol]
    , shape6: DecoderShape.Aux[Rep6, Data6, Target6, RepCol, DataCol]
    , shape7: DecoderShape.Aux[Rep7, Data7, Target7, RepCol, DataCol]
    , shape8: DecoderShape.Aux[Rep8, Data8, Target8, RepCol, DataCol]
    , shape9: DecoderShape.Aux[Rep9, Data9, Target9, RepCol, DataCol]
    , shape10: DecoderShape.Aux[Rep10, Data10, Target10, RepCol, DataCol]
    , shape11: DecoderShape.Aux[Rep11, Data11, Target11, RepCol, DataCol]
    , shape12: DecoderShape.Aux[Rep12, Data12, Target12, RepCol, DataCol]
    , shape13: DecoderShape.Aux[Rep13, Data13, Target13, RepCol, DataCol]
  ): DecoderShape.Aux[CaseClassRepMapper13[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
    , Rep13
    , Data13
  ], CaseClassDataMapper13[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ], CaseClassRepMapper13[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
    , Target13
    , Data13
  ], RepCol, DataCol] = {
    new DecoderShape[CaseClassRepMapper13[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
      , Rep13
      , Data13
    ], RepCol, DataCol] {
      override type Target = CaseClassRepMapper13[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
        , Target13
        , Data13
      ];
      override type Data = CaseClassDataMapper13[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
        , Data13
      ];
      override def wrapRep(
          base: => CaseClassRepMapper13[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
          , Rep13
          , Data13
        ]
      ): CaseClassRepMapper13[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
        , Target13
        , Data13
      ] = {
        new CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
          , rep12 = shape12.wrapRep(base.rep12)
          , rep13 = shape13.wrapRep(base.rep13)
        )
      };
      override def buildRep(
          base: CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep14 = oldRep;
        val rep13 = shape13.buildRep(base.rep13, rep14);
        val rep12 = shape12.buildRep(base.rep12, rep13);
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def takeData(
          rep: CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ]
        , oldDataCol: DataCol
      ): SplitData[CaseClassDataMapper13[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
        , Data13
      ], DataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        val split11  = shape11.takeData(rep.rep11, split10.left);
        val split12  = shape12.takeData(rep.rep12, split11.left);
        val split13  = shape13.takeData(rep.rep13, split12.left);
        SplitData(
            current = new CaseClassDataMapper13(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
            , data11 = split11.current
            , data12 = split12.current
            , data13 = split13.current
          )
          , left = split13.left
        )
      };
    }
  };
  implicit def caseClassHelper13FormatterGen[
      Rep1
    , Data1
    , Target1
    , Rep2
    , Data2
    , Target2
    , Rep3
    , Data3
    , Target3
    , Rep4
    , Data4
    , Target4
    , Rep5
    , Data5
    , Target5
    , Rep6
    , Data6
    , Target6
    , Rep7
    , Data7
    , Target7
    , Rep8
    , Data8
    , Target8
    , Rep9
    , Data9
    , Target9
    , Rep10
    , Data10
    , Target10
    , Rep11
    , Data11
    , Target11
    , Rep12
    , Data12
    , Target12
    , Rep13
    , Data13
    , Target13
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ](
      implicit shape1: FormatterShape.Aux[Rep1, Data1, Target1, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[Rep2, Data2, Target2, RepCol, EncoderDataCol, DecoderDataCol]
    , shape3: FormatterShape.Aux[Rep3, Data3, Target3, RepCol, EncoderDataCol, DecoderDataCol]
    , shape4: FormatterShape.Aux[Rep4, Data4, Target4, RepCol, EncoderDataCol, DecoderDataCol]
    , shape5: FormatterShape.Aux[Rep5, Data5, Target5, RepCol, EncoderDataCol, DecoderDataCol]
    , shape6: FormatterShape.Aux[Rep6, Data6, Target6, RepCol, EncoderDataCol, DecoderDataCol]
    , shape7: FormatterShape.Aux[Rep7, Data7, Target7, RepCol, EncoderDataCol, DecoderDataCol]
    , shape8: FormatterShape.Aux[Rep8, Data8, Target8, RepCol, EncoderDataCol, DecoderDataCol]
    , shape9: FormatterShape.Aux[Rep9, Data9, Target9, RepCol, EncoderDataCol, DecoderDataCol]
    , shape10: FormatterShape.Aux[Rep10, Data10, Target10, RepCol, EncoderDataCol, DecoderDataCol]
    , shape11: FormatterShape.Aux[Rep11, Data11, Target11, RepCol, EncoderDataCol, DecoderDataCol]
    , shape12: FormatterShape.Aux[Rep12, Data12, Target12, RepCol, EncoderDataCol, DecoderDataCol]
    , shape13: FormatterShape.Aux[Rep13, Data13, Target13, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[CaseClassRepMapper13[
      Rep1
    , Data1
    , Rep2
    , Data2
    , Rep3
    , Data3
    , Rep4
    , Data4
    , Rep5
    , Data5
    , Rep6
    , Data6
    , Rep7
    , Data7
    , Rep8
    , Data8
    , Rep9
    , Data9
    , Rep10
    , Data10
    , Rep11
    , Data11
    , Rep12
    , Data12
    , Rep13
    , Data13
  ], CaseClassDataMapper13[
      Data1
    , Data2
    , Data3
    , Data4
    , Data5
    , Data6
    , Data7
    , Data8
    , Data9
    , Data10
    , Data11
    , Data12
    , Data13
  ], CaseClassRepMapper13[
      Target1
    , Data1
    , Target2
    , Data2
    , Target3
    , Data3
    , Target4
    , Data4
    , Target5
    , Data5
    , Target6
    , Data6
    , Target7
    , Data7
    , Target8
    , Data8
    , Target9
    , Data9
    , Target10
    , Data10
    , Target11
    , Data11
    , Target12
    , Data12
    , Target13
    , Data13
  ], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[CaseClassRepMapper13[
        Rep1
      , Data1
      , Rep2
      , Data2
      , Rep3
      , Data3
      , Rep4
      , Data4
      , Rep5
      , Data5
      , Rep6
      , Data6
      , Rep7
      , Data7
      , Rep8
      , Data8
      , Rep9
      , Data9
      , Rep10
      , Data10
      , Rep11
      , Data11
      , Rep12
      , Data12
      , Rep13
      , Data13
    ], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = CaseClassRepMapper13[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
        , Target13
        , Data13
      ];
      override type Data = CaseClassDataMapper13[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
        , Data13
      ];
      override def wrapRep(
          base: => CaseClassRepMapper13[
            Rep1
          , Data1
          , Rep2
          , Data2
          , Rep3
          , Data3
          , Rep4
          , Data4
          , Rep5
          , Data5
          , Rep6
          , Data6
          , Rep7
          , Data7
          , Rep8
          , Data8
          , Rep9
          , Data9
          , Rep10
          , Data10
          , Rep11
          , Data11
          , Rep12
          , Data12
          , Rep13
          , Data13
        ]
      ): CaseClassRepMapper13[
          Target1
        , Data1
        , Target2
        , Data2
        , Target3
        , Data3
        , Target4
        , Data4
        , Target5
        , Data5
        , Target6
        , Data6
        , Target7
        , Data7
        , Target8
        , Data8
        , Target9
        , Data9
        , Target10
        , Data10
        , Target11
        , Data11
        , Target12
        , Data12
        , Target13
        , Data13
      ] = {
        new CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ](
            rep1 = shape1.wrapRep(base.rep1)
          , rep2 = shape2.wrapRep(base.rep2)
          , rep3 = shape3.wrapRep(base.rep3)
          , rep4 = shape4.wrapRep(base.rep4)
          , rep5 = shape5.wrapRep(base.rep5)
          , rep6 = shape6.wrapRep(base.rep6)
          , rep7 = shape7.wrapRep(base.rep7)
          , rep8 = shape8.wrapRep(base.rep8)
          , rep9 = shape9.wrapRep(base.rep9)
          , rep10 = shape10.wrapRep(base.rep10)
          , rep11 = shape11.wrapRep(base.rep11)
          , rep12 = shape12.wrapRep(base.rep12)
          , rep13 = shape13.wrapRep(base.rep13)
        );
      };
      override def buildRep(
          base: CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ]
        , oldRep: RepCol
      ): RepCol = {
        val rep14 = oldRep;
        val rep13 = shape13.buildRep(base.rep13, rep14);
        val rep12 = shape12.buildRep(base.rep12, rep13);
        val rep11 = shape11.buildRep(base.rep11, rep12);
        val rep10 = shape10.buildRep(base.rep10, rep11);
        val rep9  = shape9.buildRep(base.rep9, rep10);
        val rep8  = shape8.buildRep(base.rep8, rep9);
        val rep7  = shape7.buildRep(base.rep7, rep8);
        val rep6  = shape6.buildRep(base.rep6, rep7);
        val rep5  = shape5.buildRep(base.rep5, rep6);
        val rep4  = shape4.buildRep(base.rep4, rep5);
        val rep3  = shape3.buildRep(base.rep3, rep4);
        val rep2  = shape2.buildRep(base.rep2, rep3);
        val rep1  = shape1.buildRep(base.rep1, rep2);
        rep1;
      };
      override def buildData(
          data: CaseClassDataMapper13[
            Data1
          , Data2
          , Data3
          , Data4
          , Data5
          , Data6
          , Data7
          , Data8
          , Data9
          , Data10
          , Data11
          , Data12
          , Data13
        ]
        , rep: CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ]
        , oldData: EncoderDataCol
      ): EncoderDataCol = {
        val data14 = oldData;
        val data13 = shape13.buildData(data.data13, rep.rep13, data14);
        val data12 = shape12.buildData(data.data12, rep.rep12, data13);
        val data11 = shape11.buildData(data.data11, rep.rep11, data12);
        val data10 = shape10.buildData(data.data10, rep.rep10, data11);
        val data9  = shape9.buildData(data.data9, rep.rep9, data10);
        val data8  = shape8.buildData(data.data8, rep.rep8, data9);
        val data7  = shape7.buildData(data.data7, rep.rep7, data8);
        val data6  = shape6.buildData(data.data6, rep.rep6, data7);
        val data5  = shape5.buildData(data.data5, rep.rep5, data6);
        val data4  = shape4.buildData(data.data4, rep.rep4, data5);
        val data3  = shape3.buildData(data.data3, rep.rep3, data4);
        val data2  = shape2.buildData(data.data2, rep.rep2, data3);
        val data1  = shape1.buildData(data.data1, rep.rep1, data2);
        data1;
      };
      override def takeData(
          rep: CaseClassRepMapper13[
            Target1
          , Data1
          , Target2
          , Data2
          , Target3
          , Data3
          , Target4
          , Data4
          , Target5
          , Data5
          , Target6
          , Data6
          , Target7
          , Data7
          , Target8
          , Data8
          , Target9
          , Data9
          , Target10
          , Data10
          , Target11
          , Data11
          , Target12
          , Data12
          , Target13
          , Data13
        ]
        , oldDataCol: DecoderDataCol
      ): SplitData[CaseClassDataMapper13[
          Data1
        , Data2
        , Data3
        , Data4
        , Data5
        , Data6
        , Data7
        , Data8
        , Data9
        , Data10
        , Data11
        , Data12
        , Data13
      ], DecoderDataCol] = {
        val dataCol0 = oldDataCol;
        val split1   = shape1.takeData(rep.rep1, dataCol0);
        val split2   = shape2.takeData(rep.rep2, split1.left);
        val split3   = shape3.takeData(rep.rep3, split2.left);
        val split4   = shape4.takeData(rep.rep4, split3.left);
        val split5   = shape5.takeData(rep.rep5, split4.left);
        val split6   = shape6.takeData(rep.rep6, split5.left);
        val split7   = shape7.takeData(rep.rep7, split6.left);
        val split8   = shape8.takeData(rep.rep8, split7.left);
        val split9   = shape9.takeData(rep.rep9, split8.left);
        val split10  = shape10.takeData(rep.rep10, split9.left);
        val split11  = shape11.takeData(rep.rep11, split10.left);
        val split12  = shape12.takeData(rep.rep12, split11.left);
        val split13  = shape13.takeData(rep.rep13, split12.left);
        SplitData(
            current = new CaseClassDataMapper13(
              data1 = split1.current
            , data2 = split2.current
            , data3 = split3.current
            , data4 = split4.current
            , data5 = split5.current
            , data6 = split6.current
            , data7 = split7.current
            , data8 = split8.current
            , data9 = split9.current
            , data10 = split10.current
            , data11 = split11.current
            , data12 = split12.current
            , data13 = split13.current
          )
          , left = split13.left
        )
      };
    }
  };
};
