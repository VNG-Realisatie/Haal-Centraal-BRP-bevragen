# coding: utf-8

"""
    Bevragingen ingeschreven personen

    API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br>   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class NaamPersoonAllOf(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'aanhef': 'str',
        'aanschrijfwijze': 'str',
        'gebruik_in_lopende_tekst': 'str',
        'aanduiding_naamgebruik': 'NaamgebruikEnum'
    }

    attribute_map = {
        'aanhef': 'aanhef',
        'aanschrijfwijze': 'aanschrijfwijze',
        'gebruik_in_lopende_tekst': 'gebruikInLopendeTekst',
        'aanduiding_naamgebruik': 'aanduidingNaamgebruik'
    }

    def __init__(self, aanhef=None, aanschrijfwijze=None, gebruik_in_lopende_tekst=None, aanduiding_naamgebruik=None, local_vars_configuration=None):  # noqa: E501
        """NaamPersoonAllOf - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._aanhef = None
        self._aanschrijfwijze = None
        self._gebruik_in_lopende_tekst = None
        self._aanduiding_naamgebruik = None
        self.discriminator = None

        if aanhef is not None:
            self.aanhef = aanhef
        if aanschrijfwijze is not None:
            self.aanschrijfwijze = aanschrijfwijze
        if gebruik_in_lopende_tekst is not None:
            self.gebruik_in_lopende_tekst = gebruik_in_lopende_tekst
        if aanduiding_naamgebruik is not None:
            self.aanduiding_naamgebruik = aanduiding_naamgebruik

    @property
    def aanhef(self):
        """Gets the aanhef of this NaamPersoonAllOf.  # noqa: E501

        De aanhef zoals die in een brief, gericht aan een persoon gebruikt kan worden.  # noqa: E501

        :return: The aanhef of this NaamPersoonAllOf.  # noqa: E501
        :rtype: str
        """
        return self._aanhef

    @aanhef.setter
    def aanhef(self, aanhef):
        """Sets the aanhef of this NaamPersoonAllOf.

        De aanhef zoals die in een brief, gericht aan een persoon gebruikt kan worden.  # noqa: E501

        :param aanhef: The aanhef of this NaamPersoonAllOf.  # noqa: E501
        :type: str
        """

        self._aanhef = aanhef

    @property
    def aanschrijfwijze(self):
        """Gets the aanschrijfwijze of this NaamPersoonAllOf.  # noqa: E501

        Samengestelde naam zoals die in communicatie met de persoon gebruikt kan worden.  # noqa: E501

        :return: The aanschrijfwijze of this NaamPersoonAllOf.  # noqa: E501
        :rtype: str
        """
        return self._aanschrijfwijze

    @aanschrijfwijze.setter
    def aanschrijfwijze(self, aanschrijfwijze):
        """Sets the aanschrijfwijze of this NaamPersoonAllOf.

        Samengestelde naam zoals die in communicatie met de persoon gebruikt kan worden.  # noqa: E501

        :param aanschrijfwijze: The aanschrijfwijze of this NaamPersoonAllOf.  # noqa: E501
        :type: str
        """

        self._aanschrijfwijze = aanschrijfwijze

    @property
    def gebruik_in_lopende_tekst(self):
        """Gets the gebruik_in_lopende_tekst of this NaamPersoonAllOf.  # noqa: E501

        De naam zoals die in lopende tekst gebruikt kan worden.  # noqa: E501

        :return: The gebruik_in_lopende_tekst of this NaamPersoonAllOf.  # noqa: E501
        :rtype: str
        """
        return self._gebruik_in_lopende_tekst

    @gebruik_in_lopende_tekst.setter
    def gebruik_in_lopende_tekst(self, gebruik_in_lopende_tekst):
        """Sets the gebruik_in_lopende_tekst of this NaamPersoonAllOf.

        De naam zoals die in lopende tekst gebruikt kan worden.  # noqa: E501

        :param gebruik_in_lopende_tekst: The gebruik_in_lopende_tekst of this NaamPersoonAllOf.  # noqa: E501
        :type: str
        """

        self._gebruik_in_lopende_tekst = gebruik_in_lopende_tekst

    @property
    def aanduiding_naamgebruik(self):
        """Gets the aanduiding_naamgebruik of this NaamPersoonAllOf.  # noqa: E501


        :return: The aanduiding_naamgebruik of this NaamPersoonAllOf.  # noqa: E501
        :rtype: NaamgebruikEnum
        """
        return self._aanduiding_naamgebruik

    @aanduiding_naamgebruik.setter
    def aanduiding_naamgebruik(self, aanduiding_naamgebruik):
        """Sets the aanduiding_naamgebruik of this NaamPersoonAllOf.


        :param aanduiding_naamgebruik: The aanduiding_naamgebruik of this NaamPersoonAllOf.  # noqa: E501
        :type: NaamgebruikEnum
        """

        self._aanduiding_naamgebruik = aanduiding_naamgebruik

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, NaamPersoonAllOf):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, NaamPersoonAllOf):
            return True

        return self.to_dict() != other.to_dict()
